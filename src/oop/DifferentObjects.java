package oop;

import java.util.LinkedList;
import java.util.List;

public class DifferentObjects {
    List<Something> items;

    DifferentObjects(List<Something> items) {
        this.items = items;
    }

    List<Human> getHumans() {
        List<Human> humans = new LinkedList<Human>();
        for (Something item : items) {
            if (item.getClass().getName() == "oop.Human") {
                humans.add((Human) item);
            }
        }
        return humans;
    }

    List<Animal> getAnimals() {
        List<Animal> animals = new LinkedList<Animal>();
        for (Something item : items) {
            if (item.getClass().getName() == "oop.Animal") {
                animals.add((Animal) item);
            }
        }
        return animals;
    }
}
