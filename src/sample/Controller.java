package sample;


public class Controller {

    public static void main(String[] args) {
        int [] firstArrayOfNumbers = {545,21,4231,4332};
        int [] secondArrayOfNumbers = {4, 7,2,77,32, 32, 532342134, 2};

        int [] finishArrayOfNumbers = new int[firstArrayOfNumbers.length + secondArrayOfNumbers.length];

        int tempIndex = 0;

        for (int i = 0; i < firstArrayOfNumbers.length; i++) {
            finishArrayOfNumbers[i] = firstArrayOfNumbers[i];
            tempIndex = i;
        }

        tempIndex++;

        for (int i = 0; i < secondArrayOfNumbers.length; i++) {
            finishArrayOfNumbers[tempIndex] = secondArrayOfNumbers[i];
            tempIndex++;
        }

        for (int i = 0; i < finishArrayOfNumbers.length; i++) {
            System.out.print(finishArrayOfNumbers[i] + " ");
        }

        System.out.println();

        int i = 0;
        int tempNumber;
        boolean flag;

        do {

            flag = false;

            for (int j = 0; j < finishArrayOfNumbers.length - i - 1; j++) {
                if (finishArrayOfNumbers[j] > finishArrayOfNumbers[j + 1]) {
                    tempNumber = finishArrayOfNumbers[j];
                    finishArrayOfNumbers[j] = finishArrayOfNumbers[j + 1];
                    finishArrayOfNumbers[j + 1] = tempNumber;
                }
                flag = true;
            }
            i++;
        } while (flag);

        for (int j = 0; j < finishArrayOfNumbers.length; j++) {
            System.out.print(finishArrayOfNumbers[j] + " ");
        }
    }
}
