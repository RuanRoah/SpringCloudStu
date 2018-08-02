package com.roah.feign.service;

import com.roah.feign.service.impl.TestServiceHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * TODO: Add Description
 *
 * @author Roah
 * @since 08/02/2018
 */
@FeignClient(value = "service-hi",fallback = TestServiceHystric.class)
public interface TestService {
    public String test(@RequestParam String test);
}
