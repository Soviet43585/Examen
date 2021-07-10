package com.company;

import java.util.Scanner;

public class Sqare {
    Scanner input = new Scanner(System.in);
    private int height;
    private int width;
    private int square;

    Sqare(int height, int width) {
        this.height = height;
        this.width = width;
        this.square = height*width;
    }

    public int calculate() {
        System.out.println("Введите высоту прямоугольника: ");
        setHeight(input.nextInt());
        System.out.println("Введите ширину прямоугольника: ");
        setHeight(input.nextInt());
        return height*width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
