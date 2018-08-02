package com.roah.ribbon.controller;

/**
 * TODO: Add Description
 *
 * @author Roah
 * @since 07/31/2018
 */

import com.roah.ribbon.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping("/go")
    public String test(@RequestParam String test){
        return testService.demoTest(test);
    }
    @GetMapping("/testgo")
    public String testgo(){
        String test = "test";
        return testService.demoTest(test);
    }

    @GetMapping("/gotest")
    public @ResponseBody  String gotest(){
        String test = "test";
        return testService.test(test).toString();
    }
}
