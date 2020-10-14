package ru.geekbrains.erik.Lesson6HomeWork;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat ("Кот", "Bob", 200.0, 0.0, 2);
        Dog dog1 = new Dog ("Пес", "Bill", 500.0, 10, 0.5);
        Cat cat2 = new Cat ("Кот", "Fred", 50.0, 0.0, 0.3);
        Dog dog2 = new Dog ("Пес", "Gorge", 300.0, 90, 1.5);

        cat1.run(100.0);
        cat1.swim(0.0);
        cat1.jump(1.5);

        dog1.swim(9.0);
        dog1.run(89.0);
        dog1.jump(0.9);
        dog1.jump(0.4);

        cat2.run(99.0);
        cat2.jump(3.3);
        cat2.swim(9.0);

        dog2.run(5.5);
        dog2.jump(3.0);
        dog2.swim(5.0);
    }

}
