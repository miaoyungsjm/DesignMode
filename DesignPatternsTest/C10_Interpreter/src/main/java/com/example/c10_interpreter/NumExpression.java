package com.example.c10_interpreter;

/**
 * 数字解释器（终结符号）
 * 仅仅为了解释数字
 */
public class NumExpression extends ArithmeticExpression {
    private int num;

    public NumExpression(int num) {
        this.num = num;
    }

    @Override
    public int interpret() {
        return num;
    }
}
