package Model;

public class Model {
    
    private String name;
    private String eleccion;
    private int almacen;
    private float precio;
        
    public String getName() {
        return name;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public String getEleccion() {
        return eleccion;
    }

    public String setEleccion(String eleccion) {
        return this.eleccion = eleccion;
    }

    public int getAlmacen() {
        return almacen;
    }

    public void setAlmacen(int almacen) {
        this.almacen = almacen;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
}
