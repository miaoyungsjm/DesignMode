package com.example.c9_iterator.demo;

import static com.example.c9_iterator.demo.AbstractHandler.HANDLER_LEVEL_THREE;

/**
 * @author ggz
 * @date 2020/6/27
 */
public class Request extends AbstractRequest {

    public Request(Object obj) {
        super(obj);
    }

    @Override
    public int getRequestLevel() {
        return HANDLER_LEVEL_THREE;
    }
}
