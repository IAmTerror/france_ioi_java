import algorea.Scanner;

class Main {

    static Scanner entrée = new Scanner(System.in);

    public static void main(String[] args) {

        int abscisseMin = entrée.nextInt();
        int abscisseMax = entrée.nextInt();
        int ordonneeMin = entrée.nextInt();
        int ordonneeMax = entrée.nextInt();

        int nbTotalMaisons = entrée.nextInt();

        int nbMaisonsSuspectes = 0;

        for (int i = 0; i < nbTotalMaisons; i++) {
            int abscisseMaison = entrée.nextInt();
            int ordonneeMaison = entrée.nextInt();

            if ((abscisseMaison >= abscisseMin && abscisseMaison <= abscisseMax) &&
                    (ordonneeMaison >= ordonneeMin && ordonneeMaison <= ordonneeMax)) {
                nbMaisonsSuspectes +=1;
            }
        }

        System.out.println(nbMaisonsSuspectes);
    }
}
