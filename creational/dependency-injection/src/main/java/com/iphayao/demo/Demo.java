package com.iphayao.demo;

public class Demo {
    public static void main(String[] args) {
        Service service = new ExampleService();

        Client client = new Client(service);

        System.out.println(client.greet());

    }
}
