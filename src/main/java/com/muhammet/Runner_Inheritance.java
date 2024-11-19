package com.muhammet;

public class Runner_Inheritance {
    public static void main(String[] args) {
//        Animal animal = new Animal();
//        animal.sound();
//
//        Dog dog = new Dog();
//        dog.sound();
//        dog.name = "Boncuk";
//        System.out.println("köpeğin adı...: "+ dog.name);
       Dog dog = new  Dog();
       dog.sound();
    }
}
/**
 * DİKKAT!!!!!
 * bir java file içerisinde birden fazla sınıf barındırılabilir ve kullanılabilir
 * ayrıca bir java class içerisinde inner class olabilir ve kodlanabilir.
 */
class Animal{
    String name;
    public void sound(){
        System.out.println("I am animal");
    }
}
class Dog extends Animal{
    public void sound(){
        System.out.println("I am dog");
    }
}



