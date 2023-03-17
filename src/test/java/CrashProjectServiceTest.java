package ru.netology;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;
import ru.netolgy.CrashProjectService;

public class CrashProjectServiceTest {

    @Test
    void findMax() {
        CrashProjectService service = new CrashProjectService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxMaxInMiddle() {
        CrashProjectService service = new CrashProjectService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 50, 6, 11, 11, 12};
        long expected = 50;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }
}