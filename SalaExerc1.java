import java.util.Scanner;

public class SalaExerc1{
	public static void main(String [] args){

		Scanner scn = new Scanner(System.in);

		System.out.println("Digite num1: ");
		int num1 = scn.nextInt();
		System.out.println("Digite num2: ");
		int num2 = scn.nextInt();
		System.out.println("Digite num3: ");
		int num3 = scn.nextInt();
		System.out.println("Digite num4: ");
		int num4 = scn.nextInt();

		int sum2primeiros = num1 + num2;
		int divNum2num3 = num2 / num3;
		int prodNum1Num3 = num1 * num3;
		int soma4Nums = num1 + num2 + num3 + num4;

	        boolean res = (((sum2primeiros) < (divNum2num3)) && ((prodNum1Num3) != (soma4Nums)));
		
		System.out.println("sum2primeiros: "+sum2primeiros);
		System.out.println("divNum2num3: "+divNum2num3);
		System.out.println("prodNum1Num3: "+prodNum1Num3);
		System.out.println("soma4Nums: "+soma4Nums);
		System.out.println("Resultado: "+res);
	}
}