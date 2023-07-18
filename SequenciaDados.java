import java.util.Scanner;

public class SequenciaDados{
	public static void main(String [] args){
		Scanner scaner = new Scanner(System.in);
		int num1;
		int num2;
		int num3; 
		int num4;
		int num5;
		int num6;

		String text1 = "ABCD";
                String text2 = "EFGH";
		String text3 = "IJHL";

		System.out.println("Digite o primeiro numero: ");
		num1 = scaner.nextInt();
		System.out.println("Digite o segundo numero: ");
		num2 = scaner.nextInt();
		System.out.println("Digite o terceiro numero: ");
		num3 = scaner.nextInt();
		System.out.println("Digite o quarto numero: ");
		num4 = scaner.nextInt();
		System.out.println("Digite o quinto numero: ");
		num5 = scaner.nextInt();
		System.out.println("Digite o sexto numero: ");
		num6 = scaner.nextInt();

		System.out.println(num1);
		System.out.println(text1);
		System.out.println(num2);
		System.out.println();
		System.out.println(num3);
		System.out.println(text2);
		System.out.println(num4);
		System.out.println();
		System.out.println(num5);
		System.out.println(text3);
		System.out.println(num6);
	}
}