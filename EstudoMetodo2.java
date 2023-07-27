import java.util.Scanner;

public class EstudoMetodo2{

	public static void main(String [] args){
		calcularQuadruplo();
	}
	
        public static void calcularQuadruplo(){
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o numero: ");
		int numero = scan.nextInt();
		
		numero *= 4;
		
		System.out.println(numero);
	}
}