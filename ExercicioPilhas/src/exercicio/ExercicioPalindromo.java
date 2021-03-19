package exercicio;

import java.util.Scanner;

public class ExercicioPalindromo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Pilha<Character> pilhaOriginal = new Pilha<>();
		Pilha<Character> pilhaAuxiliar = new Pilha<Character>();

		System.out.println("Escreva uma palavra" );
		System.out.print("R: ");
		String palavra = sc.nextLine();
	
		
		char[] letras = palavra.toLowerCase().trim().replace(" ", "").toCharArray();
		
		for(char ch: letras) {
			pilhaOriginal.push(ch);
			pilhaAuxiliar.push(ch);
		}

		Pilha<Character> pilhaSaida = new Pilha<Character>();
		int tamanho = pilhaAuxiliar.tamanho();
		
		for(int x = 0; x < tamanho; x++) {
			pilhaSaida.push(pilhaAuxiliar.pop());
		}

		if(pilhaOriginal.toString().equals(pilhaSaida.toString())) {
			System.out.println("A palavra/frase: '" + palavra + "' é um palindromo");
		}else {
			System.out.println("A palavra: '" + palavra + "' não é palindromo");
		}
		sc.close();
	}
}
