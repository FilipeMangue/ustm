import java.util.Scanner;

public class MetodoRetorno4{
	public static void main(String [] args){
		Scanner scn = new Scanner(System.in);

		String[] palavras = new String[5];  

		for(int i = 0; i < 5; i++){
			System.out.println("Digite a palavra na posicao "+i+": ");
			palavras[i] = scn.nextLine();
		}
                System.out.println(retornaFrase(palavras));
	}
	public static String retornaFrase(String[] palavras){
		return (palavras[0] +" "+ palavras[1] +" "+ palavras[2] +" "+ palavras[3] +" "+ palavras[4]);
	}
}