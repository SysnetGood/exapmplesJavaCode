package realExample;

import realExample.block.PopUp;

public interface HasPopUpBlock {

    PopUp getPopUp();

    default void verifySaveButton() {
        getPopUp().saveButton.helloWorld();
    }

    default void verifyCloseButton() {
        getPopUp().closeButton.sayOK();
    }

    default void verifyCancelButton() {
        getPopUp().cancelButton.getNumberOf();
    }
}
