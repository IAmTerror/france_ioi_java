import algorea.Scanner;

class Main {

    static Scanner entrée = new Scanner(System.in);

    public static void main(String[] args) {

        int hauteurArbre = entrée.nextInt();
        int nbFoliolesArbre = entrée.nextInt();

        if (hauteurArbre <= 8) {
            if (nbFoliolesArbre <=5) {
                System.out.println("Falarion");
            } else {
                System.out.println("Tinuviel");
            }
        }

        if (hauteurArbre >= 10) {
            if (nbFoliolesArbre <=7) {
                System.out.println("Dorthonion");
            } else {
                System.out.println("Calaelen");
            }
        }
    }
}
