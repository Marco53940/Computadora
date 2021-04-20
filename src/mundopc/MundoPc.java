package mundopc;

import ar.com.marco.mundopc.*;

public class MundoPc {
    public static void main(String[] args) {
        Monitor monitor1 = new Monitor("HP", 13);
        Teclado telcado1 = new Teclado("USB", "dell");
        Raton raton1 = new Raton("USB", "Hp");
        Computadora computadora1= new Computadora("AllInOne",monitor1,telcado1,raton1);

        Monitor monitorGamer = new Monitor("HP", 13);
        Teclado telcadoGamer = new Teclado("USB", "dell");
        Raton ratonGamer = new Raton("USB", "Hp");
        Computadora computadoraGamer= new Computadora("AllInOne",monitor1,telcado1,raton1);
        Orden orden1= new Orden();
        orden1.agregarComputadora(computadora1);
        orden1.agregarComputadora(computadoraGamer);
        orden1.mostrarOrden();



    }
}
