import java.util.Scanner;

public class Ficha9Exerc11{
	public static void main(String [] args){

		Scanner scan = new Scanner(System.in);		

                System.out.print("Digite a palavra: ");
		String palavra = scan.nextLine();

		for(int i = 0; i < 2; i++){
			System.out.print(palavra.charAt(i));
		}
	}
}