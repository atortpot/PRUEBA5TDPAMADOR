package PatronesDeConstruccion;

class Newspaper implements DigitalMedia {
    private String name;

    public Newspaper(String name) {
        this.name = name;
    }

    @Override
    public String getTitle() {
        return name;
    }

    @Override
    public void display() {
        System.out.println("Periódico: " + name);
    }
}