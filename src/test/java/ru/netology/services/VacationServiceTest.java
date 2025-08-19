package ru.netology.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class VacationServiceTest {

    @Test
    void testCalculateExample1() {
        VacationService service = new VacationService();

        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 3;

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testCalculateExample2() {
        VacationService service = new VacationService();

        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 2;

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testCalculateNoVacation() {
        VacationService service = new VacationService();

        int income = 5_000;
        int expenses = 4_000;
        int threshold = 50_000;
        int expected = 0;

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testCalculateNoVacationPossible() {
        VacationService service = new VacationService();

        // Низкий доход, высокие траты, высокий порог
        int income = 5_000;
        int expenses = 4_000;
        int threshold = 100_000;
        int expected = 0; // никогда не достигнем порога

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}