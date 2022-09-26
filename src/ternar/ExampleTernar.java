package ternar;

public class ExampleTernar {

    public static int x = 10;
    public int y = 10;

    public void ifElse () {
        if (6>5) {
            System.out.println("true");
        } else if (6<5) {
            System.out.println("false");
        } else {
            System.out.println("bad");
        }
    }

    public String ternar() {
        x = 25;
        return getNum() > 10 ? "true" : getNum() < 10 ? "false" : "bad";
    }

    public int getNum () {
        return 7;
    }


}
