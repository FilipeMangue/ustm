import java.util.Scanner;

public class Ficha4Exerc5{
	public static void main(String [] args){

		String frase;
		int qtdChar;

		Scanner scan = new Scanner(System.in);
		System.out.println("Escreva uma frase: ");
		frase = scan.nextLine();
		
		qtdChar = frase.length();

		System.out.println("QtdChar: "+qtdChar);		
	}
}