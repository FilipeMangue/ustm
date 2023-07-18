//6. Crie um programa que leh uma mensagem e uma data e de seguida imprima na tela

import java.util.Scanner;

public class Exerc6Ficha3{
	public static void main(String [] args){

		String msg;
		String data;

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite uma mensagem: ");
		msg = scan.nextLine();
		System.out.print("Digite a data: ");
		data = scan.nextLine();

		System.out.println();
		System.out.println(msg+" "+data);
	}
}