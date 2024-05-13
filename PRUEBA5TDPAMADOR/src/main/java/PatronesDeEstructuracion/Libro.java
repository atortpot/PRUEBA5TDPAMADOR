package PatronesDeEstructuracion;

;

class Libro implements MediaDigital {
    private String title;
    private String author;

    public Libro(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void display() {
        System.out.println("Libro: " + title + ", Autor: " + author);
    }
}
