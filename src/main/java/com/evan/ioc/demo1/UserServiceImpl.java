package com.evan.ioc.demo1;

public class UserServiceImpl implements UserServeice{

    private String name;

    @Override
    public void sayHello() {
        System.out.println("Hello World" + name );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
