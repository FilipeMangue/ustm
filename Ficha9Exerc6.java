import java.util.Scanner;

public class Ficha9Exerc6{
	public static void main(String [] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("Digite a primeira palavra: ");
		String word1 = scn.nextLine();
		System.out.print("Digite a segunda palavra: ");
		String word2 = scn.nextLine();

		if(word1.equals(word2)){
			System.out.println("As palavras sao iguais.");
		} else {
			System.out.println("As palavras nao sao iguais.");
		}

	}
}