import algorea.Scanner;

class Main {

    static Scanner entrée = new Scanner(System.in);

    public static void main(String[] args) {

        int heureArivee = entrée.nextInt();

        int prixChambre = 10 + (5 * heureArivee);

        if(prixChambre <= 53){
            System.out.println(prixChambre);
        } else {
            System.out.println(53);
        }
    }
}
