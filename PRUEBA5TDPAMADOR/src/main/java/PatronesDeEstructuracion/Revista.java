package PatronesDeEstructuracion;

import java.util.List;

;

class Revista implements MediaDigital, DigitalMediaComponent {
    private String name;

    public Revista(String name) {
        this.name = name;
    }

    @Override
    public String getTitle() {
        return name;
    }

    @Override
    public void add(Libro component) {

    }

    @Override
    public void remove(DigitalMediaComponent component) {

    }

    @Override
    public List<DigitalMediaComponent> getChildren() {
        return List.of();
    }

    @Override
    public void display() {
        System.out.println("Revista: " + name);
    }
}

