import java.util.Scanner;

public class LerDisciplina{
	public static void main(String [] args){

		short qtdDisciplinas;

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a quantidade de disciplinas: ");
		qtdDisciplinas = scan.nextShort();
                System.out.println(qtdDisciplinas);
	}
}