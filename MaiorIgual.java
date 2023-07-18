import java.util.Scanner;

public class MaiorIgual{
	public static void main(String [] args){
		int num1, num2;
		boolean res;
		
		Scanner scn = new Scanner(System.in);
    		System.out.println("Digite num1: ");
		num1 = scn.nextInt();
		System.out.println("Digite num2: ");
		num2 = scn.nextInt();
		
		res = ((num1 - 1) >= (num2 + 1));

		System.out.println("Resultado: "+res);
	}
}

Operador e-commerce (&&)
Crie um programa que recebe dois numeros inteiros, de seguida verifica se eh verdade que o numero1 elavado a 2 eh maior do que o produto de numero 1 por numero 2
e o produto de numero 1 por numero 2 eh manor do que e divisao da soma de numero 1 e numero 2 por 4.  