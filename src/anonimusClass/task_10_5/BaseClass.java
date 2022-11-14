package anonimusClass.task_10_5;

public class BaseClass {

    private int count = 0;

    public void doSmth() {
        new BaseClass() {
            public void doSmthAnonymus() {
                System.out.println("Hello from anonimusClass");
                super.count = 15;
                super.showCount();
            }
        }.doSmthAnonymus();
    }

    private void showCount() {
        System.out.println("Count = " + count);
    }
}
