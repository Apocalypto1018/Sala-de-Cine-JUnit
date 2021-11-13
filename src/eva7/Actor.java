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
    public Actor(String nombre, int edad, String nacionalidad, char sexo){
        this.nombre=nombre;
        this.edad=edad;
        this.nacionalidad=nacionalidad;
        this.sexo=sexo;
    }
    
    //toString
    public String toSring(){
        return "Nombre: "+this.nombre+" Edad: "+this.edad+" Nacionalidad: "+this.nacionalidad+" sexo: "+this.sexo;
    }

    //setters
    public void setNombre(String nombre){
        this.nombre=nombre;
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
