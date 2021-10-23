package Homework_5;

class Employee {
    private String fullName;
    private String post;
    private String email;
    private String phone;
    private int salary;
    private int age;

    Employee(
        String fullName,
        String post,
        String email,
        String phone,
        int salary,
        int age
        ) {
            this.fullName = fullName;
            this.post = post;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }

    String getFullName() {
        return fullName;
    }
    String getPost() {
        return post;
    }
    String getEmail() {
        return email;
    }
    String getPhone() {
        return phone;
    }
    int getSalary() {
        return salary;
    }
    int getAge() {
        return age;
    }

    public String toString() {
        return fullName + ", " + post + ", " + email + ", " + phone + ", " + salary + ", " + age;
    }
}
