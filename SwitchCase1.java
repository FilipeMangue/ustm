import  java.util.Scanner;

public class SwitchCase1{
	public static void main(String [] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("Digite o valor: ");
		int n1 = scn.nextInt();

		switch (n1) {
			case 1: 
				System.out.println(n1 + 10);
				break;
			case 2: 
				System.out.println(n1 + 20);
				break;
			case 3: 
				System.out.println(n1 + 30);
				break;
			default: System.out.println("Valor Invalido!");
		}
	}
}