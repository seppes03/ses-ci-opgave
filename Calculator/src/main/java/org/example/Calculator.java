package org.example;

public class Calculator {

    private double sum;
    public Calculator(double a, double b){
        this.sum = sum(a,b);
        System.out.println("Som is " + String.valueOf(sum));
    }

    public double getSum() {
        return sum;
    }

    public double sum(double a, double b){
        return a + b;
    }
}
