import java.util.Scanner;

//comparacao de dois numeros

public class Comp2Numeros{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);

		int pl1, pl2;

		System.out.print("Digite num1: ");
		pl1 = scan.nextInt();
		System.out.print("Digite num2: ");
		pl2 = scan.nextInt();
		
		if(pl1 > pl2){
			System.out.println("O primeiro numero eh maior que o segundo.");
		}
	}
}