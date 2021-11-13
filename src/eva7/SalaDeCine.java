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
public class SalaDeCine {
    private Pelicula[] arrayPeliculas =new Pelicula[100]; 
    private int contador;
    private int nMujeres, nActoresJovenes;
    
    public SalaDeCine(){
        
    }
    
    public void agregarPelicula(String Titulo, String Genero, String Director, String Protagonista, int edad, String nacionalidad, char sexo, int Contador){
        this.contador=Contador;
        
       arrayPeliculas[contador]= new Pelicula(Titulo, Genero, Director, Protagonista, edad, nacionalidad, sexo);
       
       arrayPeliculas[contador].setTitulo(Titulo);
       arrayPeliculas[contador].setGenero(Genero);
       arrayPeliculas[contador].setDirector(Director);
    }
    
    public boolean buscarPelicula(String Titulo, int Contador){
        this.contador=Contador;
        
        for(int i=0;i<contador;i++){
            
            if(arrayPeliculas[i].getTitulo().equals(Titulo)){
                return true;
            }
        }
        
        return false;
    }
    
    public void ListarPeliculas(int Contador){
        this.contador=Contador;
        
        for(int i=0;i<contador;i++){
            
            System.out.println("Titulo: "+arrayPeliculas[i].getTitulo());
            System.out.println("Genero: "+arrayPeliculas[i].getGenero());
            System.out.println("Protagonista: "+arrayPeliculas[i].getProtagonista());
           
        }
    }
    
    public int ActricesMujeres(int Contador){
        this.contador=Contador;
        
        for(int i=0;i<contador;i++){
            
            if(arrayPeliculas[i].actor.getSexo()=='F'){
                this.nMujeres+=1;
            }
           
        }
        
        return this.nMujeres;
    }
    
    public int ObtenerActoresJovenes(String nacionalidad){
        
        for(int i=0;i<contador;i++){
            
            if(arrayPeliculas[i].actor.getEdad()>=18 && arrayPeliculas[i].actor.getEdad()<=30 && arrayPeliculas[i].actor.getNacionalidad().equals(nacionalidad)){
                 nActoresJovenes++;
            }
           
        }
        
        return nActoresJovenes;
    }
    
}

