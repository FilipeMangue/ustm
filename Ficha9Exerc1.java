import java.util.Scanner;

public class Ficha9Exerc1{
	public static void main(String [] args){

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a palavra: ");
		String palavra = scan.next();

		for(int i = 0; i < palavra.length(); i++){
			System.out.println(palavra.charAt(i));
		}
	}
}