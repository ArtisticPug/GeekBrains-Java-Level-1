package Homework_6;

interface IAnimal {
    void run(int toRun);
    void swim(int toSwim);
}

abstract class Animal implements IAnimal {
    protected String name;
    protected String color;
    protected int age;
    protected int runLimit;
    protected int swimLimit;
    static protected int animalCount;

    Animal(
        String name,
        String color,
        int age,
        int runLimit,
        int swimLimit
    ) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        animalCount = animalCount + 1;
    }

    public String toString() {
        return ("| Name: " + name +
        "\n| color: " + color +
        "\n| age: " + age +
        "\n| runLimit: " + runLimit +
        "\n| swimLimit: " + swimLimit);
    }

    int getAnimalCount() {
        return animalCount;
    }
}
