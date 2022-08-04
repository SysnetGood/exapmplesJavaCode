package sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        PrintNumbers printer = new PrintNumbers();
        printer.printNumber(number);
    }

    public void printNumber (int number) {
        PrintNumbers printer = new PrintNumbers();
        switch (number) {
            case 0 : {
                printer.printZero();
                break;
            }case 1 : {
                printer.printOne();
                break;
            }case 2 : {
                break;
            }case 3 : {
                break;
            }case 4 : {
                break;
            }case 5 : {
                break;
            }case 6 : {
                break;
            }case 7 : {
                break;
            }case 8 : {
                break;
            }case 9 : {
                break;
            } default: {
                System.out.println("NaN");
            }
        }
    }

    private char [][] printZero() {
        char [][] array = {
                {' ', '*', '*', ' '},
                {'*', ' ', ' ', '*'},
                {'*', ' ', ' ', '*'},
                {'*', ' ', ' ', '*'},
                {'*', ' ', ' ', '*'},
                {'*', ' ', ' ', '*'},
                {'*', ' ', ' ', '*'},
                {' ', '*', '*', ' '}
        };
       /* for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }*/
        return array;
    }

    private void printOne() {

    }
}
