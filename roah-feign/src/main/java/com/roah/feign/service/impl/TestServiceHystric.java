package com.roah.feign.service.impl;

import com.roah.feign.service.TestService;
import org.springframework.stereotype.Component;

/**
 * TODO: Add Description
 *
 * @author Roah
 * @since 08/02/2018
 */
@Component
public class TestServiceHystric implements TestService {

    @Override
    public String test(String test) {
        return "Oh,NO!";
    }
}
