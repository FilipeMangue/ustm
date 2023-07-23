import java.util.Scanner;

public class Ficha9Exerc10{
	public static void main(String [] args){

		int contVogais = 0;

		Scanner scan = new Scanner(System.in);		

                System.out.print("Digite a palavra: ");
		String palavra = scan.nextLine().toLowerCase();

		for(int i = 0; i < palavra.length(); i++){
			if((palavra.charAt(i) == 'a') || (palavra.charAt(i) == 'e') || (palavra.charAt(i) == 'i') || (palavra.charAt(i) == 'o') || (palavra.charAt(i) == 'u')){
				contVogais++;
			}
		}
		System.out.println("A palavra digitada tem "+contVogais+" vogais.");
	}
}