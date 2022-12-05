package com.mono.di.ui;

public class BluePrinter implements Printer{
    @Override
    public void prints(String msg) {

        System.out.println("----- ColorPrinter Start -----");
        System.out.println(msg);
        System.out.println("----- ColorPrinter End -----");

    }
}
