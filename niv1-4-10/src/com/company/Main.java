import algorea.Scanner;

class Main {

    static Scanner entrée = new Scanner(System.in);

    public static void main(String[] args) {

        int nbKarva = entrée.nextInt();

        for(int i = 0; i < nbKarva; i++) {

            int poids = entrée.nextInt();
            int age = entrée.nextInt();
            int longueurCornes = entrée.nextInt();
            int hauteurAuGarrot = entrée.nextInt();

            int note = (longueurCornes * hauteurAuGarrot) + poids;

            System.out.println(note);
        }
    }
}
