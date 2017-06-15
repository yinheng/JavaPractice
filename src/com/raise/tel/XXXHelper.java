package com.raise.tel;

/**
 * Created @2017/6/11 15:29
 */
public class XXXHelper {

    private XXXHelper() {
    }

    private static XXXHelper sOnlyOne = new XXXHelper();

    public static XXXHelper getInstance() {
        return sOnlyOne;
    }
}
