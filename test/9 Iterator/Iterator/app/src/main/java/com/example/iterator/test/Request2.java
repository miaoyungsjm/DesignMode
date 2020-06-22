package com.example.iterator.test;

import static com.example.iterator.test.AbstractHandler.HANDLER_LEVEL_TWO;

public class Request2 extends AbstractRequest {

    public Request2(Object obj) {
        super(obj);
    }
    
    @Override
    public int getRequestLevel() {
        return HANDLER_LEVEL_TWO;
    }
}
