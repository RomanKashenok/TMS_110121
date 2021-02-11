package com.tms.interf.impl;

import com.tms.interf.Remote;

import java.util.logging.Level;
import java.util.logging.Logger;

public class WareHouseRemote implements Remote {
    Logger LOGGER = Logger.getLogger("WareHouseRemote");

    private boolean isClosed = true;

    @Override
    public void turnOn() throws InterruptedException {
        LOGGER.log(Level.INFO, "turnOn(). Closed: " + isClosed);
        if(isClosed) {
            System.out.println("Gate is closed. Trying to open. " + Thread.currentThread().getName());
            Thread.sleep(3000);
            isClosed = false;
        }
    }

    @Override
    public void turnOff() throws InterruptedException {
        LOGGER.log(Level.INFO, "turnOff(). Opened: " + !isClosed);
        if(!isClosed) {
            System.out.println("Gate is opened. Trying to close. " + Thread.currentThread().getName());
            Thread.sleep(3000);
            isClosed = true;
        }
    }
}
