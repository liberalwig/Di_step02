package com.mono.di.ui;

public class MonoPrinter implements Printer{
    @Override
    public void print(String msg) {

        System.out.println("----- ColorPrinter Start -----");
        System.out.println(msg);
        System.out.println("----- ColorPrinter End -----");

    }
}
