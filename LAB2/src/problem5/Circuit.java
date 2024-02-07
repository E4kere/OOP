package problem5;

public abstract class Circuit {
    public abstract double getResistance();
    public abstract double getPotentialDeff();
    public abstract void applyPotentialDiff(double V);

    public double getPower(){
        return (getPotentialDeff() * getPotentialDeff()) / getResistance();
    }

    public double getCurrent(){
        return getPotentialDeff() / getResistance();
    }

}
