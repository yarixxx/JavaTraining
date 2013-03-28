package oop;

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

    @Before
    public void setUp() throws Exception {
        human1 = new Human(20, "Joe");
        human2 = new Human(25, "Fill");
        animal1 = new Animal(2, "cat");
        animal2 = new Animal(5, "dog");
    }

    @Test
    public void test() {
        givenItems();
    }

    private void givenItems() {
        List<Something> items = new LinkedList<Something>();
        items.add(animal1);
        items.add(animal2);
        items.add(human1);
        items.add(human2);
        differentObjects = new DifferentObjects(items);
    }
}
