package exercicio;

import java.util.Arrays;
import java.util.Scanner;

public class ExercicioOrdenarNumeros {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Pilha<Integer> A = new Pilha<Integer>();
		Pilha<Integer> B = new Pilha<Integer>();
		
		System.out.print("Quantos numeros: ");
		int quantidade = sc.nextInt();
		
		for(int x = 0; x < quantidade; x++) {
			System.out.print("Digite o numero #"+ (x + 1)+ ": ");
			int num = sc.nextInt();
			B.push(num);
		}
		B.mostrar();
		
		//Desempilhar os valors de B para um array de int
		int []numeros = new int[quantidade];
		for(int x = 0; x < quantidade; x++) {
			numeros[x] = B.pop();
		}
		//Ordena o Array do menor para o maior
		Arrays.sort(numeros);
		
		for(int x = numeros.length -1; x >= 0; x--) {
			A.push(numeros[x]);
		}
		System.out.println("Ordenei a pilha do menor para o maior");
		A.mostrar();
		
		sc.close();
	}
	
	
}
