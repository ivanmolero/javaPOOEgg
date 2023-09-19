package org.example;

public class Main {
    public static void main(String[] args) {
        Integer[] valores = new Integer[5];
        for (int i = 0; i < 7; i++) {
            try {
                valores[i] = i;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}