package com.roah.api.controller;

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
    @GetMapping("/go")
    public String test(){
        return "蛤？";
    }
}
