package combinatordesignpattern;

import java.time.LocalDate;

import static combinatordesignpattern.CustomerRegistrationValidator.*;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer(
                "Alice",
                "aliceinw@onderland.net",
                "+03475893749",
                LocalDate.of(2000,1,1)
        );

        CustomerValidatorService validatorService = new CustomerValidatorService();
//        validatorService.isValid(customer);

        System.out.println(new CustomerValidatorService().isValid(customer));

        // if valid we can store customer in a db later on.


        // using combinator design pattern

//        CustomerRegistrationValidator
//                .isEmailValid()
//                .and(CustomerRegistrationValidator.isPhoneNumberValid())
//                .and(CustomerRegistrationValidator.isAnAdult())
//                .apply(customer);

        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAnAdult())
                .apply(customer);

        // This is lazy. None of these stuff run until we invoke .apply() method.
//        isEmailValid()
//                .and(isPhoneNumberValid())
//                .and(isAnAdult())
//                .apply(customer);

        System.out.println(result);

        if(result != ValidationResult.SUCCESS){
            throw new IllegalStateException(result.name());
        }

    }
}
