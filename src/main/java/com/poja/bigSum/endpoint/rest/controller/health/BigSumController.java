package com.poja.bigSum.endpoint.rest.controller.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
public class BigSumController {

    @GetMapping("/big-sum")
    public BigInteger BigSum(@RequestParam BigInteger a, @RequestParam BigInteger b) {
        return a.add(b);
    }
}
