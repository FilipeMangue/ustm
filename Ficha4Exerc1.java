import java.util.Scanner;

public class Ficha4Exerc1{
	public static void main(String [] args){

		int codigo;
		String nome;
		short anoNasc;
		String genero;
		String nrBI;
		String morada;

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o nome do estudante: ");
		nome = scan.nextLine(); 
		System.out.print("Digite o codigo do estudante: ");
		codigo = scan.nextInt();
		System.out.print("Digite o ano de nascimento do estudante: ");
		anoNasc = scan.nextShort();
		System.out.print("Digite o genero do estudante: ");
		genero = scan.next();
		System.out.print("Digite o nrBI do estudante: ");
		nrBI = scan.next();
		System.out.print("Digite a morada do estudante: ");
		morada = scan.nextLine();

		System.out.println("----Dados do Estudante----");
		System.out.println("Codigo: "+codigo);
		System.out.println("Nome: "+nome);
		System.out.println("AnoNasc: "+anoNasc);
		System.out.println("Genero: "+genero);
		System.out.println("Nr BI: "+nrBI);
		System.out.println("Morada: "+morada);
		System.out.println("Dados recebidos com sucesso!");
		
	}
}