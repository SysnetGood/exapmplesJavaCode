package annatationExamples.repAnnat;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(RepAnnatation.class)
public @interface MyAnnation {
    int value();
}
