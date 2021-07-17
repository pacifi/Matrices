package com.innovandoperu.utils;

public class Utilidades {

    public void imprimirMatriz(int[][] matriz) {

        for (int x = 0; matriz.length > x; x++) {
            for (int y = 0; matriz[x].length > y; y++) {
                System.out.print("\t" + matriz[x][y]);
            }
            System.out.println("");

        }

    }

    public void imprimirMatrizSupIzq(int[][] matriz) {
        int i, j;
        int dim = matriz.length;
        for (i = 0; i < dim; i++) {
            for (j = 0; j < dim; j++) {
                if (j < dim - i)
                    System.out.print("\t" + matriz[i][j]);
                else
                    System.out.print("\t ");
            }
            System.out.println("");
        }
    }

    public void imprimirMatrizInfDer(int[][] matriz) {

        int i, j;
        int dim = matriz.length;
        for (i = 0; i < dim; i++) {
            for (j = 0; j < dim; j++) {
                if (j + i >= dim - 1)
                    System.out.print("\t" + matriz[i][j]);
                else
                    System.out.print("\t ");
            }
            System.out.println("");
        }
    }

    public void imprimirMatrizInfIzq(int[][] matriz) {

        int i, j;
        int dim = matriz.length;
        for (i = 0; i < dim; i++) {
            for (j = 0; j < dim; j++) {
                if (j <= i)
                    System.out.print("\t" + matriz[i][j]);
                else
                    System.out.print("\t ");
            }
            System.out.println("");
        }
    }

    public void imprimirMatrizSupDer(int[][] matriz) {

        int i, j;
        int dim = matriz.length;
        for (i = 0; i < dim; i++) {
            for (j = 0; j < dim; j++) {
                if (j >= i)
                    System.out.print("\t" + matriz[i][j]);
                else
                    System.out.print("\t ");
            }
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
