package PatronesDeConstruccion;
 class ConcreteMediaFactory extends MediaFactory {
    @Override
    public DigitalMedia createMedia(String type) {
        if (type == null) {
            throw new IllegalArgumentException("Type cannot be null");
        }
        switch (type.toLowerCase()) {
            case "book":
                return new Book("Default Title", "Default Author");
            case "magazine":
                return new Magazine("Default Magazine");
            case "newspaper":
                return new Newspaper("Default Newspaper");
            default:
                throw new IllegalArgumentException("Unsupported media type: " + type);
        }
    }
}