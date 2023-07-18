import java.util.Scanner;

public class Ficha4Exerc2{
	public static void main(String [] args){

		int ano = 365;
		int mes = 30;
		int idadeDias;

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a idade do estudante(expressa em dias): ");
		idadeDias = scan.nextInt();
		
		int idadeMeses = idadeDias/mes;
		int idadeAnos = idadeDias/ano;
		
		System.out.println("Idade(Meses): "+idadeMeses);
		System.out.println("Idade(Anos): "+idadeAnos);
		
	}
}