package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticServiceTest {


    @Test
        //сумма всех продаж
    void shouldCalculate() {
        StatisticService service = new StatisticService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calculateSum(purchases);

        assertEquals(expected, actual);

    }

    @Test
        //средняя сумма продаж в месяц
    void averageAmount() {
        StatisticService service = new StatisticService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.averageAmount(purchases);

        assertEquals(expected, actual);
    }

    @Test
        //номер месяца в котором был пик продаж
    void findMax() {
        StatisticService service = new StatisticService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.findMax(purchases);

        assertEquals(expected, actual);
    }

    @Test
        //месяц в котором был минимум продаж
    void findMin() {
        StatisticService service = new StatisticService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.findMin(purchases);

        assertEquals(expected, actual);
    }

    @Test
        //продажи выше среднего
    void amountforMore() {
        StatisticService service = new StatisticService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.amountforMore(purchases);

        assertEquals(expected, actual);

    }

    @Test
        //количество месяцев ниже среднего
    void middle() {
        StatisticService service = new StatisticService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.middle(purchases);

        assertEquals(expected, actual);

    }
}