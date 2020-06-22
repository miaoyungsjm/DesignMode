package com.example.iterator.test;

import static com.example.iterator.test.AbstractHandler.HANDLER_LEVEL_ONE;

public class Request1 extends AbstractRequest {

    public Request1(Object obj) {
        super(obj);
    }

    @Override
    public int getRequestLevel() {
        return HANDLER_LEVEL_ONE;
    }
}
