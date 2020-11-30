package com.company;

public class Manager extends Employee{
    private int Department;

    public void Consult(){
        System.out.println("Менеджер рассказывает о товаре");

    }

    public void TellAboutDiscounts(){
        System.out.println("Менеджер рассказывает про скидки");

    }

    public void GiveAdvice(){
        System.out.println("Менеджер дает совет");

    }

    public void doWork(){
        System.out.println("Менеджер деллает работу");
        Consult();
        TellAboutDiscounts();
        GiveAdvice();
    }

    public Manager(String name, String phoneNumber) {
        super(name, phoneNumber,"Менеджер");
    }
}
