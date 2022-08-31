package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class CashbackHackServiceTest {

    @Test
    void remain() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 900;

        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        assertEquals(actual,expected);
    }

    @Test
    void remain800() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 800;

        int actual = cashbackHackService.remain(amount);
        int expected = 200;

        assertEquals(actual,expected);
    }

    @Test
    void remain1() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 999;

        int actual = cashbackHackService.remain(amount);
        int expected = 1;

        assertEquals(actual,expected);
    }

    @Test
    void remain1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(actual,expected);
    }
}