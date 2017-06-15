package com.raise.tel;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created @2017/6/11 15:36
 */
public class XXXHelperTest {

    @Test
    public void instanceTest() {
        XXXHelper helper = XXXHelper.getInstance();

        Assert.assertNotNull(helper);
    }
}
