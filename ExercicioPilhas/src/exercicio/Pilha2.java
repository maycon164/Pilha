package exercicio;

public class Pilha2<T> {

	Object[] vetor = new Object[10];
	int tamanho = vetor.length - 1;

	public void Pilha2() {

	}

	public void push(T item) {
		//se a ultima posição do vetor for diferente de null então dobre o vetor;
		if(vetor[tamanho] != null ) {
			System.out.println("Dobrar");
			dobrarVetor();
		}
		//Adiciona o item normalmente no vetor
		for (int x = 0; x <= tamanho; x++) {
			if (vetor[x] == null) {
				vetor[x] = item;
				break;
			}
		}

	}
	//Retira o ultimo item do array = ou seja o ultimo entrar é o primeiro a sair; seta null na posição que foi retirada
	public void pop() {
		for(int x = tamanho; x >= 0; x--) {
			if(vetor[x] != null) {
				vetor[x] = null;
				break;
			}
		}
	}
	// aumenta o vetor para +10 posições
	public void dobrarVetor() {
		Object[] aux = new Object[vetor.length + 10];
		for (int x = 0; x < vetor.length; x++) {
			aux[x] = vetor[x];
		}
		vetor = aux;
		tamanho = vetor.length - 1;
	}


	//Imprime o vetor ao contrario
	public void mostrar() {

		System.out.print("[ ");

		for (int x = vetor.length - 1; x >= 0; x--) {
			if (vetor[x] != null) {
				if(x == 0) {
					System.out.print(vetor[x]);
				}else {
					System.out.print(vetor[x] + ", ");
				}
				
			}
		}
		System.out.print(" ]");
		System.out.println();
	}
	
	public String toString() {
		StringBuffer palavra = new StringBuffer();
		for(int x = 0; x < vetor.length; x++) {
			if(vetor[x] != null) {
				palavra.append(vetor[x]);
			}
		}
		return palavra.toString();
	}
}
