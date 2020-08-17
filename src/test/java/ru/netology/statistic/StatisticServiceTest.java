package ru.netology.statistic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StatisticServiceTest {


    @Test
    void shouldCalculate() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatisticService service = new StatisticService();
        int actual = service.calculateSum(purchases);

        int expected = 180;
        assertEquals(expected, actual);

    }
    @Test
    void averageAmount (){
        StatisticService service = new StatisticService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.averageAmount(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void findMax() {
        StatisticService service = new StatisticService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 20;

        int actual = service.findMax(purchases);

        assertEquals(expected, actual);



    }

    @Test
    void findMin (){
        StatisticService service = new StatisticService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 7;

        int actual = service.findMin(purchases);

        assertEquals(expected, actual);
    }



//    @Test
//    viod amountforMore () {
//        StatisticService service = new StatisticService();
//
//        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
//        int expected = 7;
//
//        int actual = service.amountforMore (purchases);
//
//        assertEquals(expected, actual);
//
//    }
}