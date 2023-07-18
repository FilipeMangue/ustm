import java.util.Scanner;

public class Ficha4Exerc4{
	public static void main(String [] args){

		String firstName, firstName1;

		Scanner scan = new Scanner(System.in);
		System.out.println("Escreva o seu primeiro nome: ");
		firstName = scan.next();
		
		firstName1 = firstName.substring(0,6);

		System.out.println("QtdChar: "+firstName1);		
	}
}