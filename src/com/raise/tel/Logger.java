package com.raise.tel;

/**
 * Created @2017/5/25 16:13
 */
public interface Logger {

    void log(String message);

    void log(Object o);

    void log(String format, Object... args);
}
