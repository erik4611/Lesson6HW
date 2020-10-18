package ru.geekbrains.Lesson7HW;

public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat ("Bob", 10, false);
        Plate plate1 = new Plate(200);
        Cat cat2 = new Cat("Fred", 45, false);

        cat1.eat(plate1);


        Cat[] cats = new Cat[5];
        cats[0] = new Cat ("Tom", 10, false);
        cats[1] = new Cat ("Filip", 20, false);
        cats[2] = new Cat ("Frank", 5, false);
        cats[3] = new Cat ("Alex", 25, false);
        cats[4] = new Cat ("Jack", 30, false);






    }


}
