import java.util.Scanner;

public class Ficha10Exerc4{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de letras que contem o seu nome: ");
		int qtdLetras = scan.nextInt();

		char[] nome = new char[qtdLetras];
		
		for(int i = 0; i < qtdLetras; i++){
			System.out.print("Digite a letra "+i+": ");
			nome[i] = scan.next().charAt(0);
		}

		for(int i = qtdLetras - 1; i >= 0 ; i--){
			System.out.print(nome[i]+" ");
		}
	}
}