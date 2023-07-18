import java.util.Scanner;

public class Ficha2Exercicio7{
	public static void main(String [] args){
		int base;
		int altura;
		int area;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor da base: ");
		base = sc.nextInt();

		System.out.println("Digite o valor da altura: ");
		altura = sc.nextInt();

		area = (base * altura)/2;

		System.out.println("A area do triangulo e: "+area);
	}
}