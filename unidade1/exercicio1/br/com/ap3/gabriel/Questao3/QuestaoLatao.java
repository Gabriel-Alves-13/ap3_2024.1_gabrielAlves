package br.com.ap3.gabriel.Questao3;

import java.util.Scanner;
/* 
 *Codigo Secreto = 950460735
 * explicação da classe
 * 
 * @author GabrielAlves
 * @since 14/08/2024
 * 
 */

public class QuestaoLatao {

    public static void main(String[] args) {
        
        System.out.println("Digite a quantidade em quilos que deseja fazer de latão");

        Scanner teclado = new Scanner(System.in);
    
        double latao = teclado.nextDouble();
    
        double cobre = latao * 0.7;
    
        double zinco = latao * 0.3;


        System.out.println("para que a liga seja feita, será nescessario " + cobre + 
        " quilogramas de cobre e " + zinco + " quilogramas de zinco");
        teclado.close();
    }


}
