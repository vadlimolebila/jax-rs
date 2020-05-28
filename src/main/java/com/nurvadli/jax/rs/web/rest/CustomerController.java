package com.nurvadli.jax.rs.web.rest;

import com.nurvadli.jax.rs.domain.Customer;
import com.nurvadli.jax.rs.service.CustomerService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * @author Nurvadli
 */
@Path("customers")
public class CustomerController {

    private CustomerService customerDataService = CustomerService.getInstance();

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Customer> getCustomers () {
        return customerDataService.getCustomerList();
    }
}
