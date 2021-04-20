package ar.com.marco.mundopc;

public class DispositivoEntrada {
    private String tipoEntrada;
    private String marca;

    public DispositivoEntrada(String tipoEntrada, String marca){
        this.marca=marca;
        this.tipoEntrada=tipoEntrada;
    }

    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "DispositivoEntrada{" +
                "tipoEntrada='" + tipoEntrada + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
