import java.util.Scanner;

public class Ficha9Exerc4{
	public static void main(String []  args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o numero: ");
                int numero = scan.nextInt();

		System.out.println("\nDivisores de "+numero);
		for(int i = 1; i <= numero; i++){
			if((numero % i) == 0){
				System.out.println(i);
			}
		}
	}
}