import static algorea.Robot.*;
class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 21; i++) {
            haut();
            droite();
        }
        for (int i = 0; i < 21; i++) {
            gauche();
            bas();
        }
    }
}