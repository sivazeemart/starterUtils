package com.tutorial.starterUtil.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tutorial.starterUtil.service.TestSample;
import com.tutorial.starterUtil.service.TestSampleImpl;

@Configuration
@ConditionalOnClass(TestSample.class)
public class AutoConfig {

    @Bean
    @ConditionalOnMissingBean
    public TestSample testSample() {
        return new TestSampleImpl();
    }

}
