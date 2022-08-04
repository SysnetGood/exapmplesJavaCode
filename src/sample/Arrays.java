package sample;

public class Arrays {
    public static void main(String[] args) {
        String[][][][] array =
                {
                        {
                                {
                                        {"Hello", "World"}
                                }
                        },
                        {
                                {
                                        {"Hello2", "World1"}
                                }
                        },
                        {
                                {
                                        {"Hello3", "World2"}
                                }
                        }
                };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    for (int l = 0; l < array[i][j][k].length; l++) {
                        System.out.print(array[i][j][k][l] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
