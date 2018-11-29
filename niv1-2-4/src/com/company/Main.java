import static algorea.Robot.*;
class Main {
    public static void main(String[] args) {
        for (int i = 2; i <= 16; i++) {
            droite();
            ramasser();
        }
        droite();
        deposer();
    }
}
