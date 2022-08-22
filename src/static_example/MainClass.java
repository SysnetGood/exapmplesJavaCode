package static_example;

public class MainClass {

    public static void main(String[] args) {
        ClassWithStaticField obj1 = new ClassWithStaticField();
        obj1.x++;
        ClassWithStaticField obj2 = new ClassWithStaticField();
        obj2.x++;
        ClassWithStaticField obj3 = new ClassWithStaticField();
        obj3.x++;
        ClassWithStaticField obj4 = new ClassWithStaticField();
        obj4.x++;
        System.out.println(obj4.x);

        ClassNormalField obje1 = new ClassNormalField();
        obje1.x++;
        ClassNormalField obje2 = new  ClassNormalField();
        obje2.x++;
        ClassNormalField obje3 = new  ClassNormalField();
        obje3.x++;
        ClassNormalField obje4 =  new ClassNormalField();
        obje4.x++;
        System.out.println(obje4.x);
    }
}
