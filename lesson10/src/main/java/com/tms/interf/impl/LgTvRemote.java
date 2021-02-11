package com.tms.interf.impl;

import com.tms.interf.TvRemote;

public class LgTvRemote implements TvRemote {

    private int channel = 1;

    @Override
    public void mute() {
        System.out.println("LG Tv mutted!");
    }

    @Override
    public void unMute() {
        System.out.println("LG Tv unmutted!");
    }

    @Override
    public void channelUp() {
        System.out.println("LG current channel: " + ++channel);
    }

    @Override
    public void channelDown() {
        System.out.println("LG current channel: " + --channel);
    }

    @Override
    public void turnOn() {
        System.out.println("LG Tv is turning on!!!");
    }

    @Override
    public void turnOff() {
        System.out.println("LG Tv is turning off!!!");
    }
}
