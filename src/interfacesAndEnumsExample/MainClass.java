package interfacesAndEnumsExample;

import interfacesAndEnumsExample.buttons.CloseButton;
import interfacesAndEnumsExample.buttons.ExitButton;
import interfacesAndEnumsExample.buttons.SaveButton;
import interfacesAndEnumsExample.inputs.Input;

public class MainClass {

    public static void main(String[] args) {
        ClickElement[] elements = new ClickElement[4];

        elements[0] = new CloseButton();
        elements[1] = new ExitButton();
        elements[2] = new SaveButton();
        elements[3] = new Input();

        for (ClickElement element : elements) {
            element.click();
        }

        for (ClickElement element : elements) {
            element.assertText(((ClickableElements)element).element);
        }
    }
}
