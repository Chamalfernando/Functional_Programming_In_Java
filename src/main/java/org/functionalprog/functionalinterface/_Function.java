package org.functionalprog.functionalinterface;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment = incrementByOne(1);
        System.out.println("Imperative Ans");
        System.out.println(increment);

        System.out.println("Declarative Ans");
        int increment2 =  incrementByOneFunction.apply(2);
        System.out.println(increment2);
    }

    // imperative approach example
    static int incrementByOne(int number){
        return number + 1;
    }

    // declarative approach
    static Function<Integer,Integer> incrementByOneFunction = number -> number + 1; // <1>



}
