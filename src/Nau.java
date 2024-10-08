import java.util.ArrayList;
import java.util.Random;

public class Nau {
    Random rand = new Random();

    public static void main(String[] args) {
        Nau e = new Nau();
        e.principal();
    }

    public void principal() {
        Habitaciones miHabitacion = new Habitaciones();
        ArrayList<Habitaciones> mapa = new ArrayList<Habitaciones>(10);
        for(int i=0; i<10;i++){
            mapa = Habitaciones.Habitaciones(i);
        }
        // Mostrem la posició inicial
        mapa.mostrarPosicioActual(Habitaciones.getNombre(
            
        ));// Movent-nos cap a la dreta i esquerra
        mapa.moureDreta(); // Et mous a la dreta
        mapa.moureDreta(); // Et mous a la dreta
        mapa.moureEsquerra(); // Et mous a l'esquerra
        mapa.moureEsquerra(); // Et mous a l'esquerra
        mapa.moureEsquerra(); // Et mous a l'esquerra

        mapa.add();
        boolean jugar = true;

        while (!jugar) {

        }

    }
}