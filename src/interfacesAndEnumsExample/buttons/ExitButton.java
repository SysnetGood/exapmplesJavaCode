package interfacesAndEnumsExample.buttons;

import interfacesAndEnumsExample.Elements;

public class ExitButton extends Button {

    public ExitButton () {
        super.element = Elements.EXIT_BUTTON;
    }

    @Override
    public void click() {
        System.out.println("Click on the EXIT button");
    }
}
