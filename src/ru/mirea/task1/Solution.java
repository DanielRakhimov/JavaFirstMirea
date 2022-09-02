package ru.mirea.task1;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Solution {

    public static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        int[] x = {1,2,3,4,54};
        //part1(x);
        //part2();
        //part3();
        //part4();
        System.out.println(part5(20));
    }
    public static void part1(int[] x){
        int sum = 0;
        sum = Arrays.stream(x).sum(); //  got the stream of x and used method sum
        System.out.printf("summary using stream: %d", sum);
        System.out.println();
        sum = 0;
        for (var t : x) {
            sum += t;
        }
        System.out.printf("summary using for: %d", sum);
        System.out.println();
        sum = 0;
        int i = 0;
        while(i < x.length) { sum += x[i]; ++i; }
        System.out.printf("summary using while: %d", sum);
        System.out.println();
        i = 0; sum = 0;
        do{
            sum += x[i];
            ++i;
        }while (i != x.length);
        System.out.printf("summary using do while: %d", sum);
    }

    public static void part2(){


        ArrayList<String> textList = new ArrayList<>();

        while(!console.hasNext("exit")) textList.add(console.next());

        textList.forEach(System.out::println); // lambda

    }

    public static void part3(){
        String pattern = "the %d number of harmony is %s";
        System.out.println("harmony in fractions:");
        for (int i = 1; i <= 10; i++) {
            if(i == 1) System.out.printf(pattern, i, i);
            else System.out.printf(pattern, i, "1/" + i);
            System.out.println();
        }
        System.out.println();
        System.out.println("harmony in floating point numbers");
        DecimalFormat df = new DecimalFormat("0.00000");
        for (int i = 1; i <= 10; i++) {
            System.out.printf(pattern, i, df.format(1.0 / i));
            System.out.println();
        }
    }
    public static void part4(){
        System.out.println("Using Random class");
        int [] array;
        Random random = new Random(3);

        array =  random.ints(25, 5,100000).toArray();

        Arrays.stream(array).forEach(System.out::println);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("sorted:");

        Arrays.stream(array).sorted().forEach(System.out::println);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        array = new int[25];
        System.out.println("Using Math.random");
        for (int i = 0; i < array.length; i++) array[i] = (int) (Math.random() * 100000);
        Arrays.stream(array).forEach(System.out::println);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("sorted:");

        Arrays.stream(array).sorted().forEach(System.out::println);

    }

    public static BigInteger part5(int n){
        BigInteger factorial = BigInteger.ONE; // for colossal values
        for (int i = 1; i <= n; i++) factorial = factorial.multiply(BigInteger.valueOf(i));
        return factorial;
    }
}
