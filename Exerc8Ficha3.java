//8. Crie um programa que leh dois numeros e permita achar o resultado das seguintes operacoes:
//a. Adicao b. Subtraccao c. Multiplicacao d. Divisao e. Resto da divisao

import java.util.Scanner;

public class Exerc8Ficha3{
	public static void main(String [] args){
		int num1, num2;
		int adicao, subtracao, multiplicacao, divisao, restoDivisao;

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		num1 = scan.nextInt();
		System.out.print("Digite o segundo numero: ");
		num2 = scan.nextInt();

		adicao = num1 + num2;
		subtracao = num1 - num2;
		multiplicacao = num1 * num2;
		divisao = num1 / num2;
		restoDivisao = num1 % num2;

		System.out.println();
		System.out.println("Adicao de "+num1+" com "+num2+" = "+adicao);
		System.out.println("Subtraccao de "+num1+" com "+num2+" = "+subtracao);
		System.out.println("Multiplicacao de "+num1+" com "+num2+" = "+multiplicacao);
		System.out.println("Divisao de "+num1+" por "+num2+" = "+divisao);
		System.out.println("Resto da divisao "+num1+" por "+num2+" = "+restoDivisao);
	}
}