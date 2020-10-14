package ru.geekbrains.erik.Lesson6HomeWork;

public class Animal {

    protected String kind;
    protected String name;
    protected double runMax;
    protected double swimMax;
    protected double jumpMax;

    Animal (String kind, String name, double runMax, double swimMax, double jumpMax) {
        this.kind = kind;
        this.name = name;
        this.runMax = runMax;
        this.swimMax = swimMax;
        this.jumpMax = jumpMax;
    }

    void run (double runDistance) {
        if (runDistance <= runMax && runDistance > 0.0) {
            System.out.println(this.kind + " " + this.name + " бежит " + runDistance + " м.");
            System.out.println();
        } else {
            System.out.println("Чтобы " + this.kind + " " + this.name + " смог добежать - задайте число от 0.0 до " + this.runMax + " м.");
            System.out.println();
        }
    }

    void swim (double swimDistance) {
        if (swimDistance <= swimMax && swimDistance > 0.0) {
            System.out.println(this.kind + " " + this.name + " плывет " + swimDistance + " м.");
            System.out.println();
        } else if (swimDistance < 0.0 || swimDistance > swimMax) {
            System.out.println("Чтобы " + this.kind + " " + this.name + " доплыл "+ "задайте значение от 0.0 до " + this.swimMax + " м.");
            System.out.println();
        } else if (this.kind.equals("Кот")){
            System.out.println("Коты не плавают.");
            System.out.println();
        }
    }

    void jump (double jumpHeight) {
        if (jumpHeight <= jumpMax && jumpHeight > 0.0) {
            System.out.println(this.kind + " " + this.name + " прыгает на высоту " + jumpHeight + " м.");
            System.out.println();
        } else {
            System.out.println("Чтобы " + this.kind + " " + this.name + " смог прыгнуть - задайте число от 0.0 до " + this.jumpMax + " м.");
            System.out.println();
        }
    }
}
