import algorea.Scanner;

class Main {

    static Scanner entrée = new Scanner(System.in);

    public static void main(String[] args) {
        int resultat = 0;

        for(int i = 0; i < 20; i++) {
            int ajout = entrée.nextInt();
            resultat += ajout;
        }

        System.out.println(resultat);
    }
}