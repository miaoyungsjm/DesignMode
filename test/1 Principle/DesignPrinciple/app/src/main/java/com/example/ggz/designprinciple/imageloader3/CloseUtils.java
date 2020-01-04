package com.example.ggz.designprinciple.imageloader3;

import java.io.Closeable;
import java.io.IOException;

/**
 * 接口隔离原则
 *
 * */
public final class CloseUtils {
    private CloseUtils() {
    }

    public static void closeQuietly(Closeable closeable) {
        if (null != closeable) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
