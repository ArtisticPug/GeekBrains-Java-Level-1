package Homework_7;

public class Cat {

    private String name;
    private int appetite;
    private Boolean fullnes;

    Cat(String name, int appetite) {

        this.name = name;
        this.appetite = appetite;
        fullnes = false;

    }

    void eat(Plate plate) {
        
        if (fullnes != true) {

            if (plate.getFood() - appetite < 0) {

                System.out.println(name + " requires more food!");

            } else {

                System.out.println(name + " ate " + appetite + " food!");
                plate.decreaseFood(appetite);
                fullnes = true;

            }
        }        
    }

    boolean getFullnes() {

        return fullnes;

    }

    String getName() {
        return name;
    }

    @Override
    public String toString() {

        return "Cat: " + name + ", eat: " + appetite;

    }
}
