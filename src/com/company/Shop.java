package com.company;

public class Shop {
    private String name;
    private String address;
    private Manager managee = new Manager("Oleg","086565098");
    private Kasir kasir = new Kasir("Люда","0689530054");
    private SecurityGuard securityGuard = new SecurityGuard("Дима","0680557482");
    private Client client = new Client("Влад","0976870106");


    public void Open(){
        System.out.println("Магазин открывается");
        managee.ComeToWork();
        kasir.ComeToWork();
        securityGuard.ComeToWork();

    }

    public void Dinner(){
        System.out.println("Обьявляется ОБЕД!");
        managee.ComeToDinner();
        kasir.ComeToDinner();
        securityGuard.ComeToDinner();

    }

    public void SellGoods(){
        System.out.println("Магазин начинает продавать товары");
        client.info(managee);
        client.buy(kasir);
        securityGuard.doWork();

    }


}
