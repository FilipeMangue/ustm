import java.util.Scanner;

public class VerificaQtdChar{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);

		String frase; 

		System.out.print("Digite a frase: ");
		frase = scan.nextLine();

		int qtdChar = frase.length();

		if(qtdChar > 10){
			System.out.println("A frase tem mais de 10 caracteres, neste caso "+qtdChar);
		}
	}
}