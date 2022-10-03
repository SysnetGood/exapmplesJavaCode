package interfacesAndEnumsExample.enumExample;

public enum TrafficLight  {

    GREEN ("GO"),
    RED ("STOP"),
    YELLOW ("WAIT");

    private final String command;

    TrafficLight (String command) {
        this.command = command;
    }

    String getCommand (TrafficLight traficColor) {
        switch (traficColor) {
            case RED: {
                return command;
            }
            case GREEN: {
                return command;
                            }
            case YELLOW: {
                return command;
                            }
            default: {
                return "Exception";
            }
        }
    }

    String getCommand () {
        return command;
    }

}
