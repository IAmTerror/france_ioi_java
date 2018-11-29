import algorea.Scanner;

class Main {

    static Scanner entrée = new Scanner(System.in);

    public static void main(String[] args) {

        int superficieChampArignon = entrée.nextInt();
        int superficieChampEvaran = entrée.nextInt();

        if(superficieChampArignon > superficieChampEvaran + 10) {
            System.out.println("La famille Arignon a un champ trop grand");
        }

        if(superficieChampEvaran > superficieChampArignon + 10) {
            System.out.println("La famille Evaran a un champ trop grand");
        }
    }
}
