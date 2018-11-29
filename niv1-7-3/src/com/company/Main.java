import algorea.Scanner;

class Main {

    static Scanner entrée = new Scanner(System.in);

    public static void main(String[] args) {

        int numMois = entrée.nextInt();

        if (numMois == 1 || numMois == 2 || numMois == 3 || numMois == 7 || numMois == 8 || numMois == 9) {
            System.out.println(30);
        } else if (numMois == 4 || numMois == 5 || numMois == 6 || numMois == 10) {
            System.out.println(31);
        } else if (numMois == 11) {
            System.out.println(29);
        }
    }
}