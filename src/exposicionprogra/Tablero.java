/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exposicionprogra;

/**
 *
 * @author da_he
 */
public class Tablero {
    //atributos
    int rows;
    int columns;
    char[][] tablero;
    int barcos_restantes;
    
    //getters y setters
    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public char[][] getTablero() {
        return tablero;
    }

    public void setTablero(char[][] tablero) {
        this.tablero = tablero;
    }

    public int getBarcos_restantes() {
        return barcos_restantes;
    }

    public void setBarcos_restantes(int barcos_restantes) {
        this.barcos_restantes = barcos_restantes;
    }
    
    //constructor

    public Tablero(int rows, int columns, char[][] tablero, int barcos_restantes) {
        this.rows = rows;
        this.columns = columns;
        this.tablero = tablero;
        this.barcos_restantes = barcos_restantes;
    }
    
    //to string

    @Override
    public String toString() {
        return "Tablero{" + "rows=" + rows + ", columns=" + columns + ", tablero=" + tablero + ", barcos_restantes=" + barcos_restantes + '}';
    }
    
    
}
