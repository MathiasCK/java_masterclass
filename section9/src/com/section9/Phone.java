package com.section9;

public class Phone implements ITelephone {

    private boolean isRinging;
    private int number;


    public Phone(int number) {
        this.isRinging = false;
        this.number = number;
    }


    public void powerOn() {
        System.out.println("Powering on phone");
    }

    public void dial(int phoneNumber) {
        System.out.println("Dialing " + phoneNumber);
    }

    public void awnser() {
        this.isRinging = false;
        System.out.println("Awnsering");
    }

    public boolean callPhone(int phoneNumber) {
        return true;
    }

    public boolean isRinging() {
        return this.isRinging;
    }

}
