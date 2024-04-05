package desafio;

import java.util.Scanner;

public class Dia2 {
	
	public static int soma(int[] vetor) {
		
		int s = 0;
		for (int i = 0; i < vetor.length; i++) {
			
			s = s + vetor[i];
			
		}
		return s;
	}

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		String v = null;
		
		System.out.println("Insira o tamanho do vetor deseado : ");
		String r = leitura.nextLine();
		int tamanho = Integer.valueOf(r);
		
		int[] numeros = new int[tamanho];
		
		System.out.println("insira " + tamanho + " valores inteiros no vetor : ");
		for (int i = 0; i < numeros.length; i++) {
			
			v = leitura.nextLine();
		    numeros[i] = Integer.valueOf(v);
			
		}
		
		int resultado = soma(numeros);
		
		System.out.println("O resultado da soma de todos os numeros no vetor eh : " + resultado);

	}

}





















