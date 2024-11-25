/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exposicionprogra;

import java.util.Random;

 public class Tablero {
    int rows;
    int columns;
    char[][] tablero;
    char[][] maquina;
    int barcos_restantes;

    public Tablero(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.tablero = new char[rows][columns];
        this.maquina = new char[rows][columns];
        this.barcos_restantes = 3;
        inicio();
    }

    private void inicio() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                tablero[i][j] = ' ';
                maquina[i][j] = ' ';
            }
        }
    }

    public void colocar() {
        Random r = new Random();
        int bcolocados = 0;

        while (bcolocados < barcos_restantes) {
            int row = r.nextInt(rows);
            int col = r.nextInt(columns);

            if (tablero[row][col] == ' ') {
                tablero[row][col] = '*';
                bcolocados++;
            }
        }
    }

    public void tablerou() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("[" + tablero[i][j] + "] ");
            }
            System.out.println();
        }
    }

    public void tablerom() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("[" + maquina[i][j] + "] ");
            }
            System.out.println();
        }
    }

    public boolean ataque(int row, int col, Usuario usuario) {
        if (tablero[row][col] == '*') {
            tablero[row][col] = 'X';
            maquina[row][col] = 'X';
            usuario.barcohundido();
            barcos_restantes--;
            return true;
        } else if (tablero[row][col] == ' ') {
            maquina[row][col] = '-';
            usuario.tablero.tablero[row][col]='-';
            return false;
        }
        
        return false;
    }

    public int getBarcos_restantes() {
        return barcos_restantes;
    }

    public void setBarcos_restantes(int barcos_restantes) {
        this.barcos_restantes = barcos_restantes;
    }

    @Override
    public String toString() {
        return "Tablero{" + "rows=" + rows + ", columns=" + columns + ", barcos_restantes=" + barcos_restantes + '}';
    }
}