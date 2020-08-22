package ru.netology.statistic;

public class StatisticService {
    public int calculateSum(int[] array) {
        int sum = 0;

        for (int item : array) {
            sum +=item;
        }

        return sum;
    }

    public int findMax(int[] purchases) {
        int max = purchases [0];

        for (int purchase : purchases) {
            if (max < purchase){

                max = purchase;
            }
        }

        return max;
    }

    public int findMin(int[] purchases) {
        int min = purchases [0];

        for (int purchase : purchases) {
            if (min > purchase){
                min = purchase;
            }
        }

        return min;
    }

    public int averageAmount(int[] purchases) {
        int sum = 0;

        for (int item : purchases) {
            sum +=item;
        }
        int amount = sum /12;

        return amount;



    }


}
