import java.util.Scanner;

public class MetodoRetorno5{
	public static void main(String [] args){
		Scanner scn = new Scanner(System.in);

		int[] array1 = new int[5]; 
		int[] array2 = new int[5];

		for(int i = 0; i < 5; i++){
			System.out.println("Digite numero "+i+": ");
			array1[i] = scn.nextInt();
		}
		for(int i = 0; i < 5; i++){
			System.out.println("Digite numero "+i+": ");
			array2[i] = scn.nextInt();
		}

		int[] sum = retornaSomaArrays(array1, array2);

		for(int i = 0; i < 5; i++){
			System.out.println(sum[i]);
		}
	}
	public static int[] retornaSomaArrays(int[] array1, int[] array2){

		int[] soma = new int[5];

		for(int i = 0; i < 5; i++){
			soma[i] = array1[i] + array2[i];
		}

		return soma;
	}
}