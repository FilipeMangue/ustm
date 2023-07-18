import java.util.Scanner;

public class Ficha2Exercicio6{
	public static void main(String [] args){
		double valorMetical;
		double valorDolar = 67.74;

		Scanner scn = new Scanner(System.in);
		System.out.print("Informe o valor em meticais: ");
		valorMetical = scn.nextFloat();

		valorDolar = valorMetical * valorDolar;

		System.out.println(valorMetical+" corresponde a "+valorDolar+" dolares.");
	}
}