package com.dileshwory.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CharacterEncodingFilter;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Application  extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

//    @Bean
//    public FilterRegistrationBean encodingFilter() {
//        CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter("UTF-8", true);
//        FilterRegistrationBean filterRegBean = new FilterRegistrationBean();
//        filterRegBean.setUrlPatterns(getRootPathUrls());
//        filterRegBean.setFilter(encodingFilter);
//        filterRegBean.setOrder(1);
//        return filterRegBean;
//    }
//
//    private List<String> getRootPathUrls() {
//        List<String> urlPatterns = new ArrayList<String>();
//        urlPatterns.add("/*");
//        return urlPatterns;
//    }

}
