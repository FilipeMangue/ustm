import java.util.Scanner;

public class Ficha9Exerc7{
	public static void main(String [] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("Escreva a frase: ");
		String word1 = scn.nextLine();

		char letra = word1.charAt(word1.length() - 1);
		
		if( letra == '.'){
			System.out.println("A frase termina com ponto(.)");
		} else {
			System.out.println("A frase nao termina com ponto(.)");
		}
	}
}