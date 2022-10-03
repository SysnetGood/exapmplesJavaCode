package annatationExamples;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface ExampleAnnatation {
    int value ();
    String value2 ();
}
