package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {



    @Test
     public void remain() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 900;

        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        Assert.assertEquals(actual,expected);
    }

    @Test
     public void remain800() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 800;

        int actual = cashbackHackService.remain(amount);
        int expected = 200;

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void remain1() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 999;

        int actual = cashbackHackService.remain(amount);
        int expected = 1;

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void remain1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual,expected);
    }
}
