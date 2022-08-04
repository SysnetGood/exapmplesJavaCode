package sample;

public class TeachMethods {

    public static void main (String[] args) {
        TeachMethods newobj = new TeachMethods();

        int [] array = new int[5];

        newobj.showArray(array);

        newobj.modifyArray(array);

        newobj.showArray(array);
    }


    public void showArray (int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
    }


    public void modifyArray (int[] array) {
        array[0] = 1;
    }
}
