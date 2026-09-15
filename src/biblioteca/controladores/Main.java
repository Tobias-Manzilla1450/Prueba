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
        Libro l1 = new Libro();
        Libro l2 = new Libro();
        Libro libro3 = new Libro();
        Libro aux;
        int cantidad;
        ArrayList<Libro> libros = new ArrayList<>();
        
        l1.titulo = "askoas";
        l1.anioDePublicacion = 2020;
        l1.autor = "askasfaxzc";
        l1.disponible = true;
        l1.precio = 73.45;
        
        l2.titulo = "asokzvxbe";
        l2.autor = "kdnbjodn";
        l2.anioDePublicacion = 2000;
        l2.disponible = false;
        l2.precio = 45.12;
        
        libro3.autor = "hdjashdka";
        libro3.anioDePublicacion = 1991;
        libro3.disponible = true;
        libro3.titulo = "askadcxcv";
        libro3.precio = 41.78;
        
        libros.add(l2);
        libros.add(l1);

        for(Libro lb : libros){
            lb.mostrar();
            System.out.println();
        }
        
        cantidad = libros.size();
        
        System.out.println("Libros en Total : " + cantidad);
        
        aux = libros.get(0);
        
        aux.mostrar();
        
        libros.set(0, libro3);
        
        for(Libro unlibro : libros){
            unlibro.mostrar();
        }
        
        libros.remove(0);
        
        for(Libro unlibro2 : libros){
            unlibro2.mostrar();
        }
        
    }
}
