package realExample.block;

import realExample.HasCancelButton;
import realExample.HasCloseButton;
import realExample.HasSaveButton;
import realExample.elements.CancelButton;
import realExample.elements.CloseButton;
import realExample.elements.SaveButton;

public class PopUp implements HasSaveButton, HasCloseButton, HasCancelButton {

    public CancelButton cancelButton = new CancelButton();
    public SaveButton saveButton = new SaveButton();
    public CloseButton closeButton = new CloseButton();

    @Override
    public CancelButton getCancelButton() {
        return cancelButton;
    }

    @Override
    public CloseButton getCloseButton() {
        return closeButton;
    }

    @Override
    public SaveButton getSaveButton() {
        return saveButton;
    }
}
