package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @Test
    void NumberSqrt() {

        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.sqr(200, 300);

        assertEquals(expected, actual);
    }
        @Test
        void NumberSqrtLimitValue() {

            SQRService service = new SQRService();
            int expected = 6;
            int actual = service.sqr(200, 400);

            assertEquals(expected, actual);
    }
}