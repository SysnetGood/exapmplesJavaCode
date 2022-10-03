package annatationExamples;

import annatationExamples.repAnnat.MyAnnation;
import annatationExamples.repAnnat.RepAnnatation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@ExampleAnnatation(value = 100, value2 = "sdasda")
@ExampleAnnatation2("world")
@MyAnnation(100)
@MyAnnation(200)
@MyAnnation(500)
@Controller
public class Main {

    public static void main(String[] args) {
        var b = 100;
        myMethod();
        System.out.println(isControllerAnnatationPresent());
    }


    UserDBService val;


    public static void myMethod () {
        Main m = new Main();
        try {
            Annotation[] array= m.getClass().getAnnotations();
            for (Annotation annatation: array
                 ) {
                System.out.println(annatation);
            }
        } catch (Exception e) {

        }
    }

    public static boolean isControllerAnnatationPresent () {
        return Main.class.isAnnotationPresent(Controller.class);
    }
}
