package java.com.hw.change.oo.camp;

public class Chance {
    private double fraction;

    public Chance(double fraction) {
        this.fraction = fraction;
    }

    public double getFraction() {
        return fraction;
    }

    public Chance not() {
        return new Chance(1 - fraction);
    }

    public Chance and(Chance chance) {
        return new Chance(fraction * chance.getFraction());
    }

    public Chance or(Chance chance) {
        return new Chance(fraction + chance.getFraction());
    }
}
