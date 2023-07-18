import java.util.Scanner;

public class LerDoisNumeros{
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);

		int number1;
		int number2;

		System.out.println("Digite o primeiro numero: ");
		number1 = scanner.nextInt();
		System.out.println("Digite o segundo numero: ");
		number2 = scanner.nextInt();

		System.out.println(number1);
		System.out.println(number2);
	}
}