package com.tms.interf.impl;

import com.tms.interf.TvRemote;

public class SamsungTvRemote implements TvRemote {

    private int channel = 1;

    @Override
    public void mute() {
        System.out.println("Samsung Tv mutted!");
    }

    @Override
    public void unMute() {
        System.out.println("Samsung Tv unmutted!");
    }

    @Override
    public void channelUp() {
        System.out.println("Samsung current channel: " + ++channel);
    }

    @Override
    public void channelDown() {
        System.out.println("Samsung current channel: " + --channel);
    }

    @Override
    public void turnOn() {
        System.out.println("Samsung Tv is turning on!!!");
    }

    @Override
    public void turnOff() {
        System.out.println("Samsung Tv is turning off!!!");
    }

    public void samsungPersonalFunction() {
        System.out.println("This is samsung personal function!");
    }

    @Override
    public void specialFunction() {
        System.out.println("Samsung PERSONAL special function!!!!!!!!**************");
    }
}
