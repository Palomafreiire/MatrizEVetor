package MatrizeVetor;

import java.util.Scanner;

/*
	 * 1.	Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade 
	 * e o escreva em seguida. Encontre após a maior pontuação e a apresente. 
	 */
public class Atividade1Vetor {

	public static void main(String[] args) {
		
		float[] nota = new float[5];
		Scanner ler = new Scanner (System.in);
		float maiorPontuacao =0;
				
		for (int i=0; i<5;i++)
		{
			System.out.println("Me diga sua primeira nota: ");
			nota[i]= ler.nextFloat();
		}
		for (int i=0; i<5;i++)
		{
			System.out.println("As notas foram: "+i+"="+nota[i]);
		}
		for (int i=0; i<5;i++)
		{
				if (maiorPontuacao < nota[i])
				{
					maiorPontuacao = nota[i];
				}		
		}
		
		System.out.println("a maior pontuação foi: "+maiorPontuacao);

	}

}
