import java.util.Scanner;

public class Ficha4Exerc8{
	public static void main(String [] args){

		String frase;

		Scanner scan = new Scanner(System.in);
		System.out.println("Escreva uma frase: ");
		frase = scan.nextLine();

		String novaFrase = frase.toLowerCase();

		System.out.println(novaFrase);		
	}
}