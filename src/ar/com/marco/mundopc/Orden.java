package ar.com.marco.mundopc;

public class Orden {
    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private final static int MAX_COMPUTADORAS=10;
    private int contadorComputadoras;

    public Orden(){
        this.idOrden=++Orden.contadorOrdenes;
        computadoras = new Computadora[Orden.MAX_COMPUTADORAS];

    }

    public void agregarComputadora(Computadora computadora){
        if(this.contadorComputadoras<Orden.MAX_COMPUTADORAS){
            this.computadoras[this.contadorComputadoras++]=computadora;
        }
        else{
            System.out.println("Numero maximo de computadoras alcanzado: "+ Orden.MAX_COMPUTADORAS);
        }
    }
    public void mostrarOrden(){
        System.out.println("Orden: "+this.idOrden);
        System.out.println("Computadoras de la Orden: #" + this.idOrden);
        for (int i = 0; i < contadorComputadoras; i++) {
            System.out.println(this.computadoras[i]);
        }
    }
}
