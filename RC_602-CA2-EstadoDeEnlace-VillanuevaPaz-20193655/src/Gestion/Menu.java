/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion;

import java.util.*;

/**
 *
 * @author Matias
 */
public class Menu {
    public  static void Opciones(int[][]MatCostos1, int CantRouters1, int[][]MatCostos2,int CantRouters2) {
        Scanner entrada = new Scanner(System.in);
        int puerta = 0; //Variable que ayuda al inicio de las opciones.
        int opcion = 0; //Variable que almacena la opción elegida
        int origen = 0; //Variable para almacenar el router de origen.
        boolean t = true;
        EstadoDeEnlace Prueba = new EstadoDeEnlace();
        do {
            System.out.println("---------Algoritmo Estado de Enlace---------");
            System.out.println("\nBienvenido, ¿Que desea realizar?:");
            do {
                System.out.println("--------------------------------------------");
                System.out.println("1.Probar Topologia de dificultad Baja");
                System.out.println("2.Probar Topologia de dificultad Media");
                System.out.println("3.Imprimir las Matrices de Costos");
                System.out.println("4.Salir");
                System.out.println("--------------------------------------------");
                System.out.println("Opcion:");
                opcion = entrada.nextInt();
                //En caso no se seleecione una opcion valida se pide el reingreso de esta.
                if (opcion >= 1 && opcion <= 4) {
                    puerta = 1;
                } else {
                    System.out.println("Opción invalida, elija nuevamente: ");
                    puerta = 0;
                }
            } while (puerta == 0);
            if (opcion == 1) {//Si la opcion es 1
                do{//Se inicia nuevamente un bucle Do While para almacenar los datos ingresados por teclado.
                        t = false;
                        try{
                            System.out.println("Ingrese el Router de Origen: ");
                            origen =entrada.nextInt();
                            while(origen >= CantRouters1){//Si no se ingresa un router valido se pide que se vuelva a ingresar.
                                System.out.println("Debe ingresar un router valido: ");
                                origen=entrada.nextInt();
                            }
                        } catch (Exception e){//En caso se ingrese un caracter que no sea un numero salta un mensaje solicitando una router valida.
                             System.out.println("Debe ingresar un router valido: ");
                            t = true;
                            entrada.next();
                        }                        
                    }while(t);//Con los valores solicitados por teclado se realiza el Estado de enlace.
                double timer = System.nanoTime();
                Prueba.Dijkstra(CantRouters1,origen,MatCostos1); //Llamada a función Dijksta para mostrar el peso minimo del router de origen a los demás routers.
                double t1 = System.nanoTime();
                double res = (t1 - timer);
                System.out.printf("%nTiempo total de ejecución: %f",res);
                System.out.println("                                  ");
            } else if (opcion == 3) {
                int m = 0;
                System.out.println("¡Que Matriz desea imprimir?");
                System.out.println("--------------------------------------------");
                System.out.println("1.Matriz Topologia de dificultad Baja");
                System.out.println("2.Matriz Topologia de dificultad Media");
                System.out.println("--------------------------------------------");
                System.out.println("Opcion:");
                do{//Se inicia nuevamente un bucle Do While para almacenar los datos ingresados por teclado.
                        t = false;
                        try{
                            System.out.println("Ingrese una opción: ");
                            m =entrada.nextInt();
                            while(origen >= 3){//
                                System.out.println("Debe ingresar una opción valido: ");
                                m=entrada.nextInt();
                            }
                        } catch (Exception e){//En caso se ingrese un caracter que no sea un numero salta un mensaje solicitando una opcion valida.
                             System.out.println("Debe ingresar una opción valido: ");
                            t = true;
                            entrada.next();
                        }                        
                    }while(t);//Con los valores solicitados por teclado se realiza el Estado de enlace.
                
                if (m == 1) {
                    Prueba.ImprimirMatrizCostos(MatCostos1);//Llamada a la función para mostrar la matriz de costos.
                }else{
                    Prueba.ImprimirMatrizCostos(MatCostos2);//Llamada a la función para mostrar la matriz de costos.
                }
            } else if (opcion == 2) {
                do{//Se inicia nuevamente un bucle Do While para almacenar los datos ingresados por teclado.
                        t = false;
                        try{
                            System.out.println("Ingrese el Router de Origen: ");
                            origen =entrada.nextInt();
                            while(origen >= CantRouters1){//Si no se ingresa un router valido se pide que se vuelva a ingresar.
                                System.out.println("Debe ingresar un router valido: ");
                                origen=entrada.nextInt();
                            }
                        } catch (Exception e){//En caso se ingrese un caracter que no sea un numero salta un mensaje solicitando una router valida.
                             System.out.println("Debe ingresar un router valido: ");
                            t = true;
                            entrada.next();
                        }                        
                    }while(t);//Con los valores solicitados por teclado se realiza el Estado de enlace.
                double timer = System.nanoTime();
                Prueba.Dijkstra(CantRouters2,origen,MatCostos2); //Llamada a función Dijksta para mostrar el peso minimo del router de origen a los demás routers.
                double t1 = System.nanoTime();
                double res = (t1 - timer);
                System.out.printf("%nTiempo total de ejecución: %f",res);
            } else {
                puerta = 2;
            }
        } while (puerta != 2);
        System.out.println("Saliendo...");
    }
}
