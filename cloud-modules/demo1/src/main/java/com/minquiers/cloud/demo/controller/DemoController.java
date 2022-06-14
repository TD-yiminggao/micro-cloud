package com.minquiers.cloud.demo.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @ApiOperation(value = "custom entity create", notes = "param custom entity")
    @GetMapping
    public Object findAll(){
        return Arrays.asList("1","2","3").toArray();
    }

}
