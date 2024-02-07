package problem5;

public class Resistor extends Circuit{
    private double V;
    public Resistor(double v) {
        V = v;
    }


    @Override
    public double getResistance() {
        return this.V;
    }

    @Override
    public double getPotentialDeff() {
        return 0;
    }

    @Override
    public void applyPotentialDiff(double V) {

    }
}
