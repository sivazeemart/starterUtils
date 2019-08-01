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

  /*  @Autowired
    private Properties greeterProperties;
 
    @Bean
    @ConditionalOnMissingBean
    public void greeterConfig() {
 
        String userName = greeterProperties.getUrl() == null
          ? System.getProperty("test.prop.url") 
          : greeterProperties.getUrl();
System.out.println(userName);         
    }*/
    
    @Bean
    @ConditionalOnMissingBean
    public TestSample testSample() {
        return new TestSampleImpl();
    }
    
   
   
}
