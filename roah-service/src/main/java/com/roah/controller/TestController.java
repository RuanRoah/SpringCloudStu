package com.roah.controller;

import com.alibaba.fastjson.JSONObject;
import com.roah.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO: Add Description
 *
 * @author Roah
 * @since 07/31/2018
 */
@RestController
@RequestMapping("/roah")
public class TestController {
    @Autowired
    TestService testService;
    @PostMapping("/test")
    public JSONObject Test(@RequestBody String test){
        return testService.test(test);
    }

}
