package interfacesAndEnumsExample.enumExample;

public class MainEnumClass {
    public static void main(String[] args) {
        TrafficLight [] array = TrafficLight.values();

        for (TrafficLight light: array
             ) {
            System.out.println(light.getCommand(light));
        }

        System.out.println();

        for (TrafficLight light: array
        ) {
            System.out.println(light.getCommand());
        }
    }
}
