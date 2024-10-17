package org.functionalprog.chainingfuncs;

import java.util.function.Function;

public class Runner {

    public static void main(String[] args) {

        int increment1 = incrementByOneFunction.apply(2);
        System.out.println(increment1);

        int increment2 =  incrementByOneFunction.apply(1);
        System.out.println(increment2);

        int multiply = multiplyBy10Function.apply(increment2);

        Function<Integer,Integer> addBy1AndThenMultiplyBy10 =
                incrementByOneFunction.andThen(multiplyBy10Function);

        System.out.println( addBy1AndThenMultiplyBy10.apply(6));

    }

    static Function<Integer,Integer> incrementByOneFunction = number -> number + 1;

    static Function<Integer,Integer> multiplyBy10Function = number -> number * 10;
}
