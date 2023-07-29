import java.util.Scanner;

public class EstudoMetodo3{

	public static void main(String [] args){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o numero: ");
		int numero = teclado.nextInt();

		calcularSucessor(10+1);
	}
	
        public static void calcularSucessor(int numero){

		int sucessor = numero + 1;

		System.out.println(sucessor);
	}
}