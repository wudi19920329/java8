package com.cma.java8.ch04;

import java.text.MessageFormat;
import java.util.stream.Stream;

import com.cma.java8.domain.People;

public class Example4 {
    public static void main(String[] args) {
        Stream.of(new People("张三"), new People("李四"), new People("王五")).map(people -> {
            System.out.println("设置" + people.getName() + "的名字");
            people.setName(MessageFormat.format("{0}1", people.getName()));
            return people;
        }).forEach(people -> System.out.println(people.getName()));
    }
}
