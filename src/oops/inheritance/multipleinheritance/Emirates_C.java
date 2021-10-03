package oops.inheritance.multipleinheritance;

public class Emirates_C implements CabinCrew_A, Pilot_B {

    @Override
    public void cabinCrew() {
        System.out.println("Emirates cabin crew are multiverse");

    }

    @Override
    public void pilot() {
        System.out.println("Emirates pilot are super skilled");

    }
}
