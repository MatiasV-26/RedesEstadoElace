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
public class EstadoDeEnlace {
    public static void Dijkstra(int CantRouters,int Origen,int[][]MatCostos){
        double timer = System.nanoTime();
        int dist[] = new int[CantRouters];//Se inicializa un arreglo que almacena las distancias de los Routers
        boolean Auxiliar[] = new boolean [CantRouters]; //Array auxiliar de tipo boolean.
        int PMin = 0; //Posición de Router que cuenta con el valor mínimo.
        //Bucle For que asigna el valor False a todos los elementos de Array Auxiliar.
        for (int i = 0; i < CantRouters; i++) {
            Auxiliar[i] = false;
        }
        //Metodo para copiar el Costo desde Origen al Array que almacena las Distancias.
        System.arraycopy(MatCostos[Origen], 0, dist, 0, CantRouters);
        //Se crea una variable x que ayudara al funcionamiento del bloque While.
        int x = 1;
        //Bucle While que termina una vez se hayan recorrido todos los Rouerts.
        while(x <= CantRouters){
            
            int Min = 100;//Se establece un valor minimo, este cuenta con un valor alto para que los pesos se vayan asignando correctamente al cumplir la restricción.
            //Bucle que se encarga de encontrar el peso minimo.
            for (int k = 0; k < CantRouters; k++) {
                //Si el valor de la distancia desde Origen al Rputer K es menor al minimo se le asigna como nuevo minimo.
                if(dist[k] < Min && Auxiliar[k] !=  true){
                    PMin = k;
                    Min = dist[k];
                }
            }
            
            Auxiliar[PMin] = true;//Se cambia a True en el Array auxiliar el Router que tenia el costo mínimo.
            
            x++;//El valor de x se va incrementando.
            
            for (int k = 0; k < CantRouters; k++) {//Bucle que va desde el primer router hasta el ultimo
                if(dist[PMin] + MatCostos[PMin][k] <  dist[k] && Auxiliar[k] != true){
                    dist[k] = dist[PMin] + MatCostos[PMin][k];
                    //System.out.println("De Router: "+Origen+" para llegar a "+k+" pasa por: ");
                    //System.out.println(PMin+"->");
                    
                }
            }
        }
        double t1 = System.nanoTime();
        double res = (t1 - timer);
        System.out.printf("%nTiempo total de ejecución: %f",res);
        for(int l = 0; l<CantRouters; l++){
            if(l != Origen){//Si el router es diferente del origen se imprime la distancia minima al origen.
                System.out.println("Router de destino : "+l+"\t Costo Minimo : "+dist[l]+"\t");//se imprime la información de distancia
                
            }
        }
    }
    public void ImprimirMatrizCostos(int[][]MatCostos){//Función para imprimir la matirz de costos
        
        for(int i = 0; i < MatCostos.length; i++){//bucle que recorre todo el array bidimensional y va imprimiendo los valores.
            System.out.println(Arrays.toString(MatCostos[i]));
        }        
    }
}
