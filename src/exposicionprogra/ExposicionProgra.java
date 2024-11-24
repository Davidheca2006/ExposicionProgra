/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exposicionprogra;

import java.util.Scanner;

public class ExposicionProgra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bienvenido, cual es su nombre: ");
        String nombre = scanner.nextLine();
        
        Usuario user = new Usuario(nombre, 0, 0);
        Usuario compu = new Usuario("Computadora", 0, 0);
        
        boolean again = true;
        
        do {
            System.out.println(nombre + " este es tu tablero con tus barcos");
            user.mostrar();
            
            System.out.println("Turno de " + nombre);
            compu.tablero.tablerom();
            System.out.println("Ingresa tu fila (0-4) para hacer tu ataque: ");
            int fila = scanner.nextInt();
            System.out.println("Ingresa tu columna (0-4) para hacer tu ataque: ");
            int columna = scanner.nextInt();
            
            boolean acierto = compu.tablero.ataque(fila, columna, user);
            
            if (acierto) {
                System.out.println("Acertaste.");
            } else {
                System.out.println("Fallaste! Ahora es el turno de la computadora.");
                boolean aciertoCompu = user.tablero.ataque(fila, columna, compu);
                if (aciertoCompu) {
                    System.out.println("La computadora acerto.");
                } else {
                    System.out.println("La computadora fallo.");
                }
            }

            if (user.win()) {
                System.out.println(nombre + " has ganado.");
                again = false;
            } else if (compu.win()) {
                System.out.println("La computadora ha ganado.");
                again = false;
            }

        } while (again);
    }
}