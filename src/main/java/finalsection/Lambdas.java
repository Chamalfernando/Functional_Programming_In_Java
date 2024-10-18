package finalsection;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {

    public static void main(String[] args) {


//        Function<String,String> upperCaseName = name -> name.toUpperCase();
        Function<String,String> upperCaseName = String::toUpperCase;


//        Function<String , String> upperCaseName2 = name -> {
//            // logic
//            if(name.isBlank()) throw new IllegalArgumentException("");
//            return name.toUpperCase();
//        };

        BiFunction<String,Integer,String> upperCaseNameBi = (name,age) ->{
            if(name.isBlank()) throw new IllegalArgumentException("");
            System.out.println(age);
            return name.toUpperCase();
        };

        System.out.println(upperCaseName.apply("chamalfido"));
        System.out.println(upperCaseNameBi.apply("chamal",15));
    }
}
