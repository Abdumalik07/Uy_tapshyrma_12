package com.company;

public class Fish {
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
        System.out.println("Properties of fish: "+"swims, has not a voice, lives in a water,etc.");
    }

    static void method1(String sort, int age, double weight, int price) {
        System.out.println("About a fish:\n"+"Fish sort: "+sort+"\nFish age: "+age+"\nFish weight: "+weight+"\nFish price: "+price);
    }


}
