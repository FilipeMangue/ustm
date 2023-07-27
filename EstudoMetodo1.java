import java.util.Scanner;

public class EstudoMetodo1{
	/*public static void saudarPessoa(){
		System.out.println("Boa Tarde!");
	}*/

	public static void main(String [] args){
		//saudarPessoa();
		lerNome();
	}
	
        public static void lerNome(){
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o nome: ");
		String nome = scan.nextLine();

		System.out.println(nome);
	}
}