import algorea.Scanner;

class Main {

    static Scanner entrée = new Scanner(System.in);

    public static void main(String[] args) {

        int nbPairesZonesRect = entrée.nextInt();

        int abscisseMinRectA = entrée.nextInt();
        int abscisseMaxRectA = entrée.nextInt();
        int ordonneeMinRectA = entrée.nextInt();
        int ordonneeMaxRectA = entrée.nextInt();

        int largeurRectA = abscisseMaxRectA - abscisseMinRectA;
        int hauteurRectA = ordonneeMaxRectA - ordonneeMinRectA;

        int abscisseMinRectB = entrée.nextInt();
        int abscisseMaxRectB = entrée.nextInt();
        int ordonneeMinRectB = entrée.nextInt();
        int ordonneeMaxRectB = entrée.nextInt();

        int largeurRectB = abscisseMaxRectB - abscisseMinRectB;
        int hauteurRectB = ordonneeMaxRectB - ordonneeMinRectB;

        for (int i = 0; i < nbPairesZonesRect; i++) {
            if (abscisseMinRectA < (abscisseMinRectB + largeurRectB) &&
                    (abscisseMinRectA + largeurRectA) > abscisseMinRectB &&
                    ordonneeMinRectA < (ordonneeMinRectB + hauteurRectB) &&
                    (hauteurRectA + ordonneeMinRectA) < ordonneeMinRectB) {
                System.out.println("OUI");
            } else {
                System.out.println("NON");
            }
        }
    }
}

// NE FONCTIONNE PAS
