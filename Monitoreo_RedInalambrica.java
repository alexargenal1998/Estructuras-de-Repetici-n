/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package monitoreo_redinalambrica;
import java.util.Scanner;
import java.util.Random;


/**
 *
 * Monitoreo de Estabilidad de Red Inalámbrica
 * (Uso estricto de WHILE)
 * 
 * Alex Argenal - T32641001
 */
public class Monitoreo_RedInalambrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random ();
        int senal = 0;
        int mediciones = 0;
        System.out.println("Ingrese senal base en dBm:");
        System.out.println("Tener en cuenta que -1 finaliza el programa");
        senal = sc.nextInt();
        while (senal != -1){
            int ruido = rand.nextInt(51);
            mediciones ++;
            System.out.printf("Ruido:%d\n",ruido);
            if (senal < 20 || ruido >40){
            System.out.println("Alerta: Conexion inestable por baja senal o alta interferencia");
        } // Fin If
        else {
            System.out.println("Conexion estable");
        } // Fin Else
            System.out.printf("Senal:%d\n", senal);
            senal = sc.nextInt();
        } // Fin while
        System.out.printf("Mediciones: %d\n", mediciones);
    } // Fin Main
    
} // Fin Class
