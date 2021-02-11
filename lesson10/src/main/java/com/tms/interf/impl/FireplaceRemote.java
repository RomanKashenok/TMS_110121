package com.tms.interf.impl;

import com.tms.interf.Remote;

import java.util.logging.Level;
import java.util.logging.Logger;

public class FireplaceRemote implements Remote {
    Logger LOGGER = Logger.getLogger("FireplaceRemote");

    private boolean isWorking = true;

    @Override
    public void turnOn() throws InterruptedException {
        LOGGER.log(Level.INFO, "turnOn(). Fireplace is turned on: " + isWorking);
        if(!isWorking) {
            System.out.println("Gate is closed. Trying to open. " + Thread.currentThread().getName());
            Thread.sleep(3000);
            isWorking = true;
        }
    }

    @Override
    public void turnOff() throws InterruptedException {
        LOGGER.log(Level.INFO, "turnOff(). Fireplace is turned off: " + !isWorking);
        if(isWorking) {
            System.out.println("Gate is opened. Trying to close. " + Thread.currentThread().getName());
            Thread.sleep(3000);
            isWorking = false;
        }
    }
}
