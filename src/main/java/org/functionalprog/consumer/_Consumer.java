package org.functionalprog.consumer;

import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {

        // Normal java function.
        Customer maria = new Customer("Maria", "879887988");
        greetCustomer(maria);

        // Consumer Functional Interface
        greetCustomerConsumer.accept(maria);
    }

    // imperative way of approaching this task.
    static void greetCustomer(Customer customer){
        System.out.println("Hello " + customer.customerName
                +" thanks for registering phone number "
                + customer.customerPhoneNumber);
    }

    // consumer way of approaching this task.
    // void is like a Consumer.
    static Consumer<Customer> greetCustomerConsumer = customer -> {
        System.out.println("Hello " + customer.customerName
                +" thanks for registering phone number "
                + customer.customerPhoneNumber);
    };


    static class Customer{
        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }

        private final String customerName;
        private final String customerPhoneNumber;
    }


}
