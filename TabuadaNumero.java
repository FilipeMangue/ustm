import java.util.Scanner;

public class TabuadaNumero{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor: ");
		int num = scan.nextInt();
		System.out.println("Digite o operador: ");
		char opr = scan.next().charAt(0);
		
                        switch(opr){
				case '+':
					for(int i = 1; i <= 20; i++){
						System.out.println(num+" "+opr+" "+i+" = "+(num+i));
					}
					break;
				case '/':
					for(int i = 1; i <= 20; i++){
						System.out.println(num+" "+opr+" "+i+" = "+(num/i));
					}
					break;
				case '-':
					for(int i = 1; i <= 20; i++){
						System.out.println(num+" "+opr+" "+i+" = "+(num-i));
					}
					break;
				case '*': 
					for(int i = 1; i <= 20; i++){
						System.out.println(num+" "+opr+" "+i+" = "+(num*i));
					}
					break;
			}	
		

	}
}