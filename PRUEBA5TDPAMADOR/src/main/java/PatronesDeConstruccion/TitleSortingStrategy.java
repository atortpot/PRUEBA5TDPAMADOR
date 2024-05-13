package PatronesDeConstruccion;
import java.util.List;
import java.util.Comparator;
class TitleSortingStrategy implements SortingStrategy {
    @Override
    public void sort(List<DigitalMedia> items) {
        items.sort(Comparator.comparing(DigitalMedia::getTitle));
    }
}

