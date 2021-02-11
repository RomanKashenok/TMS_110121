package com.tms.interf;

public interface TvRemote extends Remote {

    void mute();
    void unMute();
    void channelUp();
    void channelDown();

    default void specialFunction() {
        System.out.println("Special function FROM TvRemote activated!!!");
    }

}
