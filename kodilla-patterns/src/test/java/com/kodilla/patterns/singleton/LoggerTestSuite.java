package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testGetLastLog(){
        Logger.getInstance().log("Kyle");
        String lastlog = Logger.getInstance().getLastLog();
        Assert.assertEquals("Kyle", lastlog);
    }
}
