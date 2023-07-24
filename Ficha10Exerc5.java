import java.util.Scanner;

public class Ficha10Exerc5{
	public static void main(String [] arg){
		Scanner scan = new Scanner(System.in);
		String[] palavras = new String[10];

		for(int i = 0; i < 10; i++){
			System.out.print("Digite a palavra "+i+": ");
			palavras[i] = scan.nextLine();
		}
		System.out.println("");
		for(int i = 0; i < 10; i++){
			if(i % 2 == 0){
				System.out.println(palavras[i]);
			}
		} 
	}
}