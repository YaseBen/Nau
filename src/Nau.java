import java.util.ArrayList;
import java.util.Random;

public class Nau {
    Random rand = new Random();

    public static void main(String[] args) {
        Nau e = new Nau();
        e.principal();
    }

    public void principal() {

        ArrayList<Habitaciones> mapa = new ArrayList<>(10);
        // Mostrem la posició inicial
        mapa.mostrarPosicioActual();
        // Movent-nos cap a la dreta i esquerra
        mapa.moureDreta(); // Et mous a la dreta
        mapa.moureDreta(); // Et mous a la dreta
        mapa.moureEsquerra(); // Et mous a l'esquerra
        mapa.moureEsquerra(); // Et mous a l'esquerra
        mapa.moureEsquerra(); // Et mous a l'esquerra

        mapa.add();

        String[][] mapa = new String[3][6];
        int o;
        int p;
        boolean eina = false;
        while (eina == false) {
            o = rand.nextInt(3);
            p = rand.nextInt(6);
            mapa[o][p] = "?";
            eina = true;
        }
        boolean jugar = true;

        while (!jugar) {

        }

    }
}