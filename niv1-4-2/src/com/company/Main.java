import algorea.Scanner;

class Main {

    static Scanner entrée = new Scanner(System.in);

    public static void main(String[] args) {
        int nbJoursRando = entrée.nextInt();

        System.out.println(nbJoursRando * 16 * 60 * 60);
    }
}
