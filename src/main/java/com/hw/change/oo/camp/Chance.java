package com.hw.change.oo.camp;

public class Chance {
    private double fraction;

    public Chance(double fraction) {
        assert (fraction <= 1);
        assert (fraction >= 0);
        this.fraction = fraction;
    }

    public double getFraction() {
        return fraction;
    }

    public Chance not() {
        return new Chance(ProbabilityUtil.not(fraction));
    }

    public Chance and(Chance chance) {
        return new Chance(ProbabilityUtil.and(fraction, chance.getFraction()));
    }

    public Chance or(Chance chance) {
        return new Chance(ProbabilityUtil.or(fraction, chance.getFraction()));
    }
}
