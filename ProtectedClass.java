package com.example.accessmodifiers;

public class ProtectedClass extends PublicClass
 {
    public void testProtectedAccess()
 {
        System.out.println("Protected variable: " + protectedVar);
        protectedMethod();
    }
}
