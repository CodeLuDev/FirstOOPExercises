package entidad;

public class Vehiculo {

    private String marca;
    private String modelo;
    private int anno;
    private String tipo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int anno, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anno = anno;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
