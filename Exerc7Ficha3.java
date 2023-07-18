//7. Crie um programa que leh o nome de um estudante, a nota do teste 1 e teste 2 e imprima
//na tela os dados lidos

import java.util.Scanner;

public class Exerc7Ficha3{
	public static void main(String [] args){

		String nomeEstudante;
		double nota1, nota2;

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite nome completo: ");
		nomeEstudante = scan.nextLine();
		System.out.print("Digite a nota do teste1: ");
		nota1 = scan.nextDouble();
		System.out.print("Digite a nota do teste1: ");
		nota2 = scan.nextDouble();

		System.out.println();
		System.out.println("Nome: "+nomeEstudante);
		System.out.println("Nota do teste1: "+nota1);
		System.out.println("Nota do teste2: "+nota2);
	}
}