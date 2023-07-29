import java.util.Scanner;

public class MetodoRetorno3{
	public static void main(String [] args){
		Scanner scn = new Scanner(System.in);
		System.out.println("Digite a palavra: ");
		String palavra = scn.nextLine();

		System.out.println(returnLast3(palavra));
	}
	public static char returnLast3(String palavra){
		char retorno = ' ';
		for(int i = 1; i < 3; i++){
			retorno = palavra.charAt(palavra.length() - i);
		}
		return retorno;
	}
}
