package com.example.accessmodifiers;

// Public class with different access modifiers
public class CombinedAccessModifiers {
    public int publicVar = 10;
    protected int protectedVar = 20;
    int defaultVar = 30;
    private int privateVar = 40;

    public void publicMethod() {
        System.out.println("Public method");
    }

    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    void defaultMethod() {
        System.out.println("Default method");
    }

    private void privateMethod() {
        System.out.println("Private method");
    }

    // Nested subclass that extends the main class
    static class ProtectedClass extends CombinedAccessModifiers {
        public void testProtectedAccess() {
            System.out.println("Protected variable: " + protectedVar);
            protectedMethod();
        }
    }

    // Main method to test access
    public static void main(String[] args) {
        CombinedAccessModifiers obj = new CombinedAccessModifiers();
        System.out.println("Public variable: " + obj.publicVar);
        obj.publicMethod();

        ProtectedClass protectedClass = new ProtectedClass();
        protectedClass.testProtectedAccess();
    }
}
