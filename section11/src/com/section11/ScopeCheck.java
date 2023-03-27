package com.section11;

public class ScopeCheck {

    public int publicVar = 0;
    private final int privateVar = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = " + privateVar + ", privateVar = " + privateVar);
    }

    public int getPrivateVar() {
        return privateVar;
    }

    public void timesTwo() {
        int privateVar = 2;
        for(int i = 0; i <= 10; i++) {
            System.out.println(i + " times 2 is " + i * privateVar);
        }
    }

    public class InnerScopeCheck {
        public int privateVar = 3;

        public InnerScopeCheck() {
            System.out.println("Inner class created privateVar =  " + privateVar);
        }

        public void timesTwo() {
            ScopeCheck.this.timesTwo();
        }
    }

    public static void main(String[] args) {

        String privateVar = "This is private to main()";

        ScopeCheck scopeCheck = new ScopeCheck();
        scopeCheck.timesTwo();

        ScopeCheck.InnerScopeCheck innerScopeCheck = scopeCheck.new InnerScopeCheck();

    }


}
