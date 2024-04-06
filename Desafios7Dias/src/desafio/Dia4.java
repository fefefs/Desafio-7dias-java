package desafio;

import java.util.Scanner;

public class Dia4 {
	public static float media(float[] vetor) {
		
		float s = (float) 0.0;
		float r = (float) 0.0;
		for (int i = 0; i < vetor.length; i++) {
			
			s = s + vetor[i];
			
		}
		r = s/vetor.length;
		return r;
	}

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		String v = null;
		
		System.out.println("Insira o tamanho do vetor deseado : ");
		String r = leitura.nextLine();
		int tamanho = Integer.valueOf(r);
		
		float[] numeros = new float[tamanho];
		
		System.out.println("insira " + tamanho + " valores no vetor : ");
		for (int i = 0; i < numeros.length; i++) {
			
			v = leitura.nextLine();
		    numeros[i] = Float.valueOf(v);
			
		}
		
		float resultado = media(numeros);
		
		System.out.println("O resultado da media de todos os numeros no vetor eh : " + resultado);

	}
		

}


