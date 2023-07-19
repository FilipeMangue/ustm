import java.util.Scanner;

public class Ficha7Exer3{
	public static void main(String [] arga){
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o caracter: ");
		char car = scan.next().charAt(0);

		switch(car){
			case 'A', 'E', 'I', 'O', 'U': System.out.println("Vogal"); break;
			default: System.out.println("Consoante");
		}
	}
}