import algorea.Scanner;

class Main {

    static Scanner entrée = new Scanner(System.in);

    public static void main(String[] args) {

        int age = entrée.nextInt();

        if (age < 21) {
            System.out.println("Tarif réduit");
        } else {
            System.out.println("Tarif plein");
        }
    }
}
