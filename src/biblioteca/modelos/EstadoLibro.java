/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package biblioteca.modelos;

/**
 *
 * @author estudiante
 */
public enum EstadoLibro {
    DISPONIBLE("Disponible"),
    PRESTADO("Prestado");
    
    private String estado;
    
    private EstadoLibro(String estado){
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "EstadoLibro{" + "estado=" + estado + '}';
    }
    
    
}
