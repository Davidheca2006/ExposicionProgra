/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exposicionprogra;

 public class Usuario {
     //atributos
    String nombre;
    int puntuacion;
    int barcos_hundidos;
    int rondas_ganadas;
    Tablero tablero;
    
    //constructor
    public Usuario(String nombre, int puntuacion, int rondas_ganadas) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
        this.rondas_ganadas = rondas_ganadas;
        this.barcos_hundidos = 0;  
        this.tablero = new Tablero(5, 5);  
        this.tablero.colocar();  
    }
    
    //seters getters
    public void mostrar() {
        tablero.tablerou();  
    }

    public boolean win() {
        return barcos_hundidos==3;  
    }

    public void barcohundido() {
        barcos_hundidos++;  
    }

    public int getBarcosHundidos() {
        return barcos_hundidos;
    }

    public int getRondas_ganadas() {
        return rondas_ganadas;
    }

    public void setRondas_ganadas(int rondas_ganadas) {
        this.rondas_ganadas = rondas_ganadas;
    }
    
    
    
    //metodo
    public void setBarcosHundidos(int barcos_hundidos) {
        this.barcos_hundidos = barcos_hundidos;
    }
    
    //to string
    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", puntuacion=" + puntuacion + ", rondas_ganadas=" + rondas_ganadas + '}';
    }
}