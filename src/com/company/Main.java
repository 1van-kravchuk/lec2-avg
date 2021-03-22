package com.company;

public class Main {

    public static void main(String[] args) {
        int myArray[] = {2, 3, 1, 7, 11};
        double avg = 0;
        double sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
            avg = sum/myArray[i];
        }
        System.out.println(avg);
    }
}

