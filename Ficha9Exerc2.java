import java.util.Scanner;

public class Ficha9Exerc2{
	public static void main(String [] args){

		int counter = 0;	

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a palavra: ");
		String palavra = scan.next();
		System.out.println("Digite a letra: ");
		char letra = scan.next().charAt(0);

		for(int i = 0; i < palavra.length(); i++){
			if(palavra.charAt(i) == letra){
				counter++;
			}
		}
 		System.out.println("A letra "+letra+" aparece veze(s)"+counter+" na palavra "+palavra);
	}
}