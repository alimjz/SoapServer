package com.source;

import jakarta.jws.WebService;

@WebService(endpointInterface = "com.source.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

    public String sayHelloWorld(String content) {
        return "Hello " + content;
    }
}
