package interfacesAndEnumsExample.inputs;

import interfacesAndEnumsExample.ClickElement;
import interfacesAndEnumsExample.ClickableElements;
import interfacesAndEnumsExample.Elements;

public class Input extends ClickableElements implements ClickElement {

    public Input () {
        super.element = Elements.INPUT_ELEMENT;
    }

    @Override
    public void click () {
        System.out.println("Click on the INPUT element");
    }
}
