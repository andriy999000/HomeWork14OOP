package com.company;

public class Kasir extends Employee{
    private int numCard;



    public void СountMoney(){
        System.out.println("Касир подсчитывает деньги");
    }

    public void doWork(){
        System.out.println("Касир деллает работу");
        СountMoney();

    }
    public Kasir(String name, String phoneNumber) {
        super(name, phoneNumber,"Касир");
    }


}

