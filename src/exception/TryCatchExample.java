package exception;

import java.util.Arrays;

public class TryCatchExample {

    public static void main(String[] args) {
        TryCatchExample tryCatchExample = new TryCatchExample();
        try (System.in) {
//            openConnection();
        } catch (Exception e) {
           try {
//               sendErrorMessage();
           } catch (ClassCastException ex) {
           }
        }

        tryCatchExample.tryingArrayClass();
    }

    public void getName () throws ClassCastException {
        throw new ClassCastException("Hello from ClassCastException");
    }

    public void tryingArrayClass (){
        int [] arr1 = {1,2,3,4};
        int [] arr2 = {1,2,3,4};
        Arrays.compare(arr1, 3, 2, arr2, 1,2);
    }
}
