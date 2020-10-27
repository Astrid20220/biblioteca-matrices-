/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingclasematrices;

/**
 *
 * @author Astrid
 */
public class TestingClaseMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        arreglos manejador = new arreglos();
        
        
        int A[][];
        int E[][];
        int I[][];
        int O[]; 

        
   
   A=manejador.RellenarMatriz();
  manejador.imprimirMatriz(A);
        
   E=manejador.RellenarMatriz();
    manejador.imprimirMatriz(E);
        
   I=manejador.sumMatrices(A, E);
    manejador.imprimirMatriz(I);
  manejador.traspuesta(I);
     manejador.imprimirMatriz(I);
        
        
     O=manejador.RellenarArreglo();
   manejador.elementoMAyor(O);
 manejador.bubble(O);
 manejador.moda(O);
   manejador.imprimirArreglo(O);
        
        
    
     }
}
