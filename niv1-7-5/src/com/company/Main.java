import algorea.Scanner;

class Main {

    static Scanner entrée = new Scanner(System.in);

    public static void main(String[] args) {

        int nbPersonnes = entrée.nextInt();

        int nbMaxPersonnes = 0;

        int nbPersonnesCourantes = 0;

        for (int i=0; i<(nbPersonnes * 2); i++) {

            int personneCourante = entrée.nextInt();

            if (personneCourante >=0) {
                nbPersonnesCourantes++;
            } else {
                nbPersonnesCourantes--;
            }

            if (nbPersonnesCourantes > nbMaxPersonnes) {
                nbMaxPersonnes = nbPersonnesCourantes;
            }
        }
        System.out.println(nbMaxPersonnes);
    }
}
