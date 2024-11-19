package com.muhammet;

public class Runner_Constructor {
    public static void main(String[] args) {
        Person person = new Person("Muhammet", 41);

        person.display();
    }
}

class Person{
    String name;
    int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.println("Person name: " + name);
        System.out.println("Person age: " + age);
    }
}