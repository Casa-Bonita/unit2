package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
        // проверка, что тест работает, условие выполняется
    void shouldReturn100IfAmountIs900() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;

        int actual = cashbackHackService.remain(amount);
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
        // проверка пограничного значения minimum
    void shouldReturn999IfAmountIs1() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1;

        int actual = cashbackHackService.remain(amount);
        int expected = 999;
        assertEquals(expected, actual);
    }

    @Test
        // проверка пограничного значения maximum (оно же minimum для следующего диапазона)
    void shouldReturn0IfAmountIs1000() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }


}