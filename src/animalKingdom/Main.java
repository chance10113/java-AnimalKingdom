package animalKingdom;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<Animals> filterAnimals(List<Animals> myList, Animaltester tester) {
        List<Animals> tempList = new ArrayList<>();
        for (Animals a : myList) {
            if (tester.test(a)) {
                tempList.add(a);
            }
        }
        return tempList;
    }

    public static void main(String[] args) {

        List<Animals> animalsArrayList = new ArrayList<>();

        animalsArrayList.add(new Mammals("Panda", 1869));
        animalsArrayList.add(new Mammals("Zebra", 1778));
        animalsArrayList.add(new Mammals("Koala", 1816));
        animalsArrayList.add(new Mammals("Sloth", 1804));
        animalsArrayList.add(new Mammals("Armadillo", 1758));
        animalsArrayList.add(new Mammals("Raccoon", 1758));
        animalsArrayList.add(new Mammals("Bigfoot", 2021));

        animalsArrayList.add(new Birds("Pigeon", 1837));
        animalsArrayList.add(new Birds("Peacock", 1821));
        animalsArrayList.add(new Birds("Toucan", 1758));
        animalsArrayList.add(new Birds("Parrot", 1824));
        animalsArrayList.add(new Birds("Swan", 1758));

        animalsArrayList.add(new Fish("Salmon", 1758));
        animalsArrayList.add(new Fish("Catfish", 1817));
        animalsArrayList.add(new Fish("Perch", 1758));

        List<Animals> animals = new ArrayList<>();

        // print all the animals in descending order by year named
        animals.sort((a1, a2) -> a2.getYear() - a1.getYear());
        animals.forEach((animal) -> System.out.println(animal));
        System.out.println();

        // List all the animals alphabetically
        animals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        animals.forEach((animal) -> System.out.println(animal));
        System.out.println();

        // List all the animals order by how they move
        animals.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        animals.forEach((animal) -> System.out.println(animal));
        System.out.println();

        // List only those animals the breath with lungs
        List<Animals> withLungList = filterAnimals(animals, (a) -> a.breathe() == "lungs");
        withLungList.forEach((a) -> System.out.println(a));
        System.out.println();

        // List only those animals that breath with lungs and were named in 1758
        List<Animals> lungs1758 = filterAnimals(withLungList, (a) -> a.getYear() == 1758);
        lungs1758.forEach((a) -> System.out.println(a));
        System.out.println();

        // List only those animals that lay eggs and breath with lungs
        List<Animals> eggsLungsList = filterAnimals(withLungList, (a) -> a.reproduce() == "eggs");
        eggsLungsList.forEach((a) -> System.out.println(a));
        System.out.println();

        // List alphabetically only those animals that were named in 1758
        List<Animals> year1758Animals = filterAnimals(animals, (a) -> a.getYear() == 1758);
        year1758Animals.forEach((a) -> System.out.println(a));
    }
}
