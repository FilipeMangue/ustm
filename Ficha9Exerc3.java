import java.util.Scanner;

public class Ficha9Exerc3 {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a palavra: ");
		String palavra = scan.nextLine();

		for(int i = palavra.length() - 1; i >= 0; i--){
			System.out.print(palavra.charAt(i));
		}
	}
}