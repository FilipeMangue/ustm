import java.util.Scanner;

public class Ficha11Exerc21{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		int[] numeros = new int[10];

		for(int i = 0; i < 10; i++){
			System.out.print("Digite o numero: ");
			numeros[i] = scan.nextInt();
		}

		for(int i = 0; i < 10; i++){
			if((i % 2 == 0) && (i != 0)){
				if(numeros[i] > 1){
					System.out.println("Primo: "+numeros[i]+" na posicao "+i);
				}
			}	
		}
		
	}
}