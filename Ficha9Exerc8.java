import java.util.Scanner;

public class Ficha9Exerc8{
	public static void main(String [] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("Digite o numero: ");
		int num = scn.nextInt();
		int n = num;
		int factorial = 1;
		
		for(int i = num; i >= 1; i--){
			factorial *= num;
			num--;
		}
		System.out.println("Factorial de "+n+" eh igual a "+factorial);

	}
}