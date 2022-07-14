package MatrizeVetor;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		int vetor[] = new int[6];
		int vetor1[] = {1,2,3,4,5,6};
		Scanner ler = new Scanner(System.in);
		
		for (int indice=0; indice<6;indice++)
		{
			System.out.println("\nDigite uma idade: ");
			vetor[indice] = ler.nextInt();								
		}
		
		System.out.println("As idades informadas foram ");
		
		for (int indice=0; indice<6;indice++)
		{
			System.out.print(vetor[indice]+"\t");
		}
		
		
		
		
		
		

	}

}
