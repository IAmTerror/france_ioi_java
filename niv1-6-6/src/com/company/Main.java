import algorea.Scanner;

class Main {

    static Scanner entrée = new Scanner(System.in);

    public static void main(String[] args) {

        int age = entrée.nextInt();
        int poidsBagages = entrée.nextInt();

        int prixChambre = 0;

        if (age == 60) {
            System.out.println(prixChambre);
        } else {
            if (age < 10) {
                prixChambre = 5;
                System.out.println(prixChambre);
            } else {
                if (poidsBagages < 20) {
                    prixChambre = 30;
                    System.out.println(prixChambre);
                } else {
                    prixChambre = 40;
                    System.out.println(prixChambre);
                }
            }
        }
    }
}

