package com.company;

public class SecurityGuard extends Employee{


    public void sayByRadio(){
        System.out.println("Охраннник говорит по рации");

    }

    public void doWork(){
        System.out.println("Охранник деллает работу");
        sayByRadio();
    }

    public SecurityGuard(String name, String phoneNumber) {
        super(name, phoneNumber,"Охраннник");
    }

}
