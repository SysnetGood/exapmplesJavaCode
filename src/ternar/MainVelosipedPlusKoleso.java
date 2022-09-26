package ternar;

import java.time.LocalDate;

public class MainVelosipedPlusKoleso {

    public static void main(String[] args) {

        Velosiped aist = new Velosiped();

        aist.setCena(10.25);
        aist.setDataVypuska(LocalDate.of(2022, 12, 25));
        aist.setName("Aist");
        aist.setKolesa(
                new Koleso[]{
                        new Koleso().setRadius(15),
                        new Koleso().setRadius(15)
                }
        );

        Velosiped aist2 = new Velosiped();

        aist2.setCena(10.25);
        aist2.setDataVypuska(LocalDate.of(2022, 12, 25));
        aist2.setName("Aist2");
        aist2.setKolesa(
                new Koleso[]{
                        new Koleso().setRadius(15),
                        new Koleso().setRadius(15)
                }
        );

        Velosiped aist3 = aist;
        aist3.setName("Aist3");

        Velosiped zubrenok = new Velosiped();

        zubrenok.setCena(10.35);
        zubrenok.setDataVypuska(LocalDate.of(2022, 11, 25));
        zubrenok.setName("Zubrenok");
        zubrenok.setKolesa(
                new Koleso[]{
                        new Koleso().setRadius(13),
                        new Koleso().setRadius(13)
                }
        );

        System.out.println(aist.toString());
        System.out.println(aist2.toString());
        System.out.println(aist3.toString());
        System.out.println(zubrenok.toString());
    }
}
