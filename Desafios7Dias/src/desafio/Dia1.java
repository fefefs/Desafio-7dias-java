package desafio;

import java.util.Scanner;

public class Dia1 {
	
	public static int contem(int[] vetor, int valor) {
		
		int resposta = 0;
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i] == valor) {
				resposta = 2;
			}
		}
		
		return resposta;
	
	}

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		int[] vetor = new int[50];
		
		for (int i = 0; i < vetor.length; i++) {
			
			vetor[i] = i;
			
		}
		
		System.out.println("Insira o valor que deseja saber se está no vetor : ");
		String r = leitura.nextLine();
		int valor = Integer.valueOf(r);
		
		
		int resultado = contem(vetor, valor);
		
		if(resultado == 2 ) {
			System.out.println("Sim este valor esta no vetor !!");
		} else {
			System.out.println("Nao o valor nao esta no vetor!!");
		}
		

	}

}
