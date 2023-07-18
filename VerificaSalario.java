import java.util.Scanner;

public class VerificaSalario{
	public static void main(String [] args){
		double salBase;

		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o salario base: ");
                salBase = scan.nextDouble();

		salBase = salBase + (salBase * 0.16);
		
		if(salBase > 10000){
			System.out.println(salBase+"Funcionario com salario da categoria A");
		}else{
			System.out.println(salBase+"Funcionario com salario da categoria B");
		}

	}
}