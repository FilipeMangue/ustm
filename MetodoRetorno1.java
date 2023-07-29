import java.util.Scanner;

public class MetodoRetorno1{
	public static void main(String [] args){
		Scanner scn = new Scanner(System.in);

		System.out.println("Digite o numero: ");
		int numero = scn.nextInt();

		System.out.println(quadrado(numero));
	}
	public static int quadrado(int numero){
		return numero * numero;
	}
}
