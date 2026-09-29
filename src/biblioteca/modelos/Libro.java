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
    private EstadoLibro estado;
    
    public void mostrar(){
        System.out.println(titulo);
        System.out.println(autor);
        System.out.println(anioDePublicacion);
        System.out.println(precio);
        System.out.println(estado);
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

    public EstadoLibro verEstado() {
        return estado;
    }

    public void asignarEstado(EstadoLibro es) {
        this.estado = es;
    }

    public Libro(String titulo, String autor, int anioDePublicacion, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioDePublicacion = anioDePublicacion;
        this.precio = precio;
        this.estado = EstadoLibro.DISPONIBLE;
    }
    
    
}
