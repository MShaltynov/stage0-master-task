package com.epam.langSyntax;

public class DigitsSumCalculator {



    public void calculateSum(int number) {
        int first = number / 1000;
        int second =(number%1000)/100;
        int third=(number%100)/10;
        int forth =number%10;
        int finalSum = first + second + third + forth;
        System.out.println(finalSum);

    }
}
