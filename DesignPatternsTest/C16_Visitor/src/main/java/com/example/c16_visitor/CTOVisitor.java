package com.example.c16_visitor;

/**
 * @author ggz
 * @date 2020/7/10
 */
public class CTOVisitor implements Visitor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师: " + engineer.name + ", Line: " + engineer.getCodeLine());
    }

    @Override
    public void visit(Manger manger) {
        System.out.println("经理: " + manger.name + ", Products: " + manger.getProducts());
    }
}
