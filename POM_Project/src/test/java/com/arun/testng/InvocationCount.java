package com.arun.testng;

import org.testng.annotations.Test;

public class InvocationCount {

    @Test(timeOut = 1000, invocationCount = 10, successPercentage = 98)
    public void testInvocationCount() throws Exception {
        Thread.sleep(100);
        System.out.println("waitForAnswer");
    }
}