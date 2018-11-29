package com.company;

class Main {

    public static void main(String[] args) {
	    int nbBonbons = 0;
	    int lot = 1;

	    for(int i = 0; i < 50; i++) {
	        nbBonbons += lot;
	        lot += 1;
	        System.out.println(nbBonbons);
        }
    }
}
