import java.util.Scanner;

public class Ficha7Exer4{
	public static void main(String [] arga){
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um numero de 1 a 3: ");
		int num1 = scan.nextInt();

		switch(num1){
			case 1: System.out.println("Cafe da Manha"); break;
			case 2: System.out.println("Almoco"); break;
			case 3: System.out.println("Jantar"); break;
			default: System.out.println("Opcao Invalida!");
		}
	}
}