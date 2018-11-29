import algorea.Scanner;

class Main {

    static Scanner entrée = new Scanner(System.in);

    public static void main(String[] args) {
        int tempMin = entrée.nextInt();
        int tempMax = entrée.nextInt();

        for(int i = tempMin; i <= tempMax; i++) {
            System.out.println(i);
        }
    }
}
