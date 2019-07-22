package com.cma.java8.ch03;

import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Example3_FunctionalInterfaces {

    public static void main(String[] args) {

        Predicate<String> nameStartWithS = name -> name.startsWith("s");

        Consumer<String> sendEmail = message -> System.out.println("Sending email >> " + message);

        Function<String, Integer> stringToLength = name -> name.length();

        Supplier<String> uuidSupplier = () -> UUID.randomUUID().toString();

    }
}
