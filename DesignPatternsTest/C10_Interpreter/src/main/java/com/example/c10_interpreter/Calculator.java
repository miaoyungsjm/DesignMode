package com.example.c10_interpreter;

import java.util.Stack;

/**
 * 处理与解释相关的业务
 */
public class Calculator {
    /**
     * 声明一个 Stack 栈存储并操作所有相关的解释器
     */
    private Stack<ArithmeticExpression> mExpStack = new Stack<ArithmeticExpression>();

    public Calculator(String expression) {
        // 存储运算符左右两边的数字解释器
        ArithmeticExpression exp1, exp2;
        // 根据空格分割表达式字符串
        String[] elements = expression.split(" ");

        // 循环遍历表达式元素数组
        for (int i = 0; i < elements.length; i++) {
            // 判断运算符号
            switch (elements[i].charAt(0)) {
                case '+':
                    // 将栈中的解释器弹出作为运算符号左边的解释器
                    exp1 = mExpStack.pop();
                    // 同时将运算符号数组下标下一个元素构造为数字解释器
                    exp2 = new NumExpression(Integer.valueOf(elements[++i]));
                    // 通过上面两个数字解释器构造加法运算解释器
                    mExpStack.push(new AdditionExpression(exp1, exp2));
                    break;
                case '-':
                    exp1 = mExpStack.pop();
                    exp2 = new NumExpression(Integer.valueOf(elements[++i]));
                    mExpStack.push(new SubrractionExpression(exp1, exp2));
                    break;
                default:    // 数字
                    // 直接构造数字解释器并压入栈
                    mExpStack.push(new NumExpression(Integer.valueOf(elements[i])));
                    break;
            }
        }
    }

    /**
     * 计算结果
     */
    public int calculate() {
        return mExpStack.pop().interpret();
    }
}
