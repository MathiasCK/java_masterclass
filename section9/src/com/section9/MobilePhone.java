package com.section9;

public class MobilePhone implements ITelephone {

    private boolean isOn = false;
    private boolean isRinging;
    private int number;


    public MobilePhone(int number) {
        this.isRinging = false;
        this.number = number;
    }



    public void powerOn() {
        this.isOn = true;
        System.out.println("Powering on mobile phone");
    }

    public void dial(int phoneNumber) {
        if(!this.isOn) {
            System.out.println("Phone is off cannot ring");
            return;
        }
        if(this.number == phoneNumber) {
            System.out.println("Wrong number");
            return;
        }
        System.out.println("Dialing " + phoneNumber);
    }

    public void awnser() {
        this.isRinging = false;
        System.out.println("Awnsering");
    }

    public boolean callPhone(int phoneNumber) {
        this.isRinging = true;
        return true;
    }

    public boolean isRinging() {
        return this.isRinging;
    }

}
