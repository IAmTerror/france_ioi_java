import algorea.Scanner;

class Main {

    static Scanner entrée = new Scanner(System.in);

    public static void main(String[] args) {

        int dateDebSold1 = entrée.nextInt();
        int dateFinSold1 = entrée.nextInt();
        int dateDebSold2 = entrée.nextInt();
        int dateFinSold2 = entrée.nextInt();

        if (dateDebSold1 > dateFinSold2 || dateDebSold2 > dateFinSold1) {
            System.out.println("Pas amis");
        } else {
            System.out.println("Amis");
        }
    }
}
