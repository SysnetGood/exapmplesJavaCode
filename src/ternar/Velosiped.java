package ternar;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class Velosiped {

     private LocalDate dataVypuska;
     private double cena;
     private String name;
     private Koleso [] kolesa = new Koleso[2];

     public void setDataVypuska(LocalDate dataVypuska) {
          this.dataVypuska = dataVypuska;
     }

     public void setCena(double cena) {
          this.cena = cena;
     }

     public void setName(String name) {
          this.name = name;
     }

     public void setKolesa(Koleso[] kolesa) {
          this.kolesa = kolesa;
     }

     public String getName() {
          return name;
     }

     @Override
     public boolean equals(Object o) {
          if (this == o) return true;
          if (o == null || getClass() != o.getClass()) return false;
          Velosiped velosiped = (Velosiped) o;
          return Double.compare(velosiped.cena, cena) == 0 &&
                  Objects.equals(dataVypuska, velosiped.dataVypuska) &&
                  Objects.equals(name, velosiped.name) &&
                  Arrays.equals(kolesa, velosiped.kolesa);
     }

     @Override
     public int hashCode() {
          int result = Objects.hash(dataVypuska, cena, name);
          result = 31 * result + Arrays.hashCode(kolesa);
          return result;
     }

     @Override
     public String toString() {
          return "Velosiped " + name +  ": dataVypuska=" + dataVypuska + ", cena=" + cena + ", koleso1=" + kolesa[0].toString() + ", koleso2=" + kolesa[1].toString();
     }
}
