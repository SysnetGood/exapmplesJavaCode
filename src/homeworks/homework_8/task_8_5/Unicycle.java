package homeworks.homework_8.task_8_5;

public class Unicycle  extends Cycle{

    @Override
    public void ride(){
        wheels = 1;
        System.out.println("Unicycle has " + getWheels() + " wheel");
    }

    public void balance () {
        System.out.println("Unicycle has balance");
    }
}
