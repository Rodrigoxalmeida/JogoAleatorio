package aplication;

import java.util.Random;
import java.util.Scanner;

import entities.Dicas;

public class Jogo {

	public static void main(String[] args) {
		
		int sorteado, tentativas = 0, palpite = 0;
		
		// cria um Scanner para leitura do palpite digitado pelo usuario
		Scanner sc = new Scanner(System.in);
		
		//gera um numero aleatorio de 1 ate 1000 e guarda na variavel sorteado
		Random geradorDeAleatorios = new Random();
		
		//soma + 1 porque senao so sorteia um numero entre 1 e 999
		sorteado = geradorDeAleatorios.nextInt(1000) + 1 ;
		System.out.println("Numero entre 1 e 1000 sorteado !");
		
		//loop do programa
		
		do {
			System.out.println("---------------------\n");
			System.out.println("Numero de tentativas: " + tentativas);
			
			//Faz leitura do numero que o usuario digita(palpite)
			System.out.print("Qual o seu palpite: ");
			palpite = sc.nextInt(); // pede um numero ao usuario
			
			tentativas++; // grava a quantidade de tentativas
			
			Dicas.dica(palpite, sorteado, tentativas); 			
			
		}while(palpite != sorteado);
		
		sc.close();

	}

}
