package com.mono.di.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class S5_SingletonTest {

    private ApplicationContext ctx;

    @BeforeEach
    public void before() {
        ctx = new ClassPathXmlApplicationContext("classpath:config4.xml");
        String[] beanName = ctx.getBeanDefinitionNames();
        Arrays.stream(beanName).iterator().forEachRemaining(System.out::println);
    }

    @DisplayName("Singleton 객체 테스트")
    @Test
    public void singletonTest() {

        Hello hello1 = ctx.getBean("hello", Hello.class);
        Hello hello2 = ctx.getBean("hello", Hello.class);

        Assertions.assertSame(hello1, hello2);
        System.out.println("hello1: " + hello1 + ", hello2" + hello2);
    }


    @DisplayName("Prototype 객체 테스트")
    @Test
    public void prototypeTest() {

        Hello hello3 = ctx.getBean("protoHello", Hello.class);
        Hello hello4 = ctx.getBean("protoHello", Hello.class);

        System.out.println(hello3);
        System.out.println(hello4);

        Assertions.assertNotSame(hello3, hello4);
        System.out.println("hello3: " + hello3 + ", hello4" + hello4);
    }
}