package realExample;

import realExample.block.PopUp;

public class MainPage extends BasePage implements HasPopUpBlock {

    @Override
    public PopUp getPopUp() {
        return new PopUp();
    }
}
