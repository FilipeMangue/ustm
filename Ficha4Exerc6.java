import java.util.Scanner;

public class Ficha4Exerc6{
	public static void main(String [] args){

		String frase;
		String palavra;

		Scanner scan = new Scanner(System.in);
		System.out.println("Escreva uma frase: ");
		frase = scan.nextLine();
		System.out.println("Escreva uma palavra: ");
		palavra = scan.next();

		boolean res = frase.contains(palavra);;

		System.out.println("Resultado: "+res);		
	}
}