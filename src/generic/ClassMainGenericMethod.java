package generic;

import java.util.ArrayList;
import java.util.List;

public class ClassMainGenericMethod {

    public static void main(String[] args) {
        Animals cat = new Cat();
        //Fruits orange = new Orange();

        List<Animals> zoo = new ArrayList<>();
/*        setValueToArray(zoo, cat);
        setValueToArray(zoo, orange);

        List<Fruits> basketOfFruits = new ArrayList<>();

        setValueToArray(basketOfFruits, orange);
        setValueToArray(basketOfFruits, cat);*/
        List<? extends Animals> zooWithNewAnimals;
        Dog dog = new Dog();
        zooWithNewAnimals =setValueToArray(zoo, dog);
        zooWithNewAnimals = setValueToArray(zoo, cat);

        for (Animals a: zooWithNewAnimals
             ) {
            a.saySomething();
        }

    }

    public static <T> List<T> setValueToArray(List<T> zoo, T animal) {
        zoo.add(animal);
        return zoo;
    }


    public void innreClass () {
        class B extends Animals{
            public void click(){

            }
        }
        B b = new B();
        b.click();
    }
}
