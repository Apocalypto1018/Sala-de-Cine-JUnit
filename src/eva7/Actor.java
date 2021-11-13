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
public class Actor {
    private String nombre;
    private int edad;
    private String nacionalidad;
    private char sexo;
    
    //constructor
    public Actor(){
        
    }
    
    //constructor sobrecargado
    public Actor(String protagonista, int edad, String nacionalidad, char sexo){
        this.nombre=protagonista;
        this.edad=edad;
        this.nacionalidad=nacionalidad;
        this.sexo=sexo;
    }

    //setters
    public void setNombre(String protagonista){
        this.nombre=protagonista;
    }
    
    public void setEdad(int edad){
        this.edad=edad;
    }
    
    public void setNacionalidad(String nacionalidad){
        this.nacionalidad=nacionalidad;
    }
     
    public void setSexo(char sexo){
        this.sexo=sexo;
    } 
    
    //getters
    public String getNombre(){
        return this.nombre;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public String getNacionalidad(){
        return this.nacionalidad;
    }
     
    public char getSexo(){
        return this.sexo;
    } 
    
}
