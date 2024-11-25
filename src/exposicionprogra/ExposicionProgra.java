/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exposicionprogra;

import java.util.Scanner;

public class ExposicionProgra {

    public static void main(String[] args) {
        //main
        int barcoshund=0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bienvenido, cual es su nombre: ");
        String nombre = scanner.nextLine();
        boolean tryagain=true;
        do{
        
        Usuario user = new Usuario(nombre, 0, 0);
        Usuario compu = new Usuario("Computadora", 0, 0);
        
        System.out.println(nombre + " este es tu tablero con tus barcos");
        user.mostrar();
        
        boolean again = true;
        
        System.out.println();
        
        do {
            
            System.out.println("Turno de " + nombre);
            compu.tablero.tablerom();
            System.out.println("Ingresa tu fila (0-4) para hacer tu ataque: ");
            int fila = scanner.nextInt();
            System.out.println("Ingresa tu columna (0-4) para hacer tu ataque: ");
            int columna = scanner.nextInt();
            
            boolean acierto = compu.tablero.ataque(fila, columna, user);
            
            
            if (acierto) {
                System.out.println("Acertaste.");
                System.out.println("Ganaste 100 puntos");
                System.out.println();
                user.puntuacion+=100;
                barcoshund++;
            } else {
                System.out.println("Fallaste! Ahora es el turno de la computadora.");
                System.out.println("Perdiste 10 puntos");
                user.puntuacion-=10;
                boolean aciertoCompu;
                
                do{
                    
                    aciertoCompu = compu.tablero.ataquecompu(user);
                    if(aciertoCompu){
                        System.out.println("La computadra acerto");
                        System.out.println("Turno de la computadora: ");
                    }
                    else{
                        System.out.println("La computadora fallo");
                    }
                    System.out.println("Este es tu tablero actualizado: ");
                    user.tablero.tablerou();
                    
                }while(aciertoCompu);
               
            }

            if (user.win()) {
                System.out.println(nombre + " has ganado.");
                user.setRondas_ganadas(user.getRondas_ganadas()+1);
                again=false;
            } else if (compu.win()) {
                System.out.println("La computadora ha ganado.");
                again=false;
            }
            
        } while (again);
        System.out.println("Deseas volver a jugar [s/n]: ");
                String resp = scanner.next();
                if (resp.equalsIgnoreCase("s")){
                    tryagain=true;
                }
                else{
                    System.out.println(user.toString()+", barcos_hundidos="+ barcoshund);
                    tryagain=false;
                }
    }while(tryagain);
        
    }
}