package com.innovandoperu.app;

import com.innovandoperu.utils.Teclado;
import com.innovandoperu.utils.Utilidades;

public class Matriz {
    Teclado lt = new Teclado();

    public void matrizSuperioIzquerdaDesendente() {
//        0	    1	3	6	10
//        2	    4	7	11
//        5	    8	12
//        9	    13
//        14
        int matriz[][];
        int dim, i, j, db, item;
        dim = lt.leer(0, "Ingrese dimensión");
        matriz = new int[dim][dim];
        db = lt.leer(0, "Ingrese Dirección Base");

        for (i = 0; i < dim; i++) {
            for (j = 0; j < dim; j++) {
                item = db + (i + j) * (i + j + 1) / 2 + i;
                matriz[i][j] = item;

            }
        }
        System.out.println("Lectura de asignacion de Matriz");

        Utilidades utilidades = new Utilidades();
        utilidades.imprimirMatriz(matriz);
        System.out.println("");
        utilidades.imprimirMatrizSupIzq(matriz);
        System.out.println("");
        utilidades.imprimirMatrizInfDer(matriz);
        System.out.println("");
        utilidades.imprimirMatrizSupDer(matriz);
        System.out.println("");
        utilidades.imprimirMatrizInfIzq(matriz);


    }

    public void matrizTriangularSuperioIzquerdaAscendente() {
//        0	    2	5	9	14
//        1	    4	8	13
//        3	    7	12
//        6	    11
//        10
        int matriz[][], dim, i, j, db, item;
        dim = lt.leer(0, "Ingrese Dimenssion");
        matriz = new int[dim][dim];
        db = lt.leer(0, "Ingrese Direccion Base");
        for (i = 0; i < dim; i++) {
            for (j = 0; j < dim; j++) {
                item = db + (i + j) * (i + j + 1) / 2 + j;
//                item = direccionBase + (i + j) * (i + j + 1) / 2 + i;
                matriz[i][j] = item;
            }
        }

        Utilidades utilidades = new Utilidades();
        utilidades.imprimirMatrizSupIzq(matriz);


    }

    public void matrizSuperiorZigZag() {
        int matriz[][], dim, i, j, db, item;

        dim = lt.leer(0, "INGRESAR DIMENSION DE LA MATRIZ : ");
        matriz = new int[dim][dim];
        db = lt.leer(0, "Ingrese Dirección Bae");

        for (i = 0; i < dim; i++) {
            for (j = 0; j < dim; j++) {
                if ((i + j) % 2 == 0) {
                    item = db + (i + j) * (i + j + 1) / 2 + j;

                    matriz[i][j] = item;
                } else {
                    item = db + (i + j) * (i + j + 1) / 2 + i;
                    matriz[i][j] = item;
                }
            }

        }
        System.out.println("\nLECTURA DE ASIGNACION DE MATRIZ\n");
        Utilidades utilidades = new Utilidades();
        utilidades.imprimirMatrizSupIzq(matriz);


    }

    public void matrizSuperiorDerechaZigZagInferior() {
        int matriz[][], dim, i, j, db, item;


        dim = lt.leer(0, "INGRESAR DIMENSION DE LA MATRIZ : ");
        matriz = new int[dim][dim];
        db = lt.leer(0, "Ingrese Dirección Bae");
        for (i = 0; i < dim; i++) {
            for (j = 0; j < dim; j++) {
                if ((i + j) % 2 == 0) {
                    item = db + (i + j) * (i + j + 1) / 2 + i;

                    matriz[i][j] = item;
                } else {
                    item = db + (i + j) * (i + j + 1) / 2 + j;
                    matriz[i][j] = item;
                }
            }
        }
        System.out.println("\nLECTURA DE ASIGNACION DE MATRIZ\n");
        Utilidades utilidades = new Utilidades();
        utilidades.imprimirMatrizSupIzq(matriz);

    }

    public void matrizSuperior() {
        int matriz[][], dim, i, j, db, item;
        dim = lt.leer(0, "INGRESAR DIMENSION DE LA MATRIZ : ");
        matriz = new int[dim][dim];
        db = lt.leer(0, "Ingrese Dirección Bae");
        int jInvertido;
        for (i = 0; i < dim; i++) {
            jInvertido = dim - 1;
            for (j = 0; j < dim; j++) {
                item = db + (i + j) * (i + j + 1) / 2 + i;
                matriz[i][jInvertido] = item;
                jInvertido--;
            }
        }
        System.out.println("\nLECTURA DE ASIGNACION DE MATRIZ\n");
        Utilidades utilidades = new Utilidades();
        utilidades.imprimirMatriz(matriz);

    }


}
