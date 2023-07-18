import java.util.Scanner;

public class CompDoisNrs{
	public static void main(String [] args){
		short num1;
		short num2;
		boolean resultado;

		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o num1: ");
                num1 = scan.nextShort();
		System.out.print("Digite o num2: ");
                num2 = scan.nextShort();

		resultado = num1 > num2;

		System.out.println("Resultado: "+resultado);
	}
}