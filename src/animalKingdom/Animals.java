package animalKingdom;

public abstract class Animals {

    private static int maxId = 0;
    private int id;
    private String name;
    private int year;

    public String consume() {
        return "Food";
    }

    public Animals(String name, int year) {
        this.name = name;
        this.year = year;
        id = maxId;
        maxId++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public abstract String move();

    public abstract String breathe();

    public abstract String reproduce();

}