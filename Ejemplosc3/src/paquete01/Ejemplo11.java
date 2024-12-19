/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

/**
 *
 * @author reroes
 */
public class Ejemplo11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creación de arreglo bidimensionales
        
        int[][] arreglo1 = {{1, 2}, {10, 12}};
        /*
        1      2
        10     12
        */
        int[][] arreglo2 = {{3, 4}, {20, 40}};
        /*
        3      4
        20     40
        */
        int[][] sumaArreglo = new int[2][2]; //
        /*
        4    6
        30   52
        */
        // en este codigo el tercer arreglo se ocupa para sumar los dos anteriores
        //arreglos, por ello se ocupan dos arreglos y uno vacio
        int valor1;
        int valor2;
        
        for (int fila = 0; fila < arreglo1.length; fila++) {
            for (int col = 0; col < arreglo1[fila].length; col++) {
                valor1 = arreglo1[fila][col];
                valor2 = arreglo2[fila][col];
                sumaArreglo[fila][col] = valor1 + valor2;
            }
        }
        
        for (int fila = 0; fila < sumaArreglo.length; fila++) {
            for (int col = 0; col < sumaArreglo[fila].length; col++) {
                System.out.printf("%d\t", sumaArreglo[fila][col]);
            }
            System.out.println("");
        }
    }
    
}
