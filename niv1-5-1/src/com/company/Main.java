import algorea.Scanner;

class Main {

    static Scanner entrée = new Scanner(System.in);

    public static void main(String[] args) {

        int nbPaquets = entrée.nextInt();
        int poidsPaquet = entrée.nextInt();

        int poidsTotal = nbPaquets * poidsPaquet;

        if(poidsTotal > 105) {
            System.out.println("Surcharge !");
        }
    }
}
