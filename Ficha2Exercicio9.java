import java.util.Scanner;

public class Ficha2Exercicio9{
	public static void main(String [] args){
		float salarioBase;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor do salario actual: ");
		salarioBase = scan.nextFloat();

		salarioBase = salarioBase * 2;

		System.out.println("Dobro do salario: "+salarioBase);
	}
}