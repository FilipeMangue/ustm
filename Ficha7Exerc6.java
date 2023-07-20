import java.util.Scanner;

public class Ficha7Exerc6 {
	public static void main (String [] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("======= BEM-VINDO AO M-PESA =======");
		System.out.println("1 - Cadastrar conta");
		System.out.println("2 - Depositar dinheiro");
		System.out.println("3 - Levantar dinheiro");
		System.out.println("4 - Minha conta");
		System.out.println("5 - Sair");
		System.out.println("Digite a opcao que deseja:");
		int opcao = scan.nextInt();

		switch(opcao) {
			case 1: System.out.println("Crie aqui a sua conta MPESA"); break;
			case 2: System.out.println("Deposite um valor na sua conta MPESA"); break;
			case 3: System.out.println("Levante saldo da sua conta MPESA"); break;
			case 4: System.out.println("Ver dados da sua conta MPESA"); break;
			case 5: System.out.println("Sair da sua conta MPESA"); break;
			default: System.out.println("Opcao Invalida!");
		}
	}
}
