package Lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> list;

    public Box(T... obj) {
        list = Arrays.asList(obj);
    }

    public Box() {
        list = new ArrayList<T>();
    }

    public double getWeight() {
        double boxWeight = 0;
        for (Fruit fruit : list) {
            boxWeight += fruit.getFruitWeight();
        }
        return boxWeight;
    }

    boolean compare(Box<? extends Fruit> box) {
        return this.getWeight() == box.getWeight();
    }

    public void addFruit(T obj) {
        list.add(obj);
    }

    public List<T> getList() {
        return list;
    }

    void move(Box<T> box) {
        box.getList().addAll(list);
        list.clear();
    }
}
