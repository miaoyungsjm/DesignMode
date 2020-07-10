package com.example.c16_visitor;

/**
 * @author ggz
 * @date 2020/7/9
 */
public interface Visitor {
    void visit(Engineer engineer);

    void visit(Manger manger);
}
