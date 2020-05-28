package com.nurvadli.jax.rs.service;

import com.nurvadli.jax.rs.domain.Customer;
import org.fluttercode.datafactory.impl.DataFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Nurvadli
 */
public class CustomerService {

    private List<Customer> customerList;

    private static CustomerService ourInstance = new CustomerService();

    public static CustomerService getInstance() {
        return ourInstance;
    }

    private CustomerService() {
        customerList = new ArrayList<>();
        //creating some dummy customers
        DataFactory dataFactory = new DataFactory();
        for (int i = 1; i <= 5; i++) {
            Customer customer = new Customer();
            customer.setName(dataFactory.getName());
            customer.setAddress(dataFactory.getAddress() + ", "
                    + dataFactory.getCity());
            customer.setPhoneNumber(dataFactory.getNumberText(3) + "-" +
                    dataFactory.getNumberText(3) + "-" +
                    dataFactory.getNumberText(4));
            customerList.add(customer);
        }
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }
}
