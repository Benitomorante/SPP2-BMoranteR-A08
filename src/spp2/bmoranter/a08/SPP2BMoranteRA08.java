/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.bmoranter.a08;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class SPP2BMoranteRA08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Este programa promedia el contenido de las posiciones pares y suma el contenido de las posiciones nones de un arreglo//
    
    int promedio;
    int SumaPar=0;
    int SumaNon=0;
    int cont=0;
    
    int[][]matrix= {{10,30,89,48,56},
                   {32,23,84,20,10},
                   {72,108,71,402,8}};
    
    // i inicia en 0, el ciclo se ejcuta mientras i < tamaño del arreglo
    // i se incrementa de dos en dos
    
    for (int i=0; i<matrix.length; i++){
        for (int j=0; j<matrix[i].length; j=j+2){
        SumaPar= SumaPar + matrix[i][i];
        cont ++;
        }
    }
    
    promedio= SumaPar/cont;
        System.out.println("El promedio es "+ promedio);
    for (int i=0; i<matrix.length;i++){
        for (int j=1; j<matrix[i].length; j=j+2){
    }
    }
        System.out.println("La suma de nones es "+ SumaNon);
        
    
    
    
}}