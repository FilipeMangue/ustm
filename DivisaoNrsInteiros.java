import java.util.Scanner;

public class DivisaoNrsInteiros {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		int num1;
		int num2;
		int divisao;

		System.out.println("Digite o primeiro numero: ");
		num1 = scan.nextInt();
		System.out.println("Digite o segundo numero: ");
		num2 = scan.nextInt();

		divisao = num1/num2;

		System.out.println("Valor da divisao: "+divisao);
	}
}