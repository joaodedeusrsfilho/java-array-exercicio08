package aula19_Arrays;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		/*
		 * Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um
		 * vetor C, onde cada elemento de C é a multiplicação dos respectivos elementos
		 * em A e B, ou seja: C[i] = A[i] * B[i].
		 */

		Scanner ler = new Scanner(System.in);
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorB.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor do vetorA na posicao: " + i);
			vetorA[i] = ler.nextInt();
		}
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println("Entre com o valor do vetorB na posicao: " + i);
			vetorB[i] = ler.nextInt();
		}
		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] * vetorB[i];
		}
		System.out.print("VetorA = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		System.out.print("VetorB = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();
		System.out.print("VetorC = ");
		for (int i = 0; i < vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");
		}
	}
}
