package ru.netology.sqr;

public class SQRService {
    public int calcSQR(int start, int ending) {
        int counter = 0;
        for (int i = 10; i < 100; i++) {
            if (i*i >= start & i*i <= ending) {
                counter++;
            }
        }
        return counter;
    }
}
