package MatrizeVetor;

import java.util.Scanner;

/*
 * 4.Crie um programa que receba valores do usuário para preencher uma matriz 3X3, 
 * e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal, 
 * ou seja, diagonal principal.
 */

public class Exercicio3Matriz {

	public static void main(String[] args) {
		
		int[][] matriz = new int[3][3]; 
		Scanner ler = new Scanner(System.in);
		int soma = 0, somaDig=0;
		
		System.out.println("Matriz[3][3]\n");
		
		for (int linha=0; linha<3;linha++)
		{
			for (int coluna=0; coluna<3;coluna++)
			{
				System.out.printf("Insira os valores de M "+linha,coluna);
				matriz[linha][coluna] = ler.nextInt();
				soma= soma +matriz[linha][coluna];		
			}
		}
		
		   somaDig = matriz[0][0]+matriz[1][1]+matriz[2][2];
		  System.out.println("a soma dos valores é de: "+soma);
		  System.out.println("a soma das diagonais é de :"+somaDig);
		  
		
		
			
	}
	
}






