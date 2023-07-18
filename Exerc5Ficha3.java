//5. Crie um programa que leh um numero e imprime na tela o seu sucessor

import java.util.Scanner;

public class Exerc5Ficha3{
	public static void main(String [] args){

		int numero;

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		numero = scan.nextInt();

		numero++;

		System.out.println();
		System.out.println("Sucessor: "+numero);
	}
}