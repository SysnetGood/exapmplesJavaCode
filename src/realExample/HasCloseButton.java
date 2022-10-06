package realExample;

import realExample.elements.CloseButton;

public interface HasCloseButton {

    CloseButton getCloseButton();

    default void verifyCloseButton() {

    }
}
