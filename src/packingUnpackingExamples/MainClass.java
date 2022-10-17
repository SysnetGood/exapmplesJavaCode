package packingUnpackingExamples;

public class MainClass {

    public static void main(String[] args) {
        Integer i = new Integer(10);
        Integer i2 = new Integer ("asda");
        Integer i3 = Integer.valueOf("15");



        Integer i5 = new Integer(10);
        Integer i7 = 25;

        int i6 = i5.intValue();

        int i8 =  i7;


        System.out.println(i.compareTo(i2));

    }

}
