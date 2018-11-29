import algorea.Scanner;

class Main {

    static Scanner entrée = new Scanner(System.in);

    public static void main(String[] args) {

        int nbMembres = entrée.nextInt();

        int totalPoidsEquipe1 = 0;
        int totalPoidsEquipe2 = 0;

        for(int i = 0; i < (nbMembres * 2); i++) {

            int poidsMembreCourant = entrée.nextInt();

            if(i % 2 == 0) {
                totalPoidsEquipe1 += poidsMembreCourant;
            } else {
                totalPoidsEquipe2 += poidsMembreCourant;
            }
        }

        if(totalPoidsEquipe1 > totalPoidsEquipe2) {
            System.out.println("L'équipe 1 a un avantage");
        } else {
            System.out.println("L'équipe 2 a un avantage");
        }

        System.out.println("Poids total pour l'équipe 1 : "+ totalPoidsEquipe1);
        System.out.println("Poids total pour l'équipe 2 : "+ totalPoidsEquipe2);
    }
}
