package ru.geekbrains.Lesson8HW;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {

    public int a;
    public int b;
    public int c;

    public Window() {

        setTitle("Калькулятор");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);

        GridLayout layout = new GridLayout(1, 5);
        JPanel panel = new JPanel(layout);

        JButton equal = new JButton("Равно");
        panel.add(equal);




        JButton plus = new JButton("Плюс");
        panel.add(plus);

        JButton minus = new JButton("Минус");
        panel.add(minus);

        JButton division = new JButton("Делить");
        panel.add(division);

        JButton multiply = new JButton("Умножить");
        panel.add(multiply);

        add(panel, BorderLayout.NORTH);

        setVisible(true);

    }

}
