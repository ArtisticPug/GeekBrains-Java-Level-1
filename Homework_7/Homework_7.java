/**
 * Java 1. Homework 7
 * 
 * @author Aleksandrov Vladimir
 * @version 28.10.2021
 */

package Homework_7;

public class Homework_7 {
    public static void main(String[] args) {

        Cat[] cats = {

            new Cat("Barsik", 10),
            new Cat("Murzik", 15),
            new Cat("Kuzya", 5),
            new Cat("Petya", 5)

        };
        
        Plate plate = new Plate(25);

        Boolean cats_satisfaction = false;

        while (cats_satisfaction != true) {

            for (Cat cat : cats) {

                cat.eat(plate);

            }

            cats_satisfaction = checkCatsFullnes(cats);

            if (cats_satisfaction == true) {

                System.out.println("All cats are full!");
                System.out.println(plate);
                break;

            } else {

                System.out.println("Some cats are still hungry!");

                for (Cat cat : cats) {
                    System.out.println(cat.getFullnes()? cat.getName() + " is full!" : cat.getName() + " is still hungry!");
                }

                System.out.println("Adding 10 more food to the plate!");
                plate.increaseFood(10);

            }
        };
    }

    static boolean checkCatsFullnes(Cat[] cats) {

        for (Cat cat : cats) if (!cat.getFullnes()) return false;
        return true;

    }
}
