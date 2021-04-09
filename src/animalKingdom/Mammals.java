package animalKingdom;

public class Mammals extends Animals {

    public Mammals(String name, int year) {
        super(name, year);
    }

    @Override
    public String move() {
        return "flying";
    }

    @Override
    public String breathe() {
        return "flying";
    }

    @Override
    public String reproduce() {
        return "flying";
    }
}
