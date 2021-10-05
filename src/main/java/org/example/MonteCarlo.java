package org.example;
import java.util.Random;

import static java.lang.Math.sqrt;

public class MonteCarlo {
    static void calculatePi(int n) {
        Random rand = new Random();
        int m = 0;
        for (int i = 0; i < n - 1; i++) {
            double x_double_random = rand.nextDouble();
            double y_double_random = rand.nextDouble();
            if(y_double_random <= sqrt(1 -  Math.pow(x_double_random, 2))) {
                m = m + 1;
            }
        }
        System.out.println(4 * m);
        System.out.println(n);
        double pi = ((double) (4 * m)) / n;
        System.out.println(pi);

    }

    public static void main(String[] args) {
        int n = 1000000;
        calculatePi(n);

    }
}
