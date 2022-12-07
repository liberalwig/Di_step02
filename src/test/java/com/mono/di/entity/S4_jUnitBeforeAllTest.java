package com.mono.di.entity;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class S4_jUnitBeforeAllTest {

    private static ApplicationContext ctx;

    @BeforeAll
    public static void beforeAllMessage() {
        ctx = new ClassPathXmlApplicationContext("classpath:config1.xml");
        System.out.println("BeforeAll.ctx : " + ctx);
    }

    @Test
    @DisplayName("springContainerTest1의 BeforeAll this 확인")
    public void springContainerTest1() {
        System.out.println("springContainerTest1 : " + this);
        System.out.println("springContainerTest1.ctx : " + ctx);
        Hello hello = ctx.getBean(Hello.class);
        hello.print("hello...");
    }

    @Test
    @DisplayName("springContainerTest1의 BeforeAll this 확인")
    public void springContainerTest2() {
        System.out.println("springContainerTest2 : " + this);
        System.out.println("springContainerTest2.ctx : " + ctx);
        Hello hello = ctx.getBean(Hello.class);
        hello.print("hello...");
    }
}