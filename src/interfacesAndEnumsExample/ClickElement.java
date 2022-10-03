package interfacesAndEnumsExample;

public interface ClickElement {

    void click();

    default void assertText (Elements element) {
        if (element.getName().contains("SAVE")) {
            System.out.println("THIS IS SAVE BUTTON");
        }if (element.getName().contains("CLOSE")) {
            System.out.println("THIS IS CLOSE BUTTON");
        }if (element.getName().contains("EXIT")) {
            System.out.println("THIS IS EXIT BUTTON");
        }if (element.getName().contains("INPUT")) {
            System.out.println("THIS IS INPUT FIELD");
        }
    }
}
