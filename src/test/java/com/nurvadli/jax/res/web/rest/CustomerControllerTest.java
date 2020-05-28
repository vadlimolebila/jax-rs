package com.nurvadli.jax.res.web.rest;

import com.nurvadli.jax.rs.web.rest.CustomerController;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;

import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.Application;

/**
 * @author Nurvadli
 */
public class CustomerControllerTest extends JerseyTest {

    @Override
    protected Application configure() {
        return new ResourceConfig(CustomerController.class);
    }

    @Test
    public void customerRestServiceTest() {
        Invocation.Builder request = target("customers").request();
        String response = request.get(String.class);
        System.out.println(response);

    }
}
