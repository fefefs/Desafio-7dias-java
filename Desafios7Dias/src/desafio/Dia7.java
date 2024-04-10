package desafio;

import java.util.Scanner;

public class Dia7 {
	public static void inserir(int[] vetor, int posicao, int valor) {
		
		vetor[posicao] = valor;

	}

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		String v;
		System.out.println("Insira o tamanho do vetor desejado : ");
		String resp = leitura.nextLine();
		int tamanho = Integer.valueOf(resp);
		
		int[] vetor = new int[tamanho];
		
		System.out.println("insira " + tamanho + " valores inteiros diferentes de 0 no vetor : ");
		for (int i = 0; i < vetor.length; i++) {
			
			v = leitura.nextLine();
		    vetor[i] = Integer.valueOf(v);
			
		}
		
		System.out.println("Insira a posicao na qual voce deseja inserir o valor : ");
		String r = leitura.nextLine();
		int posicao = Integer.valueOf(r);
		
		System.out.println("Insira o valor que voce deseja inserir na posicao " +posicao);
		String rep = leitura.nextLine();
		int valor = Integer.valueOf(rep);
		
		
		inserir(vetor, posicao, valor);
		
			System.out.println("vetor final!!");
			
			 for (int i = 0; i < vetor.length; i++) {
		               
		                System.out.println(vetor[i]);
		            }
		           
		            System.out.println();
		        }
	
		

}
