import java.util.Scanner;

public class Exerc2Ficha3{
	public static void main(String [] args){

		String nomeCompleto, nrBI, genero;
		short anoNasc;

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite se nome completo: ");
		nomeCompleto = scan.nextLine();
		System.out.print("Digite seu NrBI: ");
		nrBI = scan.nextLine();
		System.out.print("Digite genero: ");
		genero = scan.nextLine();
		System.out.print("Digite ano de nascimento: ");
		anoNasc = scan.nextShort();

		System.out.println();
		System.out.println("Nome Completo: "+nomeCompleto);
		System.out.println("NrBI: "+nomeCompleto);
		System.out.println("Genero: "+genero);
		System.out.println("Ano de Nascimento: "+anoNasc);
	}
}