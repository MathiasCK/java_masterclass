package com.section11;

public  class Password {

    private static final int key = 78492;
    private final int encryptedPassword;

    public Password(int password) {
        this.encryptedPassword = encryptDecrypt(password);
    }

    private int encryptDecrypt(int password) {
        return password ^ key;
    }

    public final void storePassword() {
        System.out.println("Saving password as " + this.encryptedPassword);
    }

    public boolean letMeIn(int password) {
        if(encryptDecrypt(password) == encryptedPassword) {
            System.out.println("Welcome!");
            return true;
        }
        System.out.println("Access denied");
        return false;
    }

    public static void main(String[] args) {

        ExtendedPassword password = new ExtendedPassword(1122334411);
        password.storePassword();

    }
}
