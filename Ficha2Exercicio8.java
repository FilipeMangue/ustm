import java.util.Scanner;

public class Ficha2Exercicio8{
	public static void main(String [] args){

		short teste1;
		short teste2;

		Scanner scn = new Scanner(System.in);

		System.out.println("Digite a nota do teste 1: ");
		teste1 = scn.nextShort();
		System.out.println("Digite a nota do teste 2: ");
		teste2 = scn.nextShort();
		
		System.out.println("Nota do teste1: "+teste1);
		System.out.println("Nota do teste2: "+teste2);
	}
}