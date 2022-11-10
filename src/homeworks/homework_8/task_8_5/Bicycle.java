package homeworks.homework_8.task_8_5;

public class Bicycle extends Cycle{

    @Override
    public void ride(){
        wheels =  2;
        System.out.println("Bicycle has " + getWheels() + " wheels");
    }

    public void balance () {
        System.out.println("Bicycle has balance");
    }
}
