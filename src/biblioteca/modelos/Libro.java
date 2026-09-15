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
    public String titulo;
    public String autor;
    public int anioDePublicacion;
    public double precio;
    public boolean disponible;
    
    public void mostrar(){
        System.out.println(titulo);
        System.out.println(autor);
        System.out.println(anioDePublicacion);
        System.out.println(precio);
        System.out.println(disponible);
    }
}
