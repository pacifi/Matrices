package com.innovandoperu.utils;

public class Utilidades {

    public void imprimirMatriz(int[][] matriz) {

        for (int x = 0; matriz.length > x; x++) {
            for (int y = 0; matriz[x].length > y; y++) {
                System.out.print(matriz[x][y] + "\t");
            }
            System.out.println("");
            System.out.println("");
        }

    }


    public void imprimirVector(int[] vector) {
        System.out.print("[");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);
            System.out.print(",");
        }
        System.out.print("]");
    }

    public void imprimirVector(String[] vector) {
        System.out.print("[");
        for (int i = 0; vector.length > i; i++) {
            System.out.print(vector[i]);
            System.out.print(",");
        }
        System.out.print("]");
    }
}
