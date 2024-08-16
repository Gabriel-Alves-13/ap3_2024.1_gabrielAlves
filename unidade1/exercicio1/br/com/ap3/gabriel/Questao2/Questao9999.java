package br.com.ap3.gabriel.Questao2;

import java.util.LinkedList;
import java.util.Random;


/*
 *Codigo Secreto = 950460735
 *
 *  A classe a seguir cira uma lista para fazer o armazenamento dos numeros que serão gerados, mostra a lista que foi
 *  gerada e logo em seguida como se pede na questão apresenta o menor numero da lista.
 * 
 * @author GabrielAlves
 * @since 15/08/2024
 * 
 */
public class Questao9999 {

    public static void main(String[] args) {

        //Criando uma lista para armazenar os numeros
        LinkedList <Integer> list = new LinkedList<>();

        //Gerando numeros
        Random random = new Random();

        //Preenchendo
        for (int i = 0; i < 9999; i++) {
            int num = random.nextInt(100000);
            list.add(num);
        }

        //Print da lista (opcional)
        for ( int numero : list){
        System.out.print(numero +" ");
        }

        //Procurando e mostrando o menor numero 
        int minNum = list.get(0);
        for (int num : list){
            if (num < minNum){
                minNum = num;
            }
        } 
        /*Exibindo */
        System.out.println(" ");
        System.out.println("O menor numero gerado aleatoriamente pela lista eh " + minNum);
    }   
}