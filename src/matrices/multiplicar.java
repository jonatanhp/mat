/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;

import java.util.Scanner;

/**
 *
 * @author jonatan
 */
public class multiplicar {
    private static Scanner sc;
 
    public static void main(String[] args) {
        //int[][] matriz = new int[3][3];
        int [][] matriz = {{40,2,4},{6,8,10},{2,5,3}};
        //inicializar(matriz);
       
        visualizar(matriz);
        sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();
        
        multiplicar(matriz, num);
        visualizar(matriz);
    }
     
    static void multiplicar(int[][] pMatriz, int numero){
        for(int i=0;i<pMatriz.length;i++){
            for(int j=0;j<pMatriz[i].length;j++){
                pMatriz[i][j] *= numero;
            }
        }
    }
     
    /*static void inicializar(int[][] pMatriz){
        for(int i=0;i<pMatriz.length;i++){
            for(int j=0;j<pMatriz[i].length;j++){
                pMatriz[i][j] = (int) (Math.random() * 10) + 1;
            }
        }
    }*/
     
    static void visualizar(int[][] pMatriz){
        for(int i=0;i<pMatriz.length;i++){
            for(int j=0;j<pMatriz[i].length;j++){
                System.out.print("\t" + pMatriz[i][j]);
            }
            System.out.println();
            
            
        }
    }
}
