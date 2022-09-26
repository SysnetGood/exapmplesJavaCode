package ternar;

public class ForForEach {

    private int[] array = new int[10];

    public void forSample() {
        for (int i = 0; i > array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public void forEachSample() {
        for (int num : array) {
            System.out.println(num);
        }
    }
}
