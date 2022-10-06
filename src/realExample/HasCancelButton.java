package realExample;

import realExample.elements.CancelButton;

public interface HasCancelButton {

    CancelButton getCancelButton();

    default void verifyCancelButton() {


        if (getCancelButton().getNumberOf() == 3) {
            System.out.println("true");
        } else {
            System.out.println("dalse");
        }
    }
}
