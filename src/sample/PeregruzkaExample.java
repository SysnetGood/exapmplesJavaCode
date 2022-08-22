package sample;

public class PeregruzkaExample {

    public static void main(String... arg) {
        PeregruzkaExample obj = new PeregruzkaExample();
        int[][] arr = new int[10][10];
        int[] arr2 = new int[10];
        int[] arr3 = new int[10];
        int[] arr4 = new int[10];
        int[] arr5 = new int[10];
        System.out.println();


        //obj.showArray(arr, arr2, arr3, arr4, arr5);
        //obj.showArray(1, 2, 3, 5, 6, 7, 8, 9, 10);
        obj.showArray(arr);
    }

 /*   public void showArray(int[] ... array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    public void showArray(int... array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    */

    public void showArray(int [][] array) {
        for (int[] arr : array) {
            for (int nameOfVariable : arr) {
                System.out.print(nameOfVariable);
            }
            System.out.println();
        }
    }
}
