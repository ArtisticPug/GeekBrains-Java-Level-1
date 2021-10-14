/**
 * Java 1. Homework 3
 * 
 * @author Aleksandrov Vladimir
 * @version 14.10.2021
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


class Homework_3 {
    public static void main(String[] args) {

        invertArray();

        oneHundredArray();

        multiplyIfLessThanSix();

        fillDiagonals();

        System.out.println(Arrays.toString(createArray(7, 4)));

        arrayMinMaxValues();

        int[] arr = { 3, 5, 6, 1 };
        int a = -1;
        int b = -2;
        int c = 1;
        int d = 2;
        arrayMover(arr, a);
        arrayMover(arr, b);
        arrayMover(arr, c);
        arrayMover(arr, d);
    }

    
    static void invertArray() {

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 0? (arr[i] = 1) : (arr[i] = 0));
        }

        System.out.println(Arrays.toString(arr));
    }


    static void oneHundredArray() {

        int[] arr = new int[100];

        for (int i = 0; i <arr.length; i++) {
            arr[i] = i + 1;
        }

        System.out.println(Arrays.toString(arr));
    }


    static void multiplyIfLessThanSix(){
        
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i <arr.length; i++) {
            arr[i] = (arr[i] < 6? (arr[i] * 2) : (arr[i]) );
        }

        System.out.println(Arrays.toString(arr));
    }


    static void fillDiagonals() {

        int[][] arr = new int[7][7];

        for (int i = 0; i < arr.length; i++) {
            for (int n = 0; n < arr[i].length; n++) {
                if (i == n || n == arr[i].length - (i + 1)) {
                    arr[i][n] = 1;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));

        }

    }


    static int[] createArray(int len, int initialValue) {
        
        int[] arr = new int[len];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }

        return arr;
    }


    // Не сразу прочитал, что нет смысла искать решение в интернете
    // и решив что мой вариант хуже, нашел такое

    // static void arrayMinMaxValues() {

    //     int[] arr = {5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 17, 14, 12};

    //     int min = Arrays.stream(arr).min().getAsInt();
    //     int max = Arrays.stream(arr).max().getAsInt();

    //     System.out.println("Min = " + min);
    //     System.out.println("Max = " + max);
    // }


    static void arrayMinMaxValues() {

        int[] arr = {5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 17, 14, 12};
        int min = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                min = arr[i];
                max = arr[i];
            } else {
                if (min > arr[i]) {
                    min = arr[i];
                } else if (max < arr[i]) {
                    max = arr[i];
                }
            }
        }

        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }


    // static void task7(){} Не выполнено. Не понял как разделить массив на "левую" и "правую" части
    

    // Выполнено с нарушением условия. Использовал "вспомогательный" list
    static void arrayMover(int[] arr, int n) {
        
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList()); 
        
        if (n == 0) {

            System.out.println(list);

        } else if (n > 0 ) {   

            for (int i = 0; i < n; i++) {

                int a = arr[arr.length - 1];
                list.remove(arr.length - 1);
                list.add(0, a);
                arr = list.stream().mapToInt(c->c).toArray();

            }                  

            System.out.println(list);

        } else {

            for (int i = 0; i < (n * -1); i++) {

                int a = arr[0];
                list.remove(0);
                list.add(a);
                arr = list.stream().mapToInt(c->c).toArray();

            }

            System.out.println(list);

        }
        
    }
}


