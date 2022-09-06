package ru.mirea.task2;

public class Dog {

    private int age;
    private String name;

    public Dog(int age, String name){

        this.age = age;
        this.name = name;

    }

    @Override
    public String toString(){

        return "dog name is "  + name + "and it is " + age + "years old (the same as human's " + transferAge() + ')';

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int transferAge(){

        return age * 7;

    }

}
