/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.modelos;

/**
 *
 * @author estudiante
 */
public class Libro {
    private String titulo;
    private String autor;
    private int anioDePublicacion;
    private double precio;
    private boolean disponible;
    
    public void mostrar(){
        System.out.println(titulo);
        System.out.println(autor);
        System.out.println(anioDePublicacion);
        System.out.println(precio);
        System.out.println(disponible);
    }

    public String verTitulo() {
        return titulo;
    }

    public void asignarTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String verAutor() {
        return autor;
    }

    public void asignarAutor(String autor) {
        this.autor = autor;
    }

    public int verAnioDePublicacion() {
        return anioDePublicacion;
    }

    public void asignarAnioDePublicacion(int anioDePublicacion) {
        this.anioDePublicacion = anioDePublicacion;
    }

    public double verPrecio() {
        return precio;
    }

    public void asignarPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void asignarDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Libro(String titulo, String autor, int anioDePublicacion, double precio, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioDePublicacion = anioDePublicacion;
        this.precio = precio;
        this.disponible = disponible;
    }
    
    
}
