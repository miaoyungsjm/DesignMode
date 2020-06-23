package com.example.c10_interpreter;

public class SubrractionExpression extends OperatorExpression {

    public SubrractionExpression(ArithmeticExpression exp1, ArithmeticExpression exp2) {
        super(exp1, exp2);
    }

    @Override
    public int interpret() {
        return exp1.interpret() - exp2.interpret();
    }
}
