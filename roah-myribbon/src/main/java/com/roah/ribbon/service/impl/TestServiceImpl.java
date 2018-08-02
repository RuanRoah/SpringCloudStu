package com.roah.ribbon.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.roah.ribbon.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 测试方法实现
 *
 * @author Roah
 * @since 07/31/2018
 */
@Service
public class TestServiceImpl implements TestService {
    Logger logger = (Logger) LoggerFactory.getLogger(TestServiceImpl.class);
    @Autowired
    RestTemplate restTemplate;
    @Value("${server.port}")
    String port;

    @Override
    public JSONObject test(String test) {
        String res = "我是你爸爸";
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("key", res + ":" + test);
        jsonObject.put("from", port);
        return jsonObject;
    }

    @Override
    @HystrixCommand(fallbackMethod = "outError")
    public String demoTest(String test) {
        logger.debug("do");
        return restTemplate.getForObject("http://ROAH-API/test/go",String.class);
    }

    public String outError(){
        return "卧槽，崩了";
    }

}
