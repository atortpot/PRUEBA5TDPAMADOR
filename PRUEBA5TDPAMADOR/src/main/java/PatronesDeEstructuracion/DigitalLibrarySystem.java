package PatronesDeEstructuracion;
public class DigitalLibrarySystem {
    public static void main(String[] args) {
        User user1 = new User("Alice");
        User user2 = new User("Bob");

        MediaLibrary library = new MediaLibrary();
        library.registerObserver(user1);
        library.registerObserver(user2);

        library.newMediaReleased("1984");

        MediaComposite composite = new MediaComposite();
        composite.add(new Libro ("1984", "George Orwell"));
        composite.add(new Revista ("Time"));
        composite.display();
    }
}

