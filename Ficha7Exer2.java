import java.util.Scanner;

public class Ficha7Exer2{
	public static void main(String [] arga){
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um numero do mes: ");
		int num = scan.nextInt();

		switch(num){
			case 1: System.out.println("31"); break;
			case 2: System.out.println("28"); break;
			case 3: System.out.println("31"); break;
			case 4: System.out.println("30"); break;
			case 5: System.out.println("31"); break;
			case 6: System.out.println("30"); break;
			case 7: System.out.println("31"); break;
			case 8: System.out.println("30"); break;
			case 9: System.out.println("31"); break;
			case 10: System.out.println("30"); break;
			case 11: System.out.println("31"); break;
			case 12: System.out.println("31"); break;
		}
	}
}