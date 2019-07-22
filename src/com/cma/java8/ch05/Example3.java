package com.cma.java8.ch05;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.cma.java8.domain.People;

public class Example3 {
    public static void main(String[] args) {
        Map<String, List<People>> groups = Stream.of(new People("张三"), new People("李四"),
                new People("王五"), new People("张三"), new People("王五"), new People("李四"))
                .collect(Collectors.groupingBy(People::getName));
        System.out.println(groups.toString());
    }
}
