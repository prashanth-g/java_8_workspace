package com.prashanth;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Optional01 {
    public static void main(String[] args) {
        List<Customer> customers = Arrays.asList(new Customer(1, "Alexa"),
                new Customer(2, "DialogFlow"));
        System.out.println(customerNameById(customers, 2));
    }

    static String customerNameById(List<Customer> customerList, int customerId) {
        Optional<Customer> opt = customerList.stream()
                .filter(c -> c.getId() == customerId)
                .findFirst();
        return opt.map(Customer::getName).orElse("UNKNOWN");
    }

    private static class Customer {

        int id;
        String name;

        Customer(int id, String name){
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
