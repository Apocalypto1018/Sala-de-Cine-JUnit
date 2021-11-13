/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva7;

import java.util.Scanner;

/**
 *
 * @author 
 */
public class main {
    private static int contadorPelis;
    
    private static Scanner sc=new Scanner(System.in);
    
    private static int opc, salir, nCaracteres;
    
    //auxiliares
    private static String Titulo;
    private static String Genero;
    private static String Director;
    private static String Protagonista;
    private static int edad;
    private static String Nacionalidad;
    private static char sexo;
    
    private static String buscarNacionalidad;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SalaDeCine sala=new SalaDeCine();
        contadorPelis=0;
        
        do{
            System.out.println("*Ingrese 1 para Agregar Pelicula");
            System.out.println("*Ingrese 2 para Listar Peliculas");
            //System.out.println("*Ingrese 3 para Saber la cantidad de mujeres actrices");
            //System.out.println("*Ingrese 4 para Saber la cantidad de actores jovenes por nacionalidad");
            System.out.print("*Ingrese 0 para Salir\n->");
            opc=sc.nextInt();
            
            sc.nextLine(); //se limpia el buffer
            
            switch(opc){
                case 0:{
                    System.out.println("Saliendo...");
                    salir=1;
                    break;
                }
                case 1:{
                    
                   do{
                        System.out.print("*Ingrese el TITULO de de la pelicula\n->");
                        Titulo=sc.nextLine();

                        nCaracteres=Titulo.length(); 

                        if(nCaracteres<6){ 
                            System.out.println("ERROR!, el Titulo no puede contener menos de 6 caracteres");
                        }
                    }while(nCaracteres<6);
                   
                    System.out.print("*Ingrese el GENERO de de la pelicula\n->");
                    Genero=sc.nextLine();
                    
                    System.out.print("*Ingrese el DIRECTOR de de la pelicula\n->");
                    Director=sc.nextLine();
                    
                    System.out.print("*Ingrese el PROTAGONISTA de de la pelicula\n->");
                    Protagonista=sc.nextLine();
                    
                    do{
                        System.out.print("*Ingrese la EDAD del protagonista\n->");
                        edad=sc.nextInt();  

                        if(edad<18){
                            System.out.println("ERROR!, la edad no puede ser menor a 18");
                        }
                    }while(edad<18); 
                    
                    sc.nextLine(); //se limpia el buffer
                    
                    System.out.print("*Ingrese la NACIONALIDAD del protagonista\n->");
                    Nacionalidad=sc.nextLine();
                    
                    do{
                        System.out.print("*Ingrese la letra M para Masculino o F para Femenino. Genero del protagoista \n->");
                        sexo=sc.next().charAt(0); //se lee el caracter   

                        if(sexo!='F' && sexo!='M'){
                            System.out.println("ERROR!, debe introducir o el caracter M, o el caracter F para indicar un genero");
                        }
                    }while(sexo!='F' && sexo!='M'); 
                    
                    sc.nextLine(); //se limpia el buffer
                       
                    sala.agregarPelicula(Titulo, Genero, Director, Protagonista, edad, Nacionalidad, sexo, contadorPelis);
                    contadorPelis++;
                    
                    break;
                }
                
                case 2:{
                    sala.ListarPeliculas(contadorPelis);
                    break;
                }
                
                /*case 3:{
                    System.out.println("La cantidad de mujeres actrices es: "+sala.ActricesMujeres(contadorPelis));
                    break;
                }
                
                case 4:{
                    System.out.print("*Ingrese la nacionalidad a buscar actores en el rango de 18 a 30 años\n->");
                    buscarNacionalidad=sc.nextLine();
                    System.out.print("La cantidad de actores jovenes de la nacionalidad:"+buscarNacionalidad);
                    System.out.println(" es de: "+sala.ObtenerActoresJovenes(buscarNacionalidad));
                    break;
                }*/
                
                default:{
                    System.out.print("\nParametro no valido, itente de nuevo\n\n");
                    break;
                }
            }
            
        }while(salir!=1);
    }
    
}
