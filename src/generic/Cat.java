package generic;


public class Cat extends Animals {

    @Override
    public void saySomething() {
        System.out.println("Hello from Cat");
    }

    public void sayMew() {
        System.out.println("Mew-mew");
    }
}
