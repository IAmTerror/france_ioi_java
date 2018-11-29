import algorea.Scanner;

class Main {

    static Scanner entrée = new Scanner(System.in);

    public static void main(String[] args) {

        int nbMaisons = entrée.nextInt();

        int minX = 1000000;
        int minY = 1000000;
        int maxX = 0;
        int maxY = 0;

        for (int i = 0; i < nbMaisons ; i++) {
            int abscisseX = entrée.nextInt();
            int ordonneeY = entrée.nextInt();

            if (abscisseX < minX) {
                minX = abscisseX;
            }

            if (ordonneeY < minY) {
                minY = ordonneeY;
            }

            if (abscisseX > maxX) {
                maxX = abscisseX;
            }

            if (ordonneeY > maxY) {
                maxY = ordonneeY;
            }
        }

        int perimetre = ((maxX - minX) * 2) + ((maxY - minY) * 2);

        System.out.println(perimetre);
    }
}
