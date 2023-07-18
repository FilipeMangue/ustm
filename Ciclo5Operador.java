import java.util.Scanner;

public class Ciclo5Operador{
	public static void main(String [] args){
		
		Scanner scan = new Scanner(System.in);
 		System.out.println("Digite o numero 1: ");
		double num1 = scan.nextDouble();
 		System.out.println("Digite o numero 2: ");
		double num2 = scan.nextDouble();
 		System.out.println("Digite o operador: ");
		char operador = scan.next().charAt(0);

		if(operador == '+'){
 			System.out.println(num1 + num2);
		}else if(operador == '/'){
 			System.out.println(num1 / num2);
		}else if(operador == '*'){
 			System.out.println(num1 * num2);
		}else if(operador == '-'){
 			System.out.println(num1 - num2);
		}
	}
}