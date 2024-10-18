package org.functionalprog.biconsumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Runner {

    public static void main(String[] args) {

        Customer2 maria = new Customer2("Maria", "879887988");

        System.out.println("Normal Function output");
        greetCustomer(maria);

        System.out.println("Normal function with 2 arguments");
        greetCustomerv2(maria,false);

        System.out.println("Consumer output");
        greetCustomerConsumer.accept(maria);

        System.out.println("BiConsumer output");
        greetCustomerConsumerv2.accept(maria,false);
    }

    static void greetCustomer(Customer2 customer){
        System.out.println("Hello " + customer.customer2Name
                +" thanks for registering phone number "
                + customer.customer2PhoneNumber);
    }

    static void greetCustomerv2(Customer2 customer, Boolean showPhoneNumber){
        System.out.println("Hello " + customer.customer2Name
                +" thanks for registering phone number "
                + (Boolean.TRUE.equals(showPhoneNumber) ? customer.customer2PhoneNumber : "******"));
    }

    static Consumer<Customer2> greetCustomerConsumer = customer -> {
        System.out.println("Hello " + customer.customer2Name
                +" thanks for registering phone number "
                + customer.customer2PhoneNumber);
    };

    static BiConsumer<Customer2,Boolean> greetCustomerConsumerv2
            = (customer,showPhoneNumber) -> {
        System.out.println("Hello " + customer.customer2Name
                +" thanks for registering phone number "
                + (Boolean.TRUE.equals(showPhoneNumber) ? customer.customer2PhoneNumber : "******"));
    };

    static class Customer2{
        public Customer2(String customer2Name, String customer2PhoneNumber) {
            this.customer2Name = customer2Name;
            this.customer2PhoneNumber = customer2PhoneNumber;
        }

        private final String customer2Name;
        private final String customer2PhoneNumber;
    }

}
