import java.util.Scanner;

public class Ficha2Exerc8{
	public static void main(String [] args){

		String frase;

		Scanner scan = new Scanner(System.in);
		System.out.println("Escreva uma frase: ");
		frase = scan.nextLine();

		String novaFrase = frase.toUpperCase();

		System.out.println(novaFrase);		
	}
}