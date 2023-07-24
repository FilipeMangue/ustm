import java.util.Scanner;

public class ArrayNotas{
	public static void main(String [] args){
		double[] notas = new double[3];
		notas[0] = 12;
		notas[1] = 15;
		notas[2] = 19;
		double media = (notas[0] + notas[1] + notas[2])/3.0;

		System.out.println(media);
	}
}