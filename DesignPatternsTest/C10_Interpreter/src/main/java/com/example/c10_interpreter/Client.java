package com.example.c10_interpreter;

public class Client {
    public static void main(String[] args) {
        Calculator calculator = new Calculator("153 + 389 + 118 - 555 - 597 - 66");
        System.out.println(calculator.calculate());
    }
}
