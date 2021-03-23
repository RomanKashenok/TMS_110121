package com.tms.opt;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Optional;
import java.util.Random;

public class LotteryService {

    private final Random rand = new Random();

    public Optional<Prize> playLottery(int num) {
        return num > rand.nextInt(100) && num < rand.nextInt(100)
                ? Optional.of(Prize.builder().name(RandomStringUtils.randomAlphabetic(10)).amount(rand.nextDouble() * 100).build())
                : Optional.empty();
    }

}
