package sample;

//Output 4247

//append +
//insert +
//delete +
//replace +

public class MainNaN {

    public static void main(String[] arg) {
        StringBuilder sb = new StringBuilder("0123456789");

        sb.append(4247);
        sb.delete(0,10);

        System.out.println(sb);


        StringBuilder sb2 = new StringBuilder("0123456789");

        sb2.insert(5,247);

        sb2.replace(0,4, "").replace(4,9, "");

        System.out.println(sb2);
    }

   /* public static void main(String[] args) {
        String s = "0123456789";

        s = s.concat("4247");
        s = s.substring(10, 14);

        System.out.println(s);

        String s2 = "0123456789";

        String [] array = s2.split("4");
        s2 = array[0] + "44247" + array[1];

        System.out.println(s2);

    }*/
}
