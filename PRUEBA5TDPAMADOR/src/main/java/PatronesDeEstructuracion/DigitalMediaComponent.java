package PatronesDeEstructuracion;
import java.util.List;
interface DigitalMediaComponent {
    void display();
    String getTitle();
    void add(Libro component);
    void remove(DigitalMediaComponent component);
    List<DigitalMediaComponent> getChildren();
}
