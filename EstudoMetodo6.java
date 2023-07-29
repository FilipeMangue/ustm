import java.util.Scanner;

public class EstudoMetodo6{

	public static void main(String [] args){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o numero: ");
		int numero = teclado.nextInt();
		
		calcularFactorial(numero);
	}
	
        public static void calcularFactorial(int numero){
                int quadrado = numero * numero;

		int factorial = 1;
		
		for(int i = quadrado; i >= 1; i--){
			factorial *= quadrado;
			quadrado--;
		}
		
		System.out.println("Factorial do quadrado de "+numero+": "+factorial);
	}
}