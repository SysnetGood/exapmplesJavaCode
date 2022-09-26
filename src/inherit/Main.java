package inherit;

public class Main {

    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();

        System.out.println(dog instanceof Animal);
        System.out.println(cat instanceof Cat);
    }
}
