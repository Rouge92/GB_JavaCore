package Lesson3;

import java.util.Arrays;
import java.util.Random;

public class FruitBoxApp {
    public static void main(String[] args) {
        Random random = new Random(); //для рандомного числа фруктов в коробке
        int rMin = 1;
        int rMax = 20;
        int diff = rMax - rMin;
        int ran = random.nextInt(diff + 1) + rMin;
        Box<Orange> orangeBox1 = new Box();
        Box<Apple> appleBox1 = new Box();
        Box<Apple> appleBox2 = new Box();
        for (int i = 0; i < ran; i++) {
            orangeBox1.addFruit(new Orange());
        }
        for (int i = 0; i < ran - 3; i++) {
            appleBox1.addFruit(new Apple());
        }
        System.out.println("В коробке апельсинов " + orangeBox1.getWeight() + " кг фруктов.");
        System.out.println("В коробке1 яблок " + appleBox1.getWeight() + " кг фруктов.");
        System.out.println("Равенство коробок - " + orangeBox1.compare(appleBox1));
        appleBox1.move(appleBox2);
        System.out.println("В коробке2 яблок " + appleBox2.getWeight() + " кг фруктов.");
        System.out.println("В коробке1 яблок " + appleBox1.getWeight() + " кг фруктов.");
//////////////////////////////////////////////////
        String[] fruits = {"apple", "orange", "coconut"};
        System.out.println(Arrays.toString(fruits));
        swapper(fruits, 1, 2);
        System.out.println(Arrays.toString(fruits));

    }

    private static <T> void swapper(T[] array, int i1, int i2) {
        T buf = array[i1];
        array[i1] = array[i2];
        array[i2] = buf;
    }
}

