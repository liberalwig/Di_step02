package com.mono.di.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class S3_jUnitBeforeEachTest {

    private ApplicationContext ctx;

    @BeforeEach
    public void BeforeEachMessage1() {
        ctx = new ClassPathXmlApplicationContext("classpath:config1.xml");
        System.out.println("BeforeEach.this: " + this);
        System.out.println("BeforeEachMessage context : " + ctx);
    }

    @Test
    @DisplayName("springContainerTest1의 BeforeEach this 확인")
    public void springContainerTest1() {
        System.out.println("==================================================================");
        System.out.println("springContainerTest1.this : " + this);
        System.out.println("springContainerTest1.ctx : " + ctx);
        System.out.println("==================================================================");
        Hello hello = ctx.getBean(Hello.class);
        hello.print("hello...");
    }

    @Test
    @DisplayName("springContainerTest2의 BeforeEach this 확인")
    public void springContainerTest2() {
        System.out.println("==================================================================");
        System.out.println("springContainerTest2.this : " + this);
        System.out.println("springContainerTest2.ctx : " + ctx);
        System.out.println("==================================================================");
        Hello hello = ctx.getBean(Hello.class);
        hello.print("hello...");
    }
}
