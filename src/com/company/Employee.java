package com.company;

public class Employee extends Person{
    private String employmentDate;
    private int Salary;
    private boolean Presence;
    private final String employmenType;


    public void ComeToWork(){
        Presence = true;
        System.out.println(employmenType + " пришел на работу");
    }

    public void ComeToDinner(){
        System.out.println(employmenType + " отправился на обед");
    }

    public void doWork(){

    }

    public Employee(String name, String phoneNumber,String employmenType) {
        super(name, phoneNumber);
        this.employmenType = employmenType;
    }
}
