package ru.netology.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FreelancerTest {

    @Test
    void shouldCalculateFreeMonths1() {
        Freelancer service = new Freelancer();

        int actual = service.calculate(income: 10_000; expenses: 3_000; threshold: 20_000);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateFreeMonths2() {
        Freelancer service = new Freelancer();

        int actual = service.calculate(income: 100_000; expenses: 60_000; threshold: 150_000);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }
}
