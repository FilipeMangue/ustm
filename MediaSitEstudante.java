import java.util.Scanner;

public class MediaSitEstudante{
	public static void main(String [] args){
		double media, nota1, nota2, trabalho;

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite a nota 1: ");
                nota1 = scan.nextDouble();
		System.out.print("Digite a nota 2: ");
                nota2 = scan.nextDouble();
		System.out.print("Digite a nota do trabalho: ");
                trabalho = scan.nextDouble();

		media = ((nota1 * 0.4) + (nota2 * 0.4)) + (trabalho * 0.2);

                System.out.println("");
		if(media < 5) {
			System.out.println("Media: "+media);
			System.out.println("Estudante da categoria A");
		} else if(media >= 5 && media < 9.5) {
			System.out.println("Media: "+media);
			System.out.println("Estudante da categoria B");
		}else if(media >= 9.5 && media < 13.5) {
			System.out.println("Media: "+media);
			System.out.println("Estudante da categoria C");
		} else if(media > 13.5 && media <= 20) {
			System.out.println("Media: "+media);
			System.out.println("Estudante da categoria D");
		} else {
			System.out.println("Media: "+media);
			System.out.println("Media Invalida!");			
		}

	}
}