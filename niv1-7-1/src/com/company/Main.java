import algorea.Scanner;

class Main {

    static Scanner entrée = new Scanner(System.in);

    public static void main(String[] args) {

        int debutIntervalle = entrée.nextInt();
        int finIntervalle = entrée.nextInt();

        int nbEntrees = entrée.nextInt();

        int nbSuspects = 0;

        for (int i = 0; i < nbEntrees; i++) {
            int dateCourante = entrée.nextInt();

            if (dateCourante >= debutIntervalle && dateCourante <= finIntervalle) {
                nbSuspects +=1;
            }
        }

        System.out.println(nbSuspects);
    }
}