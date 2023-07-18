//3. Crie um programa que leh o nome completo de uma pessoa e imprime na tela

import java.util.Scanner;

public class Exerc3Ficha3{
	public static void main(String [] args){

		String nomeCompleto;

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite se nome completo: ");
		nomeCompleto = scan.nextLine();

		System.out.println();
		System.out.println("Nome Completo: "+nomeCompleto);
	}
}