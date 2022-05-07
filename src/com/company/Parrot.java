package com.company;

public class Parrot {
    private String sort;
    private int age;
    private double weight;
    private int price;

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    static void method(){
        System.out.println("Properties of parrot: "+"flies, has make sounds like a person, looks beautiful with mix of colours etc.");
    }

    static void method1(String sort, int age, double weight, int price) {
        System.out.println("\nAbout a parrot:\n"+"Parrot sort: "+sort+"\nParrot age: "+age+"\nParrot weight: "+weight+"\nParrot price: "+price);
    }
}
