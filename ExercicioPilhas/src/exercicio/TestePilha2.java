package exercicio;

public class TestePilha2 {
	public static void main(String[] args) {
		Pilha2<Character> pilha = new Pilha2<Character>();

		String frase = "Maycon";
		
		char [] palavra = frase.replace(" ", "").toLowerCase().toCharArray();
		System.out.println(palavra);
		
		for(char c: palavra) {
			pilha.push(c);
		}
		
		Pilha2<Character> pilhaAux = new Pilha2<Character>();
		for(int x = palavra.length - 1; x >= 0; x--) {
			pilhaAux.push(palavra[x]);
		}
		
		System.out.println("===***===");
		pilha.mostrar();
		System.out.println(pilha);
		System.out.println();
		pilhaAux.mostrar();
		System.out.println(pilhaAux);
		
		System.out.println("é palindromo: " + pilha.toString().equals(pilhaAux.toString()));
		
	}
}
