package com.learning.Laptop;

public class Desktop implements Computer{
    @Override
    public void compile() {
        System.out.println("compiling using desktop");
    }
}
