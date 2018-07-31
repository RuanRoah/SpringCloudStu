package com.roah.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.roah.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * TODO: Add Description
 *
 * @author Roah
 * @since 07/31/2018
 */
@Service
public class TestServiceImpl implements TestService {

    @Value("${server.port}")
    String port;

    @Override
    public JSONObject test(String test) {
        String res = "我是你爸爸";
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("key",res+":"+test);
        jsonObject.put("from",port);
        return jsonObject;
    }
}
