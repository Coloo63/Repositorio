/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliografìa;

import java.util.Scanner;

/**
 *
 * @author JORGE DANIEL UVILLA
 */
public class Bibliografìa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner read= new Scanner(System.in).useDelimiter("\n");
        Libro libro1= new Libro("ISBN", 0, "autor", "titulo");
         //System.out.println(libro1.getAutor());
         //libro1.setAutor("pepe");
         // el "set te permite ir a la clase y buscar el elemento si no es "public".
         // el get te permite retornar ese valor
       
        System.out.println("Escriba autor , titulo, isbn y cant de paginas de libro1");
        libro1.setAutor(read.next());
        libro1.setTitulo(read.next ());
        libro1.setISBN(read.next());
        libro1.setNumero_de_paginas(read.nextInt());
                
        
        System.out.println(libro1);
                
    }
    
}
