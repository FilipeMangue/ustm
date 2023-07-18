import java.util.Scanner;

public class LeituraNomeCompleto{
	public static void main(String [] args){
		String nomeCompleto;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Digite seu nome completo: ");
		nomeCompleto = scn.nextLine();

		System.out.println("Nome: "+nomeCompleto);
	}	
}