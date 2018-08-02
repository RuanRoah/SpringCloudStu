package com.roah.feign.service;

import com.roah.feign.service.impl.TestServiceHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 接口接口接口
 *
 * @author Roah
 * @since 08/02/2018
 */
@FeignClient(value = "roah-api", fallback = TestServiceHystric.class)
public interface TestService {
    @RequestMapping(value = "/test/go", method = RequestMethod.GET)
    String test(@RequestParam(value = "test") String test);
}
