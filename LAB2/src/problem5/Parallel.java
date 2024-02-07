package problem5;

public class Parallel extends Circuit{
    private double resistance1;
    private double resistance2;

    public Parallel(Circuit a, Circuit b) {
        this.resistance1 = a.getResistance();
        this.resistance2 = b.getResistance();
    }

    @Override
    public double getResistance() {
        return ((resistance1 * resistance2) / (resistance1 + resistance2));
    }

    @Override
    public double getPotentialDeff() {
        return Math.abs(resistance1 - resistance2);
    }

    @Override
    public void applyPotentialDiff(double V) {
    }
}
