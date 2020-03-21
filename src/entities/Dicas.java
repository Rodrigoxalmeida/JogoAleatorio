package entities;

public class Dicas {
	
	public static void dica(int palpite,int numero, int tentativas) {
		
		if(palpite > numero) {
			System.out.println("Seu palpite e maior que o numero sorteado !");
		}else {
			if(palpite < numero) {
				System.out.println("Seu palpite e menor que o numero sorteado !");
			}else {
				System.out.println("Parabens você acertou !");
				System.out.println("Você tentou " + tentativas + "vezes antes de acertar");
					
			}
		}
		
	}

}
