package work_with_files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {

    /*public static void main(String[] args) {
        FileReader fileReader = null;
        String s = "";
        List<String> arrays = new ArrayList<>();
        try {
            fileReader = new FileReader("C:\\Q1822\\exapmplesJavaCode\\src\\resources\\file_products.txt");
            int i;
            while ((i = fileReader.read()) != -1) {
                if ((char) i != '\n') {
                    s += (char) i;
                } else {
                    arrays.add(s);
                    s = "";
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found " + e);
        } catch (IOException ex) {
            System.out.println("file not readable " + ex);
        } finally {

            try {
                fileReader.close();
            } catch (IOException e) {
                System.out.println("Can't close file " + e);
            }
        }

        for (String str : arrays) {
            System.out.println(str);
        }
    }*/


    public static void main(String[] args) {
        MainClass mainClass = new MainClass();
        List<String> magaz = mainClass.readFile();

        Scanner sc = new Scanner(System.in);

        int chtoMenyaem = sc.nextInt();
        String s = magaz.get(chtoMenyaem);
        String[] array = s.split(",");
        array[2] = "45.3";

        String afterChanges = "";

        for (int i = 0; i < array.length; i++) {

            afterChanges += array[i];
            if (i != array.length - 1) {
                afterChanges += ",";
            }
        }

        magaz.remove(chtoMenyaem);
        magaz.add(afterChanges);
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter("C:\\Q1822\\exapmplesJavaCode\\src\\resources\\file_products.txt"));
            for (String str1 : magaz
            ) {
                bufferedWriter.write(str1);
                bufferedWriter.newLine();

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.flush();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }


    public List readFile() {
        List<String> magaz = new ArrayList<>();
        String line;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Q1822\\exapmplesJavaCode\\src\\resources\\file_products.txt"));
            while ((line = bufferedReader.readLine()) != null) {
                magaz.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String str : magaz) {
            System.out.println(str);
        }
        String[] array = magaz.get(0).split(",");
        double stoimost = Double.parseDouble(array[2]);
        System.out.println("stoimost = " + stoimost);
        return magaz;
    }
}
