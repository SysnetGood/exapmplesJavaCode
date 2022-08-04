package sample;

public class JavaMethodsExamplesWithReturnValues {

    public void doSms1() {

    }

    public int doSms2() {
        return 3;
    }

    public double doSms3() {
        return 3.5;
    }

    public String doSms4() {
        return " ";
    }

    public char [][] doSms5() {
        char [] [] array = new char[1][3];
        return array;
    }

    public char [][] doSms7() {
        return new char[1][3];
    }

    public float doSms6() {
        return 3.5f;
    }

    public Velic doSmth8 (){
        return new Velic();
    }

    public Velic doSmth9 (){
        Velic velic = new Velic();
        return velic;
    }
}

class Velic {

}
