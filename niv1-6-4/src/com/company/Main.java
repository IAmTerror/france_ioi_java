import algorea.Scanner;

class Main {

    static Scanner entrée = new Scanner(System.in);

    public static void main(String[] args) {

        int nbDeniv = entrée.nextInt();

        int totalMont = 0;
        int totalDesc = 0;

        for (int i = 0; i < nbDeniv; i++) {

            int variation = entrée.nextInt();

            if (variation > 0) {
                totalMont += variation;
            }

            if (variation < 0) {
                variation *= -1;
                totalDesc += variation;
            }
        }

        System.out.println(totalMont);
        System.out.println(totalDesc);
    }
}