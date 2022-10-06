package realExample;

import realExample.elements.SaveButton;

public interface HasSaveButton {

    SaveButton getSaveButton();

    default void verifySaveButton() {
        if (getSaveButton().helloWorld() == 1) {
            System.out.println("true");
        } else {
            System.out.println(false);
        }
    }
}
