package interfacesAndEnumsExample;

public enum Elements {
    EXIT_BUTTON ("EXIT"),
    CLOSE_BUTTON ("CLOSE"),
    SAVE_BUTTON ("SAVE"),
    INPUT_ELEMENT ("INPUT");

    private final String NAME;

    Elements (String name) {
        this.NAME = name;
    }

    String getName () {
        return NAME;
    }
}
