import algorea.Scanner;

class Main {

    static Scanner entrée = new Scanner(System.in);

    public static void main(String[] args) {

        int codeSecret = entrée.nextInt();

        if(codeSecret == 64741) {
            System.out.println("Bon festin !");
        }
        else {
            System.out.println("Allez-vous en !");
        }
    }
}
