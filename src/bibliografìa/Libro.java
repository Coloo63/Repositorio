/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliografìa;



/**
 *Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas
 * @author JORGE DANIEL UVILLA
 */
public class Libro { 
    
    
    private String ISBN;
    private int numero_de_paginas;
    private String autor;
    private String titulo;
    
    public Libro(){
    
                }
    public Libro(String ISBN, int numero_de_paginas, String autor, String titulo){
    this.numero_de_paginas= numero_de_paginas;
    this.ISBN=ISBN;
    this.autor= autor;
    this.titulo= titulo;
            
}

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
       
    }
    
    public void setNumero_de_paginas(int numero_de_paginas) {
        this.numero_de_paginas = numero_de_paginas;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getNumero_de_paginas() {
        return numero_de_paginas;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", numero_de_paginas=" + numero_de_paginas + ", autor=" + autor + ", titulo=" + titulo + '}';
    }
    

    
    }


  
    
 

