package com.iphayao.demo;

public class Client {
    private Service service;

    public Client(Service service) {
        this.service = service;
    }

    public String greet() {
        return "Hello " + service.getName();
    }
}
