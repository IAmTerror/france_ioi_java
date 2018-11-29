import algorea.Scanner;

class Main {

    static Scanner entrée = new Scanner(System.in);

    public static void main(String[] args) {

        int borne1 = entrée.nextInt();
        int borne2 = entrée.nextInt();

        if(borne1 > borne2) {
            System.out.println(borne1 - borne2);
        } else {
            System.out.println(borne2 - borne1);
        }
    }
}
