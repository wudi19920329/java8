package com.cma.java8;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Scanner;

/**
 * 堆180M
 */
public class GCHeapExample {
    public static void main(String[] args) {
        imperativeStyle();
        // functionalStyle(() -> {
        // byte[] _100MB = new byte[1024 * 1024 * 100];
        // });
    }

    public static void imperativeStyle() {
        byte[] _100MB = new byte[1024 * 1024 * 100];
        Scanner scanner = new Scanner(System.in);
        scanner.hasNext();
        System.gc();
        scanner.hasNext();
        byte[] _100MB1 = new byte[1024 * 1024 * 100];
    }

    public static void functionalStyle(MyFunctionalInterface functionalInterface) {
        functionalInterface.memoryOverlay();
        byte[] _100MB1 = new byte[1024 * 1024 * 100];
    }

    @FunctionalInterface
    interface MyFunctionalInterface {
        void memoryOverlay();
    }
}
