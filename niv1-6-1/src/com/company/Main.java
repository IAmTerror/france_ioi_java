import algorea.Scanner;

class Main {

    static Scanner entrée = new Scanner(System.in);

    public static void main(String[] args) {

        int nbLieux = entrée.nextInt();
        int nbVilles = 0;

        for(int i = 0; i < nbLieux; i++) {
            int nbHabitantsLieu = entrée.nextInt();

            if(nbHabitantsLieu > 10000) {
                nbVilles += 1;
            }
        }

        System.out.println(nbVilles);
    }
}
