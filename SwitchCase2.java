import  java.util.Scanner;

public class SwitchCase2{
	public static void main(String [] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("Digite a letra: ");
		char letra = scn.next().charAt(0);

		switch(letra) {
			case 'A':
				System.out.println("Auris");
				break;
			case 'B':
				System.out.println("Blade");
				break;
			case 'C':
				System.out.println("Caidina");
				break;
			case 'D':
				System.out.println("Duster");
				break;
			case 'E':
				System.out.println("Etios");
				break;
		}
	}
}