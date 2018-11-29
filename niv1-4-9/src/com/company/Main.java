import algorea.Scanner;

class Main {

    static Scanner entrée = new Scanner(System.in);

    public static void main(String[] args) {

        int largeurMax = entrée.nextInt();
        int largeurMin = entrée.nextInt();

        int volumeSocle = 0;

        for(int i = largeurMax; i >= largeurMin; i--) {
            volumeSocle += i * i;
        }
        System.out.println(volumeSocle);
    }
}
