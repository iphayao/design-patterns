package com.iphayao.demo;

import org.junit.Test;

import static org.junit.Assert.*;

public class DemoTest {
    @Test
    public void testDependencyInjectionInClientWithEampleService() {
        Service service = new ExampleService();
        Client client = new Client(service);

        assertEquals("Hello Example Service", client.greet());
    }

}