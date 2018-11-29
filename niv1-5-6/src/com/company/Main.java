import algorea.Scanner;

class Main {

    static Scanner entrée = new Scanner(System.in);

    public static void main(String[] args) {

        int de1 = entrée.nextInt();
        int de2 = entrée.nextInt();

        int sommeDes = de1 + de2;

        if (sommeDes >= 10) {
            System.out.println("Taxe spéciale !");
            System.out.println(36);
        } else {
            System.out.println("Taxe régulière");
            System.out.println((de1 + de2) * 2);
        }
    }
}
