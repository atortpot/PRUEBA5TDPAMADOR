package PatronesDeConstruccion;

import java.util.ArrayList;
import java.util.List;
public class DigitalLibraryMenu {
    public static void main(String[] args) {
        // Lista de medios digitales
        List<DigitalMedia> mediaList = new ArrayList<>();
        mediaList.add(new Book("1984", "George Orwell"));
        mediaList.add(new Magazine("Time"));
        mediaList.add(new Newspaper("The New York Times"));

        // Mostrar medios antes de la ordenación
        System.out.println("Medios antes de la ordenación:");
        for (DigitalMedia media : mediaList) {
            media.display();
        }

        // Ordenar por título utilizando una estrategia de ordenación
        SortingStrategy titleSortStrategy = new TitleSortingStrategy();
        titleSortStrategy.sort(mediaList);

        // Mostrar medios después de la ordenación
        System.out.println("\nMedios después de la ordenación:");
        for (DigitalMedia media : mediaList) {
            media.display();
        }
    }
}
