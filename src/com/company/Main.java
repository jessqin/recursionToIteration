package com.company;
/**
 * Created by kids on 1/19/2017.
 */
import java.util.*;
public class Main {

    public static void main(String[] args) {
        System.out.println("Howdy, please put in a Fibonacci number:");
        Scanner input = new Scanner(System.in);
        try {
            int num = input.nextInt();
            Fibonacci(num, 0, 1);
        } catch (Exception e) {
            System.out.println("This ain't fib.");
            System.exit(0);
        }
    }

    private static ArrayList<Integer> saveNum = new ArrayList<>();
    private static void Fibonacci(int n, int a, int b)
    {
        while (true)
        {
            outerLoop:
            if (n == 1 || n == 0) {
                System.out.println(n + " is a Fibonacci number.");
                break;
            } else if (b == n) {
                saveNum.add(a);
                saveNum.add(n);
                System.out.println(n + " is a fib. \nThe preceding numbers are:");
                System.out.println(saveNum);
                break;
            } else if (b > n || n < 0) {
                System.out.println(n + " is not a Fibonacci number.");
                n = 1;
            } else {
                saveNum.add(a);
                int d = b;
                a = d;
                int c = a + b;
                b = c;
                break outerLoop;
            }
        }
    }

//
//    private static ArrayList<Integer> saveNum = new ArrayList<>();
//    private static int Fibonacci(int n, int i, int a, int b) {
//        if (n == 1 || n == 0) System.out.println(n +  "is a Fibonacci number.");
//        else if (b == n) {
//            saveNum.add(a);
//            saveNum.add(n);
//            System.out.println(n + " is a fib.\nThe preceding numbers are:");
//            System.out.println(saveNum);
//        } else if (b > n || n < 0) {
//            System.out.println(n + " is not a Fibonacci number.");
//            return 1;
//        } else {
//            saveNum.add(a);
//            return Fibonacci(n, i+1, b, a+b);
//        }
//        return 0;
//    }



}