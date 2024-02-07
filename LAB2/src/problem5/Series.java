package problem5;

public class Series extends Circuit{
    private double resistance1;
    private double resistance2;
    public Series(Circuit a, Circuit b) {
        resistance1 = a.getResistance();
        resistance2 = b.getResistance();
    }

    @Override
    public double getResistance() {
        return resistance1 + resistance2;
    }

    @Override
    public double getPotentialDeff() {
        return Math.abs(resistance1 - resistance2);
    }

    @Override
    public void applyPotentialDiff(double V) {
    }
}
