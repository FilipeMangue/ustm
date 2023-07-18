import java.util.Scanner;

public class DoisNrsProduto{
	public static void main(String [] args){
		Scanner scn = new Scanner(System.in);
		System.out.println("Digite num1: ");
		double num1 = scn.nextDouble();
		System.out.println("Digite num2: ");
		double num2 = scn.nextDouble();
		
		double produto = num1*num2;
		boolean res = produto < num1;
		
		System.out.println("Produto: "+produto);
		System.out.println("Resultado: "+res);
	}
}