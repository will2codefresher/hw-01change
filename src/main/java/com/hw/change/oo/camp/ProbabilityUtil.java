package com.hw.change.oo.camp;

public class ProbabilityUtil {
    public static double not(double probability) {
        return (1 - probability);
    }

    public static double and(double probabilityA, double probabilityB) {
        return probabilityA * probabilityB;
    }

    public static double or(double probabilityA, double probabilityB) {
        return probabilityA + probabilityB - probabilityA * probabilityB;
    }
}
