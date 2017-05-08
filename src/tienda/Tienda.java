/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import java.util.Scanner;

/**
 *
 * @author dci
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           
        Scanner intro = new Scanner(System.in);
        int compras;
        int puntostotalesA = 0;
        int puntostotalesB = 0;
        int valortotal=0;
        int puntoshistoricos = 0;
        int valorpuntos = puntoshistoricos*10;
        int opcion;
      
        System.out.println("Ingrese la cantidad de compras que desea realizar"); 
        compras = intro.nextInt();
        
        for ( int cont = 1; cont<=compras; cont++) {
            System.out.println("Ingrese el codigo del producto numero "+cont);
            int codigo = intro.nextInt();
            System.out.println("Ingrese el valor del producto");
            int valor = intro.nextInt();   
            if ((codigo>=100) && (codigo<200)){
                puntostotalesA = puntostotalesA+(int)(valor/100);
                puntostotalesB = puntostotalesB+(int)(valor/50);
            }
            if ((codigo>=200)&& (codigo<300)){
                puntostotalesA = puntostotalesA+(int)(valor/50);
                puntostotalesB = puntostotalesB+(int)(valor/30);
   
            }
            if (valortotal<=10000){
                System.out.println("Sus puntos totales acumulados durante esta compra , hasta el momentos son "+puntostotalesA);
                puntoshistoricos=puntoshistoricos+puntostotalesA;
                System.out.println("Sus puntos acumulados hasta la fecha son "+puntoshistoricos);
                if (valorpuntos>=valortotal){
                    System.out.println("Hasta el momento sus puntos cubren el valor total de la compra");
                    do{ 
                    System.out.println("¿Desea cancelar su compra con puntos?\n"
                             + "1- si\n"
                             + "2- no\n");
                     opcion = intro.nextInt();
                     switch (opcion) {
                         case 1:
                             valorpuntos=valorpuntos-valortotal;
                             valortotal=0;
                         case 2:
                             break;
                }
                if (valorpuntos<valortotal){
                    System.out.println("Hasta el momento sus puntos no cubren el valor total de la compra");
                }
                    }while ((opcion<1)||(opcion>2));
                }
            }
            if (valortotal>10000){
                System.out.println("Sus puntos totales acumulados hasta el momento son "+puntostotalesB);
                puntoshistoricos=puntoshistoricos+puntostotalesB;
                System.out.println("Sus puntos acumulados hasta la fecha son "+puntoshistoricos);
                if (valorpuntos>=valortotal){
                    System.out.println("Hasta el momento sus puntos cubren el valor total de la compra");
                    do{
                    System.out.println("¿Desea cancelar su compra con puntos?\n"
                             + "1- si\n"
                             + "2- no\n");
                      opcion = intro.nextInt();
                     switch (opcion) {
                         case 1:
                             valorpuntos=valorpuntos-valortotal;
                             valortotal=0;
                         case 2:
                             break;
                         default:
                             System.out.println("Por favor escriba 1 o 2 segun corresponda");
                     }
                }while ((opcion<1)||(opcion>2));
                if (valorpuntos<valortotal){
                    System.out.println("Hasta el momento sus puntos no cubren el valor total de la compra");
                }
            }    
            }
       
                        }
        
               }
        
}