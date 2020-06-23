package com.example.c10_interpreter;

/**
 * 运算符号解释器（非终结符号）
 * 为所有运算符号解释器共性的提取
 */
public abstract class OperatorExpression extends ArithmeticExpression {
    /**
     * 声明两个成员变量存储运算符号两边的数字解释器
     */
    protected ArithmeticExpression exp1;
    protected ArithmeticExpression exp2;

    public OperatorExpression(ArithmeticExpression exp1, ArithmeticExpression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }
}
