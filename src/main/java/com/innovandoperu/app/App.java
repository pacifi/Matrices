package com.innovandoperu.app;


public class App {
    public static void main(String[] args) {
        Matriz matriz = new Matriz();
        int[][] mimatriz = matriz.matrizSuperioIzquerdaDesendente();
        matriz.imprimirMatriz(mimatriz);
        matriz.imprimirMatrizDerechaSuperior(mimatriz);
        matriz.imprimirMatrizIzquerdaInferior(mimatriz);
        matriz.imprimirMatrizIzquierdaSuperior(mimatriz);
        matriz.imprimirMatrizDerechaInferior(mimatriz);


    }
}
