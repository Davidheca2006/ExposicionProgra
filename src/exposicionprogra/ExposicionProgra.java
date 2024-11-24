/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exposicionprogra;

import java.util.Scanner;

/**
 *
 * @author da_he
 */
public class ExposicionProgra {

    /**
     * @param args the command line arguments
     */
    static Usuario user = new Usuario("",0,0,0);
    static Usuario compu = new Usuario("Computadora",0,0,0);
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner (System.in);
        System.out.println("Bienvenido, cual es su nombre: ");
        String nombre = scanner.next();
        user = new Usuario(nombre, 0, 0, 0);
        boolean again=true;
        do{
            System.out.println("Turno de "+ nombre);
            Usuario.tablerousuario();
            
            
        }while(again);
    }
    
}
