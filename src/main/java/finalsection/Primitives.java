package finalsection;

import java.util.function.BiFunction;

public class Primitives {
    public static void main(String[] args) {

        // take the following 2 scenarios
        Integer number = null;
//        int counter = null; // this is wrong because it's a primitive type.
        int counter = 0;

        // So because of the above reason we are not allowed to have primitives in this
        // Functional definition.


        System.out.println(upperCaseNameBi.apply("chamal",15));
    }

    // That's why because by any change if we are passing null for these
    // BiFunctions(or other types) it should have the ability to handle those.
    static BiFunction<String,Integer,String> upperCaseNameBi = (name, age) ->{
        if(name.isBlank()) throw new IllegalArgumentException("");
        System.out.println(age);
        return name.toUpperCase();
    };

    // If I am defining this outside the main() it should have to be static since inside this
    // class main() is static. If you define this BiFunction inside main() it should not
    // have to be static.
}
