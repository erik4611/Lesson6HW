package ru.geekbrains.Lesson7HW;

import java.lang.management.BufferPoolMXBean;
import java.util.Scanner;

public class Plate {

    protected int food;

    public Plate (int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        if (food - n > 0) {
            food -= n;
            info();

        } else {
            System.out.println("Еды в тарелке недостаточно!");

        }

    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public int getFood(int x){
        return food = x;
    }

    public void MoreFood1(int addFood) {                // добавление еды в тарелку 1
        food += addFood;
        System.out.println("Еды в тарелке стало " + food);
    }

    public void MoreFood2() {                               // добавление еды в тарелку 2
        System.out.println("Сколько еды добавить в тарелку? Введите целое число: ");
        Scanner sc = new Scanner(System.in);
        int addFood2 = sc.nextInt();
        food += addFood2;
        System.out.println("Еды в тарелке стало " + food);
    }
}
