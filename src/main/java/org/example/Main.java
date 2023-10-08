package org.example;

public class Main {
    public static void main(String[] args) {
        Phone iphone = new Phone("Iphone13", 170, 7651234);
        Phone samsung = new Phone("S23", 160, 7863968);
        Phone xiaomi = new Phone("Mi10C", 150, 3957935);

        iphone.displayInfo();
        samsung.displayInfo();
        xiaomi.displayInfo();

        iphone.receiveCall("Dan");
        iphone.getNumber();
        samsung.receiveCall("Bob");
        samsung.getNumber();
        xiaomi.receiveCall("Jan");
        xiaomi.getNumber();

        iphone.receiveCall("Ken", iphone.number);
        samsung.receiveCall("Steve", samsung.number);
        xiaomi.receiveCall("Jonh", xiaomi.number);

        iphone.sendMessage(7651234, 7863968, 3957935);
        samsung.sendMessage(7651234, 7863968, 3957935);
        xiaomi.sendMessage(7651234, 7863968, 3957935);












    }
}