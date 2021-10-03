package oops.inheritance.hybridInheritance;

public class Emirates_D extends Airplane_A implements CabinCrew_B, Pilot_C {

    @Override
    public void cabinCrew() {
        System.out.println("Emirates cabin crew are multiverse");

    }

    @Override
    public void pilot() {
        System.out.println("Emirates pilot are super skilled");

    }
}
