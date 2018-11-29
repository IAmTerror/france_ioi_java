package com.company;

class Main {

    public static void main(String[] args) {

        int base = 17;
        int totalCubes = 0;

        for(int i = base; i > 0; i -= 2) {
            int nbCubes = i * i * i;
            totalCubes += nbCubes;
        }

        System.out.println(totalCubes);
    }
}

