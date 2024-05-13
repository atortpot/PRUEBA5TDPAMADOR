package PatronesDeConstruccion ;
class Magazine implements DigitalMedia {
    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    @Override
    public String getTitle() {
        return name;
    }

    @Override
    public void display() {
        System.out.println("Revista: " + name);
    }
}
