import java.util.Scanner;

public class DoisNumerosInteiros{
	public static void main(String [] args) {
		int numero1;
		int numero2;
		int resto;

		Scanner scn = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		numero1 = scn.nextInt();
                System.out.println("Digite o segundo numero: ");
		numero2 = scn.nextInt();
		
		resto = numero1%numero2;

		System.out.println("Resto da divisao: "+resto);
       
	}
}
