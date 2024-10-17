package org.functionalprog.bifunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Runner {
    public static void main(String[] args) {

        // Function takes 1 argument and produces 1 result
        int increment = incrementByOne(1);
        System.out.println(increment);

        // Function that takes 2 arguments and produces 1 result
        System.out.println("Function with 2 arguments Result");
        System.out.println(incrementByOneAndMultiply(4,100));

        // BiFunction takes 2 arguments and produces 1 result
        System.out.println("BiFunction Result");
        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4,100));
    }

    static int incrementByOne(int number){
        return number + 1;
    }

    static int incrementByOneAndMultiply(int number,int numToMultiplyBy){
        return (number + 1) * numToMultiplyBy;
    }

    static BiFunction<Integer,Integer,Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne,numberToMultiplyBy)
                    -> (numberToIncrementByOne + 1) * numberToMultiplyBy;

}
