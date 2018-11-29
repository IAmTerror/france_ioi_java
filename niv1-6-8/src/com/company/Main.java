import algorea.Scanner;

class Main {

    static Scanner entrée = new Scanner(System.in);

    public static void main(String[] args) {

        int nbMarchands = entrée.nextInt();

        int plusPetitPrix = 1000000;
        int positionPPPrix = 0;

        for (int i = 0; i < nbMarchands; i++) {
            int prixCourant = entrée.nextInt();

            if (prixCourant <= plusPetitPrix) {
                plusPetitPrix = prixCourant;
                positionPPPrix = i + 1;
            }
        }

        System.out.println(positionPPPrix);
    }
}
