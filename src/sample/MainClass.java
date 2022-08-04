package sample;

public class MainClass {

    public static void main(String[] args) {
        String [] [] stringArray =
                {
                        {"A", "B", "C"},
                        {"D", "E", "F", "J"},
                        {"I", "K", "L", "M", "M"}
                };

        for (int i = 0; i < stringArray.length; i++) {

            for (int j = 0; j < stringArray[i].length; j++) {
                System.out.print(stringArray[i][j]);
            }

            System.out.println();
        }

        showString(stringArray[1][2]);
        showString(stringArray[0][0]);
    }

    public static void showString (String s) {
        System.out.println(s);
    }
}
