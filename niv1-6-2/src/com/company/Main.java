import algorea.Scanner;

class Main {

    static Scanner entrée = new Scanner(System.in);

    public static void main(String[] args) {

        int positionDepart = entrée.nextInt();
        int nbVillagesSurRoute = entrée.nextInt();

        int nbVillageHaltePotentielle = 0;

        for(int i = 0; i < nbVillagesSurRoute; i++) {
            int positionVillage = entrée.nextInt();

            if(positionVillage <= (positionDepart + 50) && positionVillage >= (positionDepart - 50)) {
                nbVillageHaltePotentielle += 1;
            }
        }

        System.out.println(nbVillageHaltePotentielle);
    }
}
