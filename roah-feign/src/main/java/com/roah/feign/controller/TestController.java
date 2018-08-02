package com.roah.feign.controller;

import com.netflix.discovery.converters.Auto;
import com.roah.feign.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO: Add Description
 *
 * @author Roah
 * @since 08/02/2018
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestService testService;
    @GetMapping("/go")
    public String test(){
        return testService.test("蛤。。。？");
    }

}
