import static algorea.Robot.*;

class Main {
    public static void main(String[] args) {
        for(int tour = 0; tour < 108; tour++) {
            for(int kar1 = 0; kar1 < 13; kar1++) {
                haut();
            }
            for(int kar2 = 0; kar2 < 13; kar2++) {
                droite();
            }
            for(int kar3 = 0; kar3 < 13; kar3++) {
                bas();
            }
            for(int kar4 = 0; kar4 < 13; kar4++) {
                gauche();
            }
        }
    }
}