package desafio;

import java.util.Scanner;

public class Dia5 {
	public static int indice(int[] vetor, int valor) {
		
		int resposta = 0;
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i] == valor) {
				resposta = i;
			}
		}
		
		return resposta;
	
	}

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		String v;
		System.out.println("Insira o tamanho do vetor deseado : ");
		String resp = leitura.nextLine();
		int tamanho = Integer.valueOf(resp);
		
		int[] vetor = new int[tamanho];
		
		System.out.println("insira " + tamanho + " valores inteiros no vetor : ");
		for (int i = 0; i < vetor.length; i++) {
			
			v = leitura.nextLine();
		    vetor[i] = Integer.valueOf(v);
			
		}
		
		System.out.println("Insira o valor que deseja saber o indice no vetor : ");
		String r = leitura.nextLine();
		int valor = Integer.valueOf(r);
		
		
		int resultado = indice(vetor, valor);
		
			System.out.println("Este valor esta no indice " + resultado + " no vetor !!");
		

	}
		
}


