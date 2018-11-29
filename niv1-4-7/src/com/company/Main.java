import algorea.Scanner;

class Main {

    static Scanner entrée = new Scanner(System.in);

    public static void main(String[] args) {
        int positionDepart = entrée.nextInt();
        int largeurEmplacement = entrée.nextInt();
        int nbVendeurs = entrée.nextInt();

        for(int i = 0; i <= nbVendeurs; i++) {
            System.out.println(positionDepart + (i) * largeurEmplacement);
        }
    }
}
