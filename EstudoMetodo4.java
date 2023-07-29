import java.util.Scanner;

public class EstudoMetodo4{

	public static void main(String [] args){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o numero: ");
		int numero = teclado.nextInt();
		System.out.print("Digite outro numero: ");
		int numero1 = teclado.nextInt();

		calcularSoma(numero, numero1);
	}
	
        public static void calcularSoma(int numero, int numero1){

		int soma = numero + numero1;

		System.out.println(soma);
	}
}