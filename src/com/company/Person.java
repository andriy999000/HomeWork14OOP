package com.company;

public class Person {
    private String name;
    private String phoneNumber;
    private String DateBirth;

    public void sayHello(){
        System.out.println("Привет");
    }

    public void sayBye(){
        System.out.println("До Cвидания");
    }

    public Person(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}
