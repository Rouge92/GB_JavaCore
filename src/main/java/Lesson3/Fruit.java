package Lesson3;

public abstract class Fruit {
    private double weight;

    public Fruit(double weight) {
        this.weight = weight;
    }

    public double getFruitWeight() {
        return weight;
    }
}
