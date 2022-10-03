package interfacesAndEnumsExample.buttons;

import interfacesAndEnumsExample.Elements;

public class SaveButton extends Button {

    public SaveButton () {
        super.element = Elements.SAVE_BUTTON;
    }

    @Override
    public void click() {
        System.out.println("Click on the SAVE button");
    }
}
