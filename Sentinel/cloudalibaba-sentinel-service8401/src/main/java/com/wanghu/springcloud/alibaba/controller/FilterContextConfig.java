package com.wanghu.springcloud.alibaba.controller;


import com.alibaba.csp.sentinel.adapter.servlet.CommonFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * @author wanghu
 * @date 2022/2/22 23:22
 */
public class FilterContextConfig {
//    @Bean
//    public FilterRegistrationBean sentinelFilterRegistration() {
//        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
//        registrationBean.setFilter(new CommonFilter());
//        registrationBean.addUrlPatterns("/*");
//        // 入口资源关闭聚合
//        registrationBean.addInitParameter(CommonFilter.WEB_CONTEXT_UNIFY, "false");
//        registrationBean.setName("sentinelFilter");
//        registrationBean.setOrder(1);
//
//        return registrationBean;
//    }
}
