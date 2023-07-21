import java.util.Scanner;

public class Ficha9Exerc5{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Escreva uma frase: ");
		String frase = scan.nextLine();

		int cont = 0;

		for(int i = 0; i < frase.length(); i++){
			
			char let = ' ';
			if(frase.charAt(i) == let){
				cont++;
			}
		}
		int num = cont + 1;
		System.out.println("A fase digitada tem "+num+" palavras");
	}
}