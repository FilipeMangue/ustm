//9. Crie um programa que leh dois numeros inteiros e calcule a media aritmetica

import java.util.Scanner;

public class Exerc9Ficha3{
	public static void main(String [] args){
		int num1, num2, media;
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		num1 = scan.nextInt();
		System.out.print("Digite o segundo numero: ");
		num2 = scan.nextInt();
		
		media = (num1 + num2)/2;

		System.out.println();
		System.out.println("Media: "+media);
	}
}