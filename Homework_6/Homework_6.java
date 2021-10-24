/**
 * Java 1. Homework 6
 * 
 * @author Aleksandrov Vladimir
 * @version 24.10.2021
 */

package Homework_6;
public class Homework_6 {
    public static void main(String args[]) {
        Cat cat1 = new Cat("Barsik", "Black", 3, 50, 0);
        Dog dog1 = new Dog("Sharik", "Gray", 5, 150, 20);
        Cat cat2 = new Cat("Myakush", "Black", 2, 60, 5);
        Dog dog2 = new Dog("Bobik", "White", 3, 100, 25);

        dog1.run(50);
        dog1.swim(30);
        cat1.run(100);
        cat1.swim(25);
        cat2.run(60);
        cat2.swim(5);
        dog2.run(110);
        dog2.swim(25);

        System.out.println("Number of animals: " + cat1.getAnimalCount());
    }
}
