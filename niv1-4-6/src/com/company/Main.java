import algorea.Scanner;

class Main {

    static Scanner entrée = new Scanner(System.in);

    public static void main(String[] args) {
        int nbNombres = entrée.nextInt();
        int resultat = 66;

        for(int i = 0; i < nbNombres; i++) {
            resultat = resultat + resultat * i;
            System.out.println(resultat);
        }
    }
}

