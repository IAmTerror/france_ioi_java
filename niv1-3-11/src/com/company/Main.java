import static algorea.Robot.*;

class Main {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            for(int cpt = 0; cpt < i + 1; cpt++) {
                droite();
            }
            ramasser();
            for(int cpt = 0; cpt < i + 1; cpt++) {
                gauche();
            }
            deposer();
        }
    }
}
