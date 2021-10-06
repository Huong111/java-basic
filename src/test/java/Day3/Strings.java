package Day3;

import java.util.Scanner;

public class Strings {
    public static void main(String args[]) {
        reverseNumber();
        CountOccurences();
        intToString();
        stringToInt();
        SwapStrings();
        checkPalindrome();
        testStringComparison();
        concatenate();
        checkLength();
        substring();
        uppercase();
        lowercase();
    }

    //    Write a Java program to reverse a string.
    public static void reverseNumber() {
        StringBuffer a = new StringBuffer("Tran Thi My Huong");
        System.out.println(a.reverse());
    }

    //    Write a Java program to count number of time a character repeated in a string.
    public static void CountOccurences() {
        String input = "aaaabbccAAdd";
        char search = 'a';
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == search)
                count++;
        }
        System.out.println("The Character '" + search + "' appears " + count + " times.");
    }

    //    Write a Java program to convert integer to string.
    public static void intToString() {
        int c = 1234;
        String str3 = String.valueOf(c);
        System.out.println("String str3 = " + str3);
    }

    //    Write a Java program to convert string to integer.
    public static void stringToInt() {
        String s = "200";
        Integer i = Integer.valueOf(s);
        System.out.println(i);
    }

    //    Write a Java program to Swap the 2 strings.
    public static void SwapStrings() {
        String s1 = "Apple";
        String s2 = "Banana";
        System.out.printf("Before Swapping s1 = %s and s2 = %s.\n", s1, s2);
        String temp = s1;
        s1 = s2;
        s2 = temp;
        System.out.printf("After Swapping s1 = %s and s2 = %s.\n", s1, s2);
    }

    //    Write a program to check a string is palindrome or not
    public static void checkPalindrome() {
        String str, rev = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        str = sc.nextLine();
        int length = str.length();
        for (int i = length - 1; i >= 0; i--)
            rev = rev + str.charAt(i);
        if (str.equals(rev))
            System.out.println(str + " is a palindrome");
        else
            System.out.println(str + " is not a palindrome");
    }

    //Write a java program to compare two strings, ignoring case differences.
    public static void testStringComparison() {
        String s1 = "Sachin";
        String s2 = "SACHIN";
        System.out.println(s1.equalsIgnoreCase(s2));
    }

    //Write a Java program to concatenate a given string to the end of another string.
    public static void concatenate() {
        String str1 = "PHP Exercises and ";
        String str2 = "Python Exercises";
        String str3 = str1.concat(str2);
        System.out.println("The concatenated string: " + str3);
    }

    //    Write a java program to get the length of a given string
    public static void checkLength() {
        String str = "example.com";
        int len = str.length();
        System.out.println("The string length of '" + str + "' is: " + len);
    }

    //Write a Java program to get a substring of a given string between two specified positions
    public static void substring() {
        String str = "The quick brown fox jumps over the lazy dog.";
        String new_str = str.substring(10, 26);
        System.out.println("old = " + str);
        System.out.println("new = " + new_str);
    }

    //    Write a Java program to convert all the characters in a string to uppercase.
    public static void uppercase() {
        String str = "The Quick BroWn FoX!";
        String upper_str = str.toUpperCase();
        System.out.println("Original String: " + str);
        System.out.println("String in uppercase: " + upper_str);
    }

    //    Write a Java program to convert all the characters in a string to lowercase.
    public static void lowercase() {
        String str = "The Quick BroWn FoX!";
        String lowerStr = str.toLowerCase();
        System.out.println("Original String: " + str);
        System.out.println("String in lowercase: " + lowerStr);
    }
}
