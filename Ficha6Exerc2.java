import java.util.Scanner;

public class Ficha6Exerc2{
	public static void main(String [] args){
		String nome;
		String genero;
		String estadoCivil;
		int anoNasc;

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o nome: ");
		nome = scan.nextLine();	
		System.out.println("Genero: ");
		genero = scan.nextLine();
		System.out.println("Estado Civil: ");
		estadoCivil = scan.nextLine();
		System.out.println("Ano de Nascimento: ");
		anoNasc = scan.nextInt();	

		System.out.println("");
		System.out.println("Nome: "+nome);
		System.out.println("Genero: "+genero);
		System.out.println("Estado Civil: "+estadoCivil);
		System.out.println("Ano de Nascimento: "+anoNasc);
	}
}