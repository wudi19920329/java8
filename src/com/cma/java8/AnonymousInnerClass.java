package com.cma.java8;

public interface AnonymousInnerClass {
    void doSomething();
}

class Test {
    public static void main(String[] args) {
        AnonymousInnerClass innerClass = new AnonymousInnerClass() {
            @Override public void doSomething() {
                System.out.println("Hello AnonymousInnerClass!");
            }
        };
        innerClass.doSomething();
    }
}
