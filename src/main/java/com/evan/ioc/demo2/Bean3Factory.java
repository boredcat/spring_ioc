package com.evan.ioc.demo2;

public class Bean3Factory {

    public Bean3 createBean3(){
        System.out.println("Bean3的工厂被执行了");
        return new Bean3();
    }
}
