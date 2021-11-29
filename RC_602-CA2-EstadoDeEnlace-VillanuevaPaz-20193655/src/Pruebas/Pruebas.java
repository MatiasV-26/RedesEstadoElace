/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import Gestion.Menu;
import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class Pruebas {
    public static void main(String[] args) {
        int[][] Pesos1 = {
            {0, 2, 8, 4, 999, 999, 999}, 
            {2, 0, 999, 999, 999, 999, 999}, 
            {8, 999, 0, 999, 6, 999, 999}, 
            {5, 999, 999, 0, 7, 4, 999},
            {999, 999, 6, 7, 0, 3, 999},
            {999, 999, 999, 4, 3, 0, 4},
            {999, 999, 999, 999, 999, 4, 0},
            
        }; 
        int[][] Pesos2 = {
            {0, 5, 999, 999, 999, 999, 999, 999, 999, 999, 999}, 
            {5, 0, 4, 999, 999, 999, 999, 999, 999, 999, 2}, 
            {999, 4, 0, 6, 999, 999, 999, 999, 7, 999, 999}, 
            {999, 999, 6, 0, 3, 5, 999, 999, 999, 999, 999},
            {999, 999, 999, 3, 0, 999, 999, 999, 999, 999, 999},
            {999, 999, 999, 5, 999, 0, 2, 3, 999, 999, 999},
            {999, 999, 999, 999, 999, 2, 0, 1, 999, 4, 999},
            {999, 999, 999, 999, 999, 3, 1, 0, 8, 999, 999},
            {999, 999, 7, 999, 999, 999, 999, 8, 0, 6, 999 },
            {999, 999, 999, 999, 999, 999, 4, 999, 6, 0, 4},
            {999, 2 ,999, 999, 999, 999, 999, 999, 999, 4, 0},
            
        };
        Menu x = new Menu();
        Menu.Opciones(Pesos1,7 , Pesos2, 11);
    }
    
}
