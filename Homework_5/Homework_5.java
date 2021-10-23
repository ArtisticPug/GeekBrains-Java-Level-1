package Homework_5;

class Homework_5 {
    public static void main(String args[]) {
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Ivanov Ivan Ivanovich", "manager", "ivanov@mail.ru", "+71112223344", 20000, 23);
        employeeArray[1] = new Employee("Petrov Petr Petrovich", "salesman", "petrov@mail.ru", "+72223334455", 21250, 20);
        employeeArray[2] = new Employee("Vasiliev Vasiliy Vasilievich", "janitor", "vasiliev@mail.ru", "+71233214587", 18000, 63);
        employeeArray[3] = new Employee("Evgeniev Evgeniy Evgenievich", "director", "evgeniev@mail.ru", "+79876543212", 40000, 33);
        employeeArray[4] = new Employee("Grigoriev Grigoriy Grigorievich", "account manager", "grigoriev@mail.ru", "+73217894532", 29000, 31);

        // Error: The field Employee.fullName is not visible
        // System.out.println(employeeArray[0].fullName);

        for (int i = 0; i < 5; i++) {
            if (employeeArray[i].getAge() > 40) {
                System.out.println(employeeArray[i]);
            }
        }

        // Error: Type mismatch: cannot convert from element type Employee to int

        // for (int i : employeeArray) {  
        //     System.out.println(employeeArray[i]);
        // }
                    
    }
}
