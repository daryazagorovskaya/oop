package org.example;
// 1. Класс Phone.
//Создайте класс Phone, который содержит переменные number, model и weight. 0
// Создайте три экземпляра этого класса. Выведите на консоль значения их  переменных. 0
//Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. 0
// Выводит на консоль сообщение “Звонит {name}”. getNumber – возвращает номер телефона. 0
// Вызвать эти методы для каждого из объектов. 0
//Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса 0
// - number, model и weight. 0
//Добавить конструктор, который принимает на вход два параметра для
//        инициализации переменных класса - number, model.
//        Добавить конструктор без параметров. 0
//        Вызвать из конструктора с тремя параметрами конструктор с двумя. 0
//        Добавьте перегруженный метод receiveCall, который принимает два
//        параметра - имя звонящего и номер телефона звонящего. Вызвать этот
//        метод. 0
//        Создать метод sendMessage с аргументами переменной длины. Данный
//        метод принимает на вход номера телефонов, которым будет отправлено
//        сообщение. Метод выводит на консоль номера этих телефонов.

public class Phone {
    int number;
    String model;
    int weight;

    public Phone() { // без параметров

    }

    public Phone(String model, int number) {
        this.number = number;
        this.model = model;
    }

    public Phone(String model, int weight, int number) { // dызвать из конструктора с тремя параметрами конструктор с двумя
        this(model, weight);
        this.number = number;
    }

    public void displayInfo() {
        System.out.println("Model: " + model + " Weight: " + weight + " Number: " + number);
    }

    public int getNumber() {
        return number;
    }

    public void receiveCall(String name) {
        System.out.print("Calls " + name);

    }

    public void receiveCall(String name, int number) {
        System.out.print(" Calls " + name + " number " + number + "\n");

    }

    void sendMessage(int... number) { // varargs
        for (int i =0; i < number.length; i++){
            System.out.println("Number " + number[i]);
        }

        }


    }





