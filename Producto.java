/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.Clases;

/**
 *
 * @author damdu112
 */
public class Productos {
        public static enum Categoria {
        ORDENADOR, TELEFONOS, LAVADORAS, FRIGORIFICOS, COCINAS, TELEVISIONES 
    };
    
    private String nombre;
    private String numSerie;
    private String marca;
    private int cantidad;
    private int precio;

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Productos(String nombre, String numSerie, String marca, int cantidad, int precio) {
        this.nombre = nombre;
        this.numSerie = numSerie;
        this.marca = marca;
        this.cantidad = cantidad;
        this.precio = precio;
    }



    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Productos{");
        sb.append("nombre=").append(nombre);
        sb.append(", numSerie=").append(numSerie);
        sb.append(", marca=").append(marca);
        sb.append('}');
        return sb.toString();
    }
    
}

