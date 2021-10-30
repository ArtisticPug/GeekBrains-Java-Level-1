package Homework_7;

public class Plate {

    private int food;
    private String className;

    Plate(int amount) {

        this.food = amount;
        className = getClass().getSimpleName();

    }

    void decreaseFood(int amount) {

        if (food - amount < 0) {

            System.out.println("Not enough food!");

        } else {

            this.food -= amount;

        }
    }

    void increaseFood(int amount) {

        this.food += amount;

    }

    int getFood() {

        return food;

    }

    @Override
    public String toString() {

        return className + " contains: " + food + " units of food";
        
    }
}
