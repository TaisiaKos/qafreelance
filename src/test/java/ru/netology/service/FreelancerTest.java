package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreelancerTest {
    @Test
    public void shouldCalculateFreeMonths1() {
        Freelancer freelancer = new Freelancer();

        int actual = freelancer.calculate(10_000, 3_000, 20_000);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateFreeMonths2() {
        Freelancer service = new Freelancer();

        int actual = service.calculate(100_000, 60_000, 150_000);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }
}
