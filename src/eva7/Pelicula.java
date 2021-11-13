/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva7;

/**
 *
 * @author 
 */
public class Pelicula {
    private String titulo;
    private String genero;
    private String director;
    
    private String auxProtagonista;
    private int auxEdad;
    private String auxNacionalidad;
    private char auxSexo;
    
    public Actor actor;
    //constructor
    public Pelicula(){
        
    }
    
    //constructor sobrecargado
    public Pelicula(String titulo, String genero, String director, String protagonista, int edad, String nacionalidad, char sexo){
        this.titulo=titulo;
        this.genero=genero;
        this.director=director;
        
        this.auxProtagonista=protagonista;
        this.auxEdad=edad;
        this.auxNacionalidad=nacionalidad;
        this.auxSexo=sexo;
        
        this.actor = new Actor(this.auxProtagonista, this.auxEdad, this.auxNacionalidad, this.auxSexo);
    }
    
    //metodo imprimir
    public void imprimir(){
        System.out.print("\n\n      *Datos de la Pelicula\n");
        System.out.println("Titulo: "+this.titulo);
        System.out.println("Genero: "+this.genero);
        System.out.println("Director: "+this.director);
        System.out.println("Protagonista: "+this.actor.getNombre());
    }
    
    //todos los datos del actor
    public void datosActor(){
        System.out.println("Nombre: "+this.actor.getNombre()+" Edad: "+this.actor.getEdad()+" Nacionalidad: "+this.actor.getNacionalidad()+" sexo: "+this.actor.getSexo());
    }
    
    //setters
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    
    public void setGenero(String genero){
        this.genero=genero;
    }
    
    public void setDirector(String director){
        this.director=director;
    }
   
    //getters
    public String getTitulo(){
        return this.titulo;
    }
    
    public String getGenero(){
        return this.genero;
    }
    
    public String getDirector(){
        return this.director;
    }
    
    public String getProtagonista(){
        return this.actor.getNombre();
    }
    
}
