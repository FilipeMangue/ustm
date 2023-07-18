import java.util.Scanner;

public class NomeCompleto {
	public static void main(String [] args){
		String firstName, secondName, surname;
		 
		Scanner n = new Scanner(System.in);
		System.out.print("Digite o seu primeiro nome: ");
		firstName = n.next();
		System.out.print("Digite o seu segundo nome: ");
		secondName = n.next();
		System.out.print("Digite o seu apelido nome: ");
		surname = n.next();

 		System.out.println("Nome Completo: "+firstName+" "+secondName+" "+surname);
	}
}