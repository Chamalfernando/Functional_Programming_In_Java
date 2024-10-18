package org.functionalprog.predicates;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        System.out.println("imperative way");
        System.out.println("07000000000");
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println("0700000000");
        System.out.println(isPhoneNumberValid("0700000000"));
        System.out.println("09000472839");
        System.out.println(isPhoneNumberValid("09000472839"));

        System.out.println("functional way");
        System.out.println("07000000000");
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println("0700000000");
        System.out.println(isPhoneNumberValidPredicate.test("0700000000"));
        System.out.println("09000472839");
        System.out.println(isPhoneNumberValidPredicate.test("09000472839"));

        System.out.println(
                "is phone number valid and contains number 3 = "+
                isPhoneNumberValidPredicate.and(containsNumber3).test("09000472839")
        );

        System.out.println(
                "is phone number valid and contains number 3 = "+
                isPhoneNumberValidPredicate.or(containsNumber3).test("07000000000")
        );

    }

    // imperative way
    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    // declarative way
    static Predicate<String> isPhoneNumberValidPredicate =
            phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber3 =
            phoneNumber -> phoneNumber.contains("3");
}
