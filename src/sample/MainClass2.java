package sample;

public class MainClass2 {

    public static void main(String[] args) {

        int[][] mArray = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 0},

        };

        int temp;

        for (int i = 0; i < mArray.length; i++) {
            for (int j = 0; j < mArray[i].length; j++) {
                System.out.print(mArray[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        int i = 0;

        for (int j = 0; j < mArray[i].length; j++) {
            temp = mArray[i][j];
            mArray[i][j] = mArray[i + 1][j];
            mArray[i + 1][j] = temp;
        }

        for (int x = 0; x < mArray.length; x++) {
            for (int j = 0; j < mArray[x].length; j++) {
                System.out.print(mArray[x][j]);
            }
            System.out.println();
        }
    }
}
