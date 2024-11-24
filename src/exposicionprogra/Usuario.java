/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exposicionprogra;

import java.util.Random;

/**
 *
 * @author da_he
 */
public class Usuario {
    //atributos
    String nombre;
    int puntuacion;
    int barcos_hundidos;
    int rondas_ganadas;
    
    
    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getBarcos_restantes() {
        return barcos_hundidos;
    }

    public void setBarcos_restantes(int barcos_restantes) {
        this.barcos_hundidos = barcos_restantes;
    }

    public int getRondas_ganadas() {
        return rondas_ganadas;
    }

    public void setRondas_ganadas(int rondas_ganadas) {
        this.rondas_ganadas = rondas_ganadas;
    }
    
    //constructor

    public Usuario(String nombre, int puntuacion, int barcos_restantes, int rondas_ganadas) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
        this.barcos_hundidos = barcos_restantes;
        this.rondas_ganadas = rondas_ganadas;
    }
    
    //metodos
    static void tablerousuario(){
        Random random = new Random();
        
        int row1 = random.nextInt(0,5);
        int column1= random.nextInt(0,5);
        int row2 = random.nextInt(0,5);
        int column2= random.nextInt(0,5);
        int row3 = random.nextInt(0,5);
        int column3= random.nextInt(0,5);
        
        char[][] usertab = new char[5][5];
        usertab[row1][column1]='*';
        usertab[row2][column2]='*';
        usertab[row3][column3]='*';
        
        for (int i =0; i<5; i++){
            for (int j=0; j<5; j++){
                if (usertab[i][j]==0){
                    System.out.print("[ ] ");
                }
                else{
                System.out.print("["+ usertab[i][j] + "]"+ " ");
                }
            }
            System.out.println();
        }
    }
    
    //tostring

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", puntuacion=" + puntuacion + ", barcos_restantes=" + barcos_hundidos + ", rondas_ganadas=" + rondas_ganadas + '}';
    }
    
    
    
}
