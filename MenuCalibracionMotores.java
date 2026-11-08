/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menucalibracionmotores;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author alexa
 */
public class MenuCalibracionMotores {

    /**
     * Menú de Calibración de Motores Paso a Paso 
     * (Uso estricto de DO-WHILE)
     * 
     * Alex Argenal - T32641001
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Random rand = new Random();
        int opcion=0;
        double error=0;
        do {
            System.out.println("Menu de Calibracion de Motores Paso a Paso");
            System.out.println("1. Calibrar el eje X");
            System.out.println("2. Calibrar el eje Y");
            System.out.println("3. Salir de calibracion");
            opcion= sc.nextInt();
            switch (opcion){
                case 1:
                case 2:
                error = rand.nextDouble()*5;
                if (error > 2.5){
                    System.out.printf("Calibracion del eje fallida: Error de %.2f mm. Requiere ajuste manual\n", error);
                    
                } // Fin If
                else {
                    System.out.printf("Eje calibrado exitosamente con error de: %.2f mm \n", error);
                } //Fin else
                break;
                case 3:
                    System.out.println("Saliendo de modo calibracion");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }//Fin Switch
        } while (opcion != 3);// Fin Do
    }// Fin Main
    
}// Fin Class
