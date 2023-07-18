import java.util.Scanner;

public class SalaExerc2{
	public static void main(String [] args){

		Scanner scn = new Scanner(System.in);

		System.out.println("Digite uma palavra: ");
		String ph = scn.nextLine();

		System.out.println("Digite outre palavra: ");
		String ph1 = scn.nextLine();

		String nwPhrase = ph.substring(3,4);

		String banana = "Banana";
		
		System.out.println(ph.endsWith(ph1));
		System.out.println(ph1.startsWith(ph));
		System.out.println(nwPhrase);
		System.out.println(ph.contains(ph1));
		System.out.println(ph.indexOf("ABC"));
		System.out.println(banana.replace("Pa", "Ba"));
		System.out.println()

	}
}