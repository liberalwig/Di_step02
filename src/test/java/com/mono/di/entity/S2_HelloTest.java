package com.mono.di.entity;

import com.mono.di.entity.Hello;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

class S2_HelloTest {
    @DisplayName("Container를 사용한 객체주입(Di)")
    @ParameterizedTest
    @ValueSource(strings = {"config1.xml","config2.xml","config3.xml","config3-1.xml","config4.xml"})
    public void springContainerTest(String resourceFileName){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:" + resourceFileName); // 좌 인터, 우 구현

        String[] beanName = ctx.getBeanDefinitionNames();
        Arrays.stream(beanName).iterator().forEachRemaining(System.out::println);

        com.mono.di.entity.Hello hello = ctx.getBean("hello" , Hello.class);

        hello.print("hello...");
    }
}