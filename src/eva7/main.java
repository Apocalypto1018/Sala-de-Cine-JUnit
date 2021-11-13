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
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SalaDeCine sala=new SalaDeCine();
        
        do{
            System.out.println("*Ingrese 1 para Agregar Pelicula");
            System.out.println("*Ingrese 2 para Listar Peliculas");
            System.out.print("*Ingrese 0 para Salir\n->");
            opc=sc.nextInt();
            
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

                }
            }
            
        }while(salir!=1);
    }
    
}
