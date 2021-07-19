package org.example;

public class App {
    public static void main(String[] args) {
        simpleFactorial(4);
        System.out.println(recursiveFactorial(6));

        fibonacci(12);
        System.out.println();

        splitString("Я узнал что у меня есть огромная семья", " ");

        int array[] = {1, 2, 3, 4, 5, 6, 7};
        reverseArray(array);

    }

    public static void simpleFactorial(int val) {
        int tmp = 1;
        for (int i = 1; i <= val; i++) {
            tmp = tmp * i;
        }
        System.out.println(tmp);
    }

    public static int recursiveFactorial(int val) {
        if (val <= 1) {
            return val;
        } else {
            return val * recursiveFactorial(val - 1);
        }
    }

    public static void fibonacci(int val) {
        int arr[] = new int[val];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void splitString(String str, String strPattern) {
        String[] words = str.split(strPattern);
        for (String word : words) {
            System.out.println(word);
        }
    }
}
