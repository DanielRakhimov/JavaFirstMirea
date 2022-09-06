package ru.mirea.task2;

import java.util.ArrayList;
import java.util.Scanner;

public class TestDog {

    ArrayList<Dog> dogs = new ArrayList<>();

    public void add(int n){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            dogs.add(new Dog(scanner.nextInt(), scanner.next()));
        }

    }

}
