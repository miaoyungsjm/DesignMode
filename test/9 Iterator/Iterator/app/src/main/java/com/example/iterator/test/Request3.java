package com.example.iterator.test;

import static com.example.iterator.test.AbstractHandler.HANDLER_LEVEL_THREE;

public class Request3 extends AbstractRequest {

    public Request3(Object obj) {
        super(obj);
    }

    @Override
    public int getRequestLevel() {
        return HANDLER_LEVEL_THREE;
    }
}
