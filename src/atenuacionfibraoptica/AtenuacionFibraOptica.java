/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atenuacionfibraoptica;
import java.util.Scanner;
import java.util.Random;
/**
 *Simulación de Atenuación de Fibra Óptica 
 *(Uso estricto de FOR)
 * 
 * Alex Argenal - T32641001
 */
public class AtenuacionFibraOptica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double potencia =0;
        int distancia= 0;
        System.out.println("Ingrese la potencia inicial del laser en mW");
        potencia = sc.nextDouble();
        System.out.println("Ingrese la distancia total en Km");
        distancia = sc.nextInt();
        if (potencia > 0 && distancia > 0){
            for (int i=1; i<=distancia; i++){
                potencia=potencia*0.96;
                System.out.printf("Kilometros: %d, Potencia: %.2f %n",i, potencia);
                if (potencia < 5){
                    System.out.printf("Perdida de senal critica en el kilometro %d. Se require un repetidor. \n",i);
                    break;  
                }//Fin If
            } //Fin For
        } else{
            System.out.println("Potencia y distancia deben de ser >0");
        } // Fin Else If 
    } // Fin Main
    
} // Fin Class
