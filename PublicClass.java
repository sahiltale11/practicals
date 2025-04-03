package com.example.accessmodifiers;

public class PublicClass 
{
    public int publicVar = 10;
    protected int protectedVar = 20;
    int defaultVar = 30;
    private int privateVar = 40;

    public void publicMethod() 
{
        System.out.println("Public method");
    }

    protected void protectedMethod()
 {
        System.out.println("Protected method");
    }

    void defaultMethod()
 {
        System.out.println("Default method");
    }

    private void privateMethod()
 {
        System.out.println("Private method");
    }
}



