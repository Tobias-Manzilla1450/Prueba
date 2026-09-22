/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.controladores;

import biblioteca.modelos.Libro;
import java.util.ArrayList;

/**
 *
 * @author estudiante
 */
public class Main {
    public static void main(String[] args) {
        Libro unLibro1 = new Libro("gfdg", "dlbdf", 2000, 56.44f, true);
        Libro unLibro2 = new Libro("gjbs", "cbxvc", 1999, 87.41f, true);
        Libro unLibro3 = new Libro("nsdvh", "asdgd", 1988, 96.74f, true);
        Libro aux;
        
        int cantidad;
        ArrayList<Libro> libros = new ArrayList<>();       
        
        libros.add(unLibro1);
        libros.add(unLibro2);

        
        System.out.println("------ RECORRIDO ------");
        
        for(Libro lb : libros){
            lb.mostrar();
            System.out.println();
        }
        
        cantidad = libros.size();
        
        System.out.println("Libros en Total : " + cantidad);
        
        System.out.println();
        
        aux = libros.get(0);
        
        aux.mostrar();
        
        libros.set(0, unLibro3);
        
        for(Libro unlibro : libros){
            unlibro.mostrar();
            System.out.println();
        }
        
        libros.remove(0);
        
        for(Libro unlibro2 : libros){
            unlibro2.mostrar();
            System.out.println();
        }      
        
        Libro auxiliar2;
        auxiliar2 = libros.get(0);
        auxiliar2.asignarAnioDePublicacion(2010);
        
        System.out.println("------ DATOS ------");
        
        auxiliar2.mostrar();
    }
}
