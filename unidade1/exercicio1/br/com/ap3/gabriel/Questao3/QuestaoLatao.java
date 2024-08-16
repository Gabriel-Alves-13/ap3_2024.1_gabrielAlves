package br.com.ap3.gabriel.Questao3;

import java.util.Scanner;
/*Codigo Secreto = 950460735
 *
 *  A classe a seguir eh responsavel por fazer o calculo da quantidade dde cobre e zinco nescessario para se obter uma
 *  liga perfeira de latao, sendo 70% cobre e 30% zinco
 * 
 * @author GabrielAlves
 * @since 15/08/2024
 * 
 */

public class QuestaoLatao {

    public static void main(String[] args) {
        
        /*Fazendo a solicitação da quantidade em quilos que será feito de latão */
        System.out.println("Digite a quantidade em quilos que deseja fazer de latão");
        
        /*Lendo oq foi digitado no teclado */
        Scanner teclado = new Scanner(System.in);
        double latao = teclado.nextDouble();
        
        /*Ajustando as quantidades nescessarias de cobre e zinco com base na quantidade de latão solicitada */
        double cobre = latao * 0.7;
        double zinco = latao * 0.3;
        
        /*Print com as quantidades certas */
        System.out.println("para que a liga seja feita, será nescessario " + cobre + 
        " quilogramas de cobre e " + zinco + " quilogramas de zinco");
        teclado.close();
    }
}
