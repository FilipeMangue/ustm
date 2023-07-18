import java.util.Scanner;

public class Exerc1Ficha3{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		String nome, segundoNome, apelido;
		
		System.out.print("Digite o seu primeiro nome: ");
		nome = scan.next();
		System.out.print("Digite o seu segundo nome: ");
		segundoNome = scan.next();
		System.out.print("Digite o seu apelido: ");
		apelido = scan.next();

		System.out.println(nome+" "+segundoNome+" "+apelido);
	}
}