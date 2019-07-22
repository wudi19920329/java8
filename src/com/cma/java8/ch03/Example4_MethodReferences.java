package com.cma.java8.ch03;

import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;

public class Example4_MethodReferences {

    public static void main(String[] args) {
        //对象引用::实例方法名
        //Consumer中的唯一抽象方法accept方法参数列表与println方法的参数列表相同，都是接收一个String类型参数。
        //Consumer<String> consumer = x -> System.out.println(x);
        Consumer<String> consumer = System.out::println;
        consumer.accept("This is Major Tom");

        //类名::静态方法名
        //Function中的唯一抽象方法apply方法参数列表与abs方法的参数列表相同，都是接收一个Long类型参数。
        //Function<Long, Long> f = x -> Math.abs(x);
        Function<Long, Long> f = Math::abs;
        Long result = f.apply(-3L);

        //类名::实例方法名
        //若Lambda表达式的参数列表的第一个参数，是实例方法的调用者，第二个参数(或无参)是实例方法的参数时，就可以使用这种方法，如
        //BiPredicate<String, String> b = (x,y) -> x.equals(y);
        BiPredicate<String, String> b = String::equals;
        b.test("abc", "abcd");
        //String是一个类而equals为该类的定义的实例方法。BiPredicate中的唯一抽象方法test方法参数列表与equals方法的参数列表相同，都是接收两个String类型参数。


        //引用构造器
        //在引用构造器的时候，构造器参数列表要与接口中抽象方法的参数列表一致,格式为 类名::new。如
        //Function<Integer, StringBuffer> fun = n -> new StringBuffer(n);
        Function<Integer, StringBuffer> fun = StringBuffer::new;
        StringBuffer buffer = fun.apply(10);

    }


}
