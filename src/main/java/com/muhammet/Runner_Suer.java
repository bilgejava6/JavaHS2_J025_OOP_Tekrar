package com.muhammet;

public class Runner_Suer {
    public static void main(String[] args) {
        Car car = new Car();
        car.display();
    }
}

class Vehicle{
    String brand = "Opel";
}
class Car extends Vehicle{
    String model = "Mokka";

    /**
     * super() -> miras alınan sınıfın constructor ı
     * super -> bu da miras alınan sınıfın nesne referansıdır
     */
    public void display(){
        System.out.println("Brand: " + super.brand);
        System.out.println("Model: " + model);
    }
}
