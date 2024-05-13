package PatronesDeEstructuracion;
import java.util.List;
import java.util.ArrayList ;
class MediaComposite implements DigitalMediaComponent {
    private List<DigitalMediaComponent> children = new ArrayList<>();

    public void add(Revista component) {
        children.add(component);
    }

    @Override
    public void remove(DigitalMediaComponent component) {
        children.remove(component);
    }

    @Override
    public List<DigitalMediaComponent> getChildren() {
        return children;
    }

    @Override
    public void display() {
        for (DigitalMediaComponent component : children) {
            component.display();
        }
    }

    @Override
    public String getTitle() {
        return "Composite Media";
    }

    @Override
    public void add(Libro component) {

    }
}
