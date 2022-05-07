package com.company;

public class Main {

    public static void main(String[] args) {
        Fish fish=new Fish();
        fish.setSort("Sazan");
        fish.setAge(3);
        fish.setWeight(2);
        fish.setPrice(1500);

        Fish.method1(fish.getSort(), fish.getAge(), fish.getWeight(), fish.getPrice());
        Fish.method();

        Parrot parrot=new Parrot();
        parrot.setSort("Amazon");
        parrot.setAge(12);
        parrot.setWeight(500);
        parrot.setPrice(30000);

        Parrot.method1(parrot.getSort(), parrot.getAge(), parrot.getWeight(), parrot.getPrice());
        Parrot.method();

        Cat cat =new Cat();
        cat.setSort("Persian");
        cat.setAge(5);
        cat.setWeight(3);
        cat.setPrice(3000);

        Dog.method1( cat.getSort(),  cat.getAge(),  cat.getWeight(),  cat.getPrice());
        cat.method();

        Dog dog =new Dog();
        dog.setSort("Bulldog");
        dog.setAge(4);
        dog.setWeight(15);
        dog.setPrice(15000);

        Dog.method1( dog.getSort(),  dog.getAge(),  dog.getWeight(),  dog.getPrice());
        dog.method();






    }

}
