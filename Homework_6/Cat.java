package Homework_6;

class Cat extends Animal {
    Cat(String name,String color, int age, int runLimit, int swimLimit ) {
        super(name, color, age, runLimit, swimLimit);
    }

    @Override
    public void run(int toRun) {
        if (runLimit == 0) {
            System.out.println(name + " cannot run...");
        } else if (toRun > runLimit) {
            System.out.println(name + " was able to run for only " + runLimit + "m");
        } else {
            System.out.println(name + " ran for " + toRun + "m");
        }        
    }

    @Override
    public void swim(int toSwim) {
        if (swimLimit == 0) {
            System.out.println(name + " cannot swim...");
        } else if (toSwim > swimLimit) {
            System.out.println(name + " was able to swim for only " + swimLimit + "m");
        } else {
            System.out.println(name + " swum for " + toSwim + "m");
        }        
    }
}
