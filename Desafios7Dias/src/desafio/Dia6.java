package desafio;

import java.util.Scanner;

public class Dia6 {
	
	public static void delete(int[] vetor, int valor) {
	
	for (int i = 0; i < vetor.length; i++) {
		if(vetor[i] == valor) {
			vetor[i] = 0;
		}
	
	}

}


	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		String v;
		System.out.println("Insira o tamanho do vetor deseado : ");
		String resp = leitura.nextLine();
		int tamanho = Integer.valueOf(resp);
		
		int[] vetor = new int[tamanho];
		
		System.out.println("insira " + tamanho + " valores inteiros diferentes de 0 no vetor : ");
		for (int i = 0; i < vetor.length; i++) {
			
			v = leitura.nextLine();
		    vetor[i] = Integer.valueOf(v);
			
		}
		
		System.out.println("Insira o valor que deseja deletar : ");
		String r = leitura.nextLine();
		int valor = Integer.valueOf(r);
		
		
		delete(vetor, valor);
		
			System.out.println("vetor final!!");
			
			 for (int i = 0; i < vetor.length; i++) {
		               
		                System.out.println(vetor[i]);
		            }
		           
		            System.out.println();
		        }
		
	}


