package generic.classwork;

public class CreatorAvtoparka {
    public static void main(String[] args) {
        Avtopark<ParkPlace> avtopark = new Avtopark<>();


        ParkPlace<Raketa> raketaPlace = new ParkPlace<>();
        Raketa r1 = new Raketa();
        raketaPlace.setTransport(r1);


        ParkPlace<Avtomobil> avtomobilPlace = new ParkPlace<>();
        Avtomobil a1 = new Avtomobil();
        avtomobilPlace.setTransport(a1);

        avtopark.addTransport(raketaPlace);
        avtopark.addTransport(avtomobilPlace);

        for (ParkPlace t: avtopark.getAvtotransport()
             ) {
            System.out.println(t.toString());
        }
    }
}
