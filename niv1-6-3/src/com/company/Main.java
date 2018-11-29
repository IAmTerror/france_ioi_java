import algorea.Scanner;

class Main {

    static Scanner entrée = new Scanner(System.in);

    public static void main(String[] args) {

        int nbJoursMarche = entrée.nextInt();

        int distanceMax = 0;

        for(int i = 0; i < nbJoursMarche; i++) {

            int distanceJours = entrée.nextInt();

            if(distanceJours > distanceMax) {
                distanceMax = distanceJours;
            }
        }

        System.out.println(distanceMax);
    }
}
