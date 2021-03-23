package com.tms.opt;

import java.util.Optional;
import java.util.Scanner;

public class LotteryRunner {
    public static void main(String[] args) {
        boolean exit = false;

        Scanner sc = new Scanner(System.in);
        LotteryService ls = new LotteryService();

        System.out.println("Player 1 choose number: ");
//        int num = sc.nextInt();

        Optional<Prize> prize = ls.playLottery(45);
        prize.ifPresent(System.out::println);

        String prizeName = prize
                .map(p -> p.getName())
                .orElseThrow(() -> new IllegalArgumentException("Вы ввели неверные данные"));

        while (!exit) {
            System.out.println("Choose operation");
            System.out.println("1. Get record from DB");
            System.out.println("2. Write record to DB");
        }

    }
}
