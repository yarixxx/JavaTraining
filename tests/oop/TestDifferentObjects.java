package oop;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestDifferentObjects {

    private DifferentObjects differentObjects;
    private Human human1;
    private Human human2;
    private Animal animal1;
    private Animal animal2;
    private List<Animal> animals;
    private List<Human> humans;

    @Before
    public void setUp() throws Exception {
        human1 = new Human(20, "Joe");
        human2 = new Human(25, "Fill");
        animal1 = new Animal(2, "cat");
        animal2 = new Animal(5, "dog");
    }

    @Test
    public void testGetAnimals() {
        givenItems();
        whenGetAnimals();
        thenListWithCatAndDogRetrieved();
    }

    @Test
    public void testGetHumans() {
        givenItems();
        whenGetHumans();
        thenListWithJoeAndFillRetrieved();
    }

    private void givenItems() {
        List<Something> items = new LinkedList<Something>();
        items.add(animal1);
        items.add(animal2);
        items.add(human1);
        items.add(human2);
        differentObjects = new DifferentObjects(items);
    }

    private void whenGetAnimals() {
        animals = differentObjects.getAnimals();
    }

    private void whenGetHumans() {
        humans = differentObjects.getHumans();
    }

    private void thenListWithCatAndDogRetrieved() {
        assertTrue(animals.contains(animal1));
        assertTrue(animals.contains(animal2));
        assertFalse(animals.contains(human1));
        assertFalse(animals.contains(human2));
    }

    private void thenListWithJoeAndFillRetrieved() {
        assertFalse(humans.contains(animal1));
        assertFalse(humans.contains(animal2));
        assertTrue(humans.contains(human1));
        assertTrue(humans.contains(human2));

    }
}
