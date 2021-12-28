package structuaral.adapter;
/*
*
* Adapter pattern
* 1. Client(Main): The class uses objects that have interface target
* 2. Adaptee(SquarePeg): Incompatible interface definition which needs to be integrated
* 3. Adapter(SquarePegAdapter): The integrated place, it helps incompatible to interface integrate with the working interface
* 3. Target: This is the interface that exist in system. The interface containing the functions used by the client.
*
* */
public class Main {
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(10);
        RoundPeg roundPeg = new RoundPeg(4);
        System.out.println(String.format("Compare round hole and round peg. %s - %s", roundHole.getRadius(), roundPeg.getRadius()));
        System.out.println(roundHole.fits(roundPeg));

        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(new SquarePeg(5));
        System.out.println(String.format("Compare round hole and square peg. %s - %s", roundHole.getRadius(), squarePegAdapter.getRadius()));
        System.out.println(roundHole.fits(squarePegAdapter));

        squarePegAdapter = new SquarePegAdapter(new SquarePeg(20));
        System.out.println(String.format("Compare round hole and square peg. %s - %s", roundHole.getRadius(), squarePegAdapter.getRadius()));
        System.out.println(roundHole.fits(squarePegAdapter));
    }
}
