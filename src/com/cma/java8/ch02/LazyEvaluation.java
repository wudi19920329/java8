package com.cma.java8.ch02;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.function.Supplier;

/**
 * @author wudih
 * @date 2019/7/22 14:28
 * @since 7.5.0
 */
public class LazyEvaluation {

    static boolean compute(String str) {
        System.out.println("executing...");
        // expensive computation here
        return str.contains("a");
    }

    static String eagerMatch(boolean b1, boolean b2) {
        return b1 && b2 ? "match" : "incompatible!";
    }

    static String lazyMatch(Supplier<Boolean> a, Supplier<Boolean> b) {
        return a.get() && b.get() ? "match" : "incompatible!";
    }

    public static void main(String[] args) {
        System.out.print(eagerMatch(compute("bb"), compute("aa")));
        // System.out.println(lazyMatch(() -> compute("bb"), () -> compute("aa")));
    }
}
