package ru.geekbrains.Lesson7HW;

import sun.plugin2.message.GetAppletMessage;

public class Cat {

    private String name;
    private int Appetite;
    protected boolean Satiety;
    protected int getFood;


    public Cat (String name, int Appetite, boolean Satiety) {
        this.name = name;
        this.Appetite = Appetite;
        this.Satiety = Satiety;
    }

    public void eat(Plate p) {

        p.decreaseFood(Appetite);
        feedTheCat(Satiety);
        System.out.println("Сытость кота: " + Satiety);
    }

    public boolean feedTheCat(boolean Satiety) {        //метод меняет значение сытости с false на true

        this.Satiety = Satiety;
        this.Satiety = true;
        return true;
    }

    public boolean TheCatIsHungry(boolean Satiety) {
        this.Satiety = Satiety;
        this.Satiety = false;
        return false;
    }

    public void CatInfo () {

        System.out.println(name + " " + Appetite + " " +  Satiety);
    }

//    void eatCatChar(char[] x) {
//        for (int i = 0; i < x.length; i++) {
//            x[i].
//        }
//    }


}
