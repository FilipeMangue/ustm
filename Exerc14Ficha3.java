//14. Crie um leh o valor do lado de um quadrado e de seguida calcula a area do mesmo

import java.util.Scanner;

public class Exerc14Ficha3{
	public static void main(String [] args){
		int lado;
		int area;
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite valor do lado do quadrado: ");
		lado = scan.nextInt();

		area = lado * lado;

		System.out.println();
		System.out.println("A area do quadrado com lado igual a "+lado+" eh igual a "+area);
	}
}