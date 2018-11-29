package com.company;

class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("OX");
            }
            System.out.println("");
            for (int k = 0; k < 20; k++) {
                System.out.print("XO");
            }
            System.out.println("");
        }
    }
}