package com.raise.tel;

import org.junit.Test;

import java.util.logging.LogManager;

/**
 * Created @2017/5/27 17:01
 */
public class LoggerTest {

    @Test
    public void testLogger() {

        LogManager manager;

        Logger logger = new MyLogger();

        logger.log("Hello");
        logger.log(this);
        logger.log("My name is %s", "Nick");

        logger.log("I am %s, from %s, %d years old!", "Nick", "China", 24);
    }
}
