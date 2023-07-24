import java.util.Scanner;

public class ArrayNotas1{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		double[] notas = new double[3];

		System.out.println("Digite a primeira nota: ");
		notas[0] = scan.nextDouble();
		System.out.println("Digite a segunda nota: ");
		notas[1] = scan.nextDouble();
		System.out.println("Digite a terceira nota: ");
		notas[2] = scan.nextDouble();

		double media = (notas[0] + notas[1] + notas[2])/3.0;

		System.out.println(media);
	}
}