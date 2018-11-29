import static algorea.Robot.*;

class Main {

    public static void main(String[] args) {

        for(int i = 0; i < 9; i++) {
            droite();
        }

        for(int i = 0; i < 9; i++) {
            haut();
        }

        gauche();

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 8; j++) {
                bas();
            }
            gauche();
            for(int k = 0; k < 8; k++) {
                haut();
            }
            gauche();
        }

        for(int i = 0; i < 9; i++) {
            bas();
        }

    }
}
