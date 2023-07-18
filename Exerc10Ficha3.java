//10. Crie um programa que permite determinar a idade de um individuo; para tal o programa
//devera obter do utilizador o ano de nascimento e o nome do individuo. Apos o calculo da
//idade, o algoritmo devera permitir a visualizacao da mensagem no seguinte formato:
//NOME_DO_INDIVIDUO tem XYZ anos de idade

import java.util.Scanner;

public class Exerc10Ficha3{
	public static void main(String [] args){
		int anoNasc=0;
		int idade;
                String nome;
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		nome = scan.nextLine();
		System.out.print("Digite seu ano de nascimento: ");
		anoNasc = scan.nextInt();
		
		idade = 2023 - anoNasc;

		System.out.println();
		System.out.println(nome+" tem "+idade+" anos de idade");
	}
}