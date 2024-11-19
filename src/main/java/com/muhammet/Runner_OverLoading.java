package com.muhammet;

public class Runner_OverLoading {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("sum.....: "+ calculator.add(45,32));
        System.out.println("sum.....:" + calculator.add(59.6,99.9));
        calculator.add("sayıların ",4,6,9,11);
    }
}

class Calculator{
    int add(int a, int b){
        return a+b;
    }

    double add(double a, double b){
        return a+b;
    }

    double add(double a, double b, double c){
        return a+b+c;
    }

    double add(double a, double b, double c, double d){
        return a+b+c+d;
    }

    void add(String message, double ... numbers){
        double total = 0;
        for(double number : numbers){
            total += number;
        }
        System.out.println(message+ " total: " + total);
    }
}