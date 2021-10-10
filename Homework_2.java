/**
 * Java 1. Homework 2
 * 
 * @author Aleksandrov Vladimir
 * @version 10.10.2021
 */
class Homework_2 {
    public static void main(String[] args) {
        System.out.println(checkSum(15, 10));
        checkNumber(5);
        System.out.println(isNumberNegative(-5));
        stringNTimes("Hello world!", 5);
        // System.out.println(isLeapYear(1804));
        System.out.println(isLeapYear(2024));
    }

    static boolean checkSum(int a, int b) {
        return (a + b >= 10 && a + b <= 20);
    }

    static void checkNumber(int a) {
        System.out.println(a >= 0? "Число положительное" : "Число отрицательное");
    }

    static boolean isNumberNegative(int a) {
        return a < 0;
    }

    static void stringNTimes(String a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(a);
        }
    }

    static boolean isLeapYear(int a) {
        return (a%4 == 0 || a%400 != 0 && a%400 == 0);
    }
}