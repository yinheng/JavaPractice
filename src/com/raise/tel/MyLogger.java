package com.raise.tel;

/**
 * Created @2017/5/27 17:03
 */
public class MyLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println(message);
    }

    @Override
    public void log(Object o) {
        System.out.println(String.valueOf(o));
    }

    @Override
    public void log(String format, Object... args) {
        System.out.println(String.format(format, args));
    }
}
