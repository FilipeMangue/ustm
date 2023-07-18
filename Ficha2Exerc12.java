import java.util.Scanner;

public class Ficha2Exerc12{
	public static void main(String [] args){

		String frase;

		Scanner scan = new Scanner(System.in);
		System.out.println("Escreva a frase: ");
		frase = scan.nextLine();

		String novaFrase = frase.replace(","," ");

		System.out.println("Nova frase: "+novaFrase);		
	}
}