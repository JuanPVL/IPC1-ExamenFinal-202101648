/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenfinal;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class ExamenFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
    
        // TODO code application logic here
        imprimirMenu();
        opcion=sc.nextInt();
            switch (opcion){
                case 1:
                    //Problema 1
                    System.out.println("Comparacion de números");
                    int num1;
                    int num2;
                    System.out.println("Escriba un primer número: ");
                    num1 = sc.nextInt();
                    System.out.println("Escriba un segundo número: ");
                    num2 = sc.nextInt();
                    if(num1>num2){
                        System.out.println("El primer número que ingreso es mayor al segundo: " + num1 + ">" + num2);
                    } else {
                        System.out.println("El segundo número que ingreso es mayor al primero: " + num2 + ">" + num1);
                    }
                     break;
                case 2:
                    //Problema 2
                    System.out.println("Piramide Números Impares");
                    int numFilas;
                    boolean numeroImpar = false;
                    do{
                    System.out.println("Ingrese número de filas: ");
                    numFilas = sc.nextInt();
         
                    System.out.println();
                    if(numFilas%2!=0){
                        numeroImpar = true;
                    }else{
                        System.out.println("No es posible ingresar números pares, por favor ingrese uno impar");
                    }
                        System.out.println();
                    }while(!numeroImpar);
                      for(int altura=1;altura<=numFilas;altura++){
                        for(int blanco=1;blanco<=numFilas-altura;blanco++){
                            System.out.print(" ");
                        }
                        for(int asterisco=1;asterisco<=(altura*2)-numFilas;asterisco++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }  
                    
                    
                    break;
                case 3:
                    //Problema 3
                    String numeroVacas,pesoMax,pesoVaca,produccionLeche,salida;
                    
                    System.out.println("Ingrese el número de vacas disponibles para compra: ");
                    numeroVacas = sc.next();
                    String [] arrSplit = numeroVacas.split(",");
                    break;
                case 4: {System.exit(0);
            } break;
                default:
                    System.out.println("Opción Incorrecta");     
    }
    }        
   public static void imprimirMenu(){
        System.out.println("♣♣♣♣♣Menu♣♣♣♣♣");
        System.out.println("********************");
        System.out.println("* 1. Problema 1    *");
        System.out.println("* 2. Problema 2    *");
        System.out.println("* 3. Problema 3    *");
        System.out.println("* 4. Salir         *");
        System.out.println("********************");
        System.out.println("Ingrese una opción");
            
} 
}

