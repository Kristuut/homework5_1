package ru.netology.statistic;

public class StatisticService {
    public int calculateSum(int[] array) {
        int sum = 0;

        for (int item : array) {
            sum += item;
        }

        return sum;
    }

    public int findMin(int[] purchases) {
        int monthNumber = 0;
        int min = purchases[0];
        for (int i = 1; i < purchases.length; i++) {
            int count = purchases[i];
            if (min <= count) {
                min = count;
                monthNumber = i + 1;
            }
        }
        return monthNumber;

    }

    public int averageAmount(int[] purchases) {
        int sum = 0;

        for (int item : purchases) {
            sum += item;
        }
        int amount = sum / 12;

        return amount;


    }

    public int findMax(int[] purchases) {
        int monthNumber = 0;
        int max = purchases[0];
        for (int i = 1; i < purchases.length; i++) {
            int count = purchases[i];
            if (max <= count) {
                max = count;
                monthNumber = i + 1;
            }
        }
        return monthNumber;
    }

    public int amountforMore(int[] purchases) {
        int monthCount = 0;
        int medSum = averageAmount(purchases);
        for (int arr : purchases) {
            if (arr > medSum) {
                monthCount++;
            }
        }
        return monthCount;
    }

    public int middle(int[] purchases) {
        int monthCount = 0;
        int medSum = averageAmount(purchases);
        for (int arr : purchases) {
            if (arr < medSum) {
                monthCount++;
            }
        }
        return monthCount;

    }

}
