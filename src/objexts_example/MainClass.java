package objexts_example;

public class MainClass {
    public static void main(String[] args) {
        ClassExample exObj = new ClassExample();
        showX(exObj); /*exType -> exLink -> exObj*/
        decrementClassExampleX(exObj);
    }

    public static void showX(ClassExample  exType /*exObject*/) {
        System.out.println(exType.x);
    }

    public static void decrementClassExampleX(ClassExample exType) {
        exType.x--;
    }
}
