package com.company;

import java.util.Scanner;

public class Sqare {
    Scanner input = new Scanner(System.in);
    private int height;
    private int width;

    public int calculate() {
        System.out.println("Введите высоту прямоугольника: ");
        setHeight(input.nextInt());
        System.out.println("Введите ширину прямоугольника: ");
        setWidth(input.nextInt());
        return getHeight()*getWidth();
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

}
