import algorea.Scanner;

class Main {
    static Scanner entrée = new Scanner(System.in);

    public static void main(String[] args) {
        int âgeCadet = entrée.nextInt();
        int âgeAîné = entrée.nextInt();
        int différence = âgeAîné - âgeCadet;

        System.out.println(différence);
    }
}
