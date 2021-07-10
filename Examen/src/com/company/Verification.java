package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Verification {
    ArrayList<Integer> arr = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    public void findNumInArr(){
        System.out.println("Введите искомое число: ");
        int num = input.nextInt();
        boolean isFind = false;
        for (int i = 0; i < 10; i++) {
            arr.add((int)(Math.random()*10)+1);
        }
        System.out.println(arr);
        for (Integer i : arr) {
            if (i == num) {
                isFind = true;
                break;
            }
        }
        if (isFind) {
            System.out.println("Такое исло присутствует!");
        }
        else {
            System.out.println("Такого числа нет!");
        }
    }

    @Override
    public String toString() {
        return "Verification{" +
                "arr=" + arr +
                '}';
    }
}
