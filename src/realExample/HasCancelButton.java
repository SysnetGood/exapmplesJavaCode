package realExample;

import realExample.elements.CancelButton;

public interface HasCancelButton {

    CancelButton getCancelButton();

    default void verifyCancelButton() {
        getCancelButton().getNumberOf();
    }
}
