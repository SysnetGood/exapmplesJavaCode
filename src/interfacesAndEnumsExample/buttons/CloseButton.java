package interfacesAndEnumsExample.buttons;

import interfacesAndEnumsExample.Elements;

public class CloseButton extends Button{

    public CloseButton () {
        super.element = Elements.CLOSE_BUTTON;
    }

    @Override
    public void click() {
        System.out.println("Click on the CLOSE button");
    }
}
