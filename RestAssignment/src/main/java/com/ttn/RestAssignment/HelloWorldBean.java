package com.ttn.RestAssignment;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldBean
{
    public HelloWorldBean() {
    }

    public HelloWorldBean(String message) {
        super();
        this.message=message;
    }
    private  String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "message='" + message + '\'' +
                '}';
    }


}
