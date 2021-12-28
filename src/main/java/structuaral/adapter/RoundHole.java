package structuaral.adapter;

public class RoundHole {
    double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    boolean fits(RoundPeg roundPeg){
        return this.radius>=roundPeg.getRadius();
    }
}
