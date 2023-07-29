import java.util.Scanner;

public class EstudoMetodo5{

	public static void main(String [] args){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o numero: ");
		double numero = teclado.nextInt();
		System.out.print("Digite outro numero: ");
		double numero1 = teclado.nextInt();

		calcularPartes(numero, numero1);
	}
	
        public static void calcularPartes(double numero, double numero1){
		System.out.println("Nona parte do primeiro nr: "+(numero/9));
		System.out.println("Quinta parte do segundo nr: "+(numero/5));
	}
}