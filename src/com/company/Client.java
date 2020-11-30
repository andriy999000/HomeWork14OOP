package com.company;

public class Client extends Person {
    private int discountCard;
    private int cashAccount;

    public void info(Manager manager){
        System.out.println("Клиент узнает про товар");
        manager.doWork();
    }

    public void buy(Kasir kasir){
        System.out.println("Клиент покупает товар");
        kasir.doWork();
    }

    public Client(String name, String phoneNumber) {
        super(name, phoneNumber);
    }
}
