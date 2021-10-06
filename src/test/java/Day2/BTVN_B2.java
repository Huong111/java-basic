package Day2;

import java.util.Scanner;

public class BTVN_B2 {
    public static void main(String arg[]) {
        MaxNumber();
        Check(-2, -30, -900);
        Multiplication_table();
        count();
        Reverse_number();
        Check_Palindrome_number();
    }

    //Write a Java program to get a number from the user and print whether it is positive or negative
    public static void MaxNumber() {
        int x;
        Scanner number = new Scanner(System.in);
        System.out.println("Nhập vào một số: ");
        x = number.nextInt();
        number.close();
        if (x > 0) {
            System.out.println(x + "là số dương ");
        } else if (x < 0) {
            System.out.println(x + "là số âm ");
        } else {
            System.out.println(x + "không phải số âm hoặc số dương");
        }
    }

    //Write a Java program to find greatest of 3 numbers.
    public static void Check(int x, int y, int z) {
        int Number_max = Math.max(Math.max(x, y), z);
        System.out.println("Số lớn nhất là: " + Number_max);
    }

    //    Write a Java to display the multiplication table of a given integer using for loop.
    public static void Multiplication_table() {
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "x" + j + "=" + i * j);
            }
            System.out.println();
        }
    }

    //Write a Java program count the number of digits of the number using while loop.
    public static void count() {
        int v_count = 0, number = 12345;
        while (number != 0) {
            number /= 10;
            v_count++;
        }
        System.out.println("có : " + v_count + "số");
    }

    //    Write a Java program to reverse a number using while loop.
    public static void Reverse_number() {
        int num = 1234, reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("Số đảo ngược của là:" + reversed);
    }

    //Write a Java program to check Number is Palindrome or not using while loop.
    public static void Check_Palindrome_number() {
        int i = 2;
        int num = 3;
        boolean isPrime=true;
        while (i <= num / 2) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }
        if(isPrime)
            System.out.println(num + " Là số nguyên tố!");
        else
            System.out.println(num + " Không phải là số nguyên tố!");
    }
}
