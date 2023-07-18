//11. Crie um programa que leh a idade de um individuo e em seguida calcula o ano de nascimento e imprima na tela

import java.util.Scanner;

public class Exerc11Ficha3{
	public static void main(String [] args){
		int anoNasc;
		int idade;
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		idade = scan.nextInt();
		
		anoNasc = 2023 - idade;

		System.out.println();
		System.out.println("Seu ano de nascimento: "+anoNasc);
	}
}