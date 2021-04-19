package com.tts;

public class Calculator {
    public double add(double num1,double num2){
        return  num1+num2;
    }
    public double subtract(double num1,double num2){
        return  num1-num2;
    }
    public double multiplication (double num1,double num2){
        return  num1*num2;
    }
    public double division (double num1,double num2){
        return  num1/num2;
    }
    public double square(double num){
        return  num*num;
    }


}

class MagicCalculator extends  Calculator{
    public double sqrt(double num){
        return  Math.sqrt(num);
    }
    public double sin(double num){
        return  Math.sin(num);
    }
    public double cosine(double num){
        return  Math.cos(num);
    }
    public double tangent (double num){
        return  Math.tan(num);
    }
    public int factorial  (int num){
        if (num <= 2) {
            return num;
        }
        return num * factorial(num - 1);
    }

    public static void main(String[] args) {
        MagicCalculator myCalculator=new MagicCalculator();
        System.out.println(myCalculator.factorial(5));

    }
}


