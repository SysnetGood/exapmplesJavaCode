package overlaping;

public class Over extends OverParent implements  NumberOfItems{
    @Override
    public int getNumberOfItems() {
        return 5;
    }

    public void showArray () {

    }

    public void showArray (int [] array) {

    }

    public int showArray (int numberOfItems) {
        return 5;
    }

}
