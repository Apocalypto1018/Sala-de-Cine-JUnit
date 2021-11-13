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
    
    public Actor actor;
    
    //constructor
    public Pelicula(){
        
    }
    
    //constructor sobrecargado
    public Pelicula(String titulo, String genero, String director, String protagonista, int edad, String nacionalidad, char sexo){
        this.titulo=titulo;
        this.genero=genero;
        this.director=director;
        
        this.actor.setNombre(protagonista);
        this.actor.setEdad(edad);
        this.actor.setNacionalidad(nacionalidad);
        this.actor.setSexo(sexo);
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
    public void getDactosActor(){
        this.actor.toSring();
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
    
    public void setProtagonista(String protagonista, int edad, String nacionalidad, char sexo){
        this.actor.setNombre(protagonista);
        this.actor.setEdad(edad);
        this.actor.setNacionalidad(nacionalidad);
        this.actor.setSexo(sexo);
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
