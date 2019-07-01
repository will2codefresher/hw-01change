package com.hw.change.oo.camp;

import java.util.Objects;

public class Chance {
    private double fraction;

    public Chance(double fraction) {
        assert (fraction <= 1);
        assert (fraction >= 0);
        this.fraction = fraction;
    }

    public Chance not() {
        return new Chance(1 - fraction);
    }

    public Chance and(Chance chance) {
        return new Chance(fraction * chance.fraction);
    }

    public Chance or(Chance chance) {
        return new Chance(fraction + chance.fraction - fraction * chance.fraction);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Chance)) return false;
        Chance chance = (Chance) o;
        return Double.compare(chance.fraction, fraction) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fraction);
    }
}
