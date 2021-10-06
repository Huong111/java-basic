package Day3;

import java.util.Arrays;

public class Array {
    public static void main(String args[]) {
        SumOfArray();
        averageOfArray();
        printEven();
        searchNumber();
        findGreatestSmallest();
//        countMultiples();
        checkEquality();
        checkEquality2();
    }

    //        Write a Java program to calculate sum values of an array.
    public static void SumOfArray() {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of all the elements of an array: " + sum);
    }

    // Write a Java  program to calculate average of  values of  an array.
    public static void averageOfArray() {
        int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++)
            sum = sum + numbers[i];
        double average = sum / numbers.length;
        System.out.println("Average value of the array elements is : " + average);
    }

    //   Write a Java program to print even and odd numbers in an array.
    public static void printEven() {
        int num;
        int arr[] = {12, 23, 34, 45, 56, 67, 78, 89, 91};
        System.out.println("\nEven number of the array:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("\nOdd number of the array:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    //    Write a Java program to find missing number in an array.
    public static void searchNumber() {
        int total_num;
        int[] numbers = new int[]{1, 2, 3, 4, 6, 7};
        total_num = 7;
        int expected_num_sum = total_num * ((total_num + 1) / 2);
        int num_sum = 0;
        for (int i : numbers) {
            num_sum += i;
        }
        System.out.print(expected_num_sum - num_sum);
    }

    //    Write a program to find greatest and smallest element in an array.
    public static void findGreatestSmallest() {
        int arr[] = new int[]{12, 56, 76, 89, 100, 343, 21, 234};
        int smallest = arr[0];
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest)
                largest = arr[i];
            else if (arr[i] < smallest)
                smallest = arr[i];
        }
        System.out.println("Smallest Number is : " + smallest);
        System.out.println("Largest Number is : " + largest);
    }

    //    Write a program count multiples of a number in an array.
//    public static void countMultiples() {
//        int arr[] = new int[]{4, 7, 3, 8, 12, 15};
//        for ( int i = 1; i <= arr.length; i++) {
//            if (arr[i] % 3 == 0 || arr[i] % 5 == 0) {
//                System.out.println(arr[i]);
//            }
//        }
//    }
//Write a program to check equality of arrays.
    public static void checkEquality() {
        int[] arr1 = new int[]{20, 5, -95, 43, 17};
        int[] arr2 = new int[]{20, 5, -95, 43, 17};
        System.out.println(Arrays.equals(arr1, arr2));
    }

    //Write a program to check equality of arrays use for loop
    public static void checkEquality2() {
        int[] arrayOne = {2, 5, 1, 7, 4};

        int[] arrayTwo = {2, 5, 1, 7, 4};
        boolean equalOrNot = true;
        if (arrayOne.length == arrayTwo.length) {
            for (int i = 0; i < arrayOne.length; i++) {
                if (arrayOne[i] != arrayTwo[i]) {
                    equalOrNot = false;
                }
            }
        } else {
            equalOrNot = false;
        }
        if (equalOrNot) {
            System.out.println("Two Arrays Are Equal");
        } else {
            System.out.println("Two Arrays Are Not equal");
        }
    }

    //    Add two matrices using 2 dimensional array
    public static void matrixAddition() {
        int a[][] = {{1, 3, 4}, {2, 4, 3}, {3, 4, 5}};
        int b[][] = {{1, 3, 4}, {2, 4, 3}, {1, 2, 4}};
        int c[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}