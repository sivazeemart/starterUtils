package com.tutorial.starterUtil.service;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties

public class TestSampleImpl implements  TestSample{

    @Override
    public void startTest() {
        // TODO Auto-generated method stub
        System.out.println("Started by default");
    }

}
