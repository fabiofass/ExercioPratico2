package aula05;

public class Arreys {

	public static void main(String[] args) {
		int[] vetor = new int [10];
		System.out.println("Comprimento de vetor: " + vetor.length);
		int valor =0;
		for(int i =0; i<vetor.length; i++) {
			vetor[i] = valor += 2;
		}
		for(int contador = 0; contador<vetor.length;contador++) {
		System.out.println(vetor[contador]);
		//System.out.println(vetor[1]);
		////System.out.println(vetor[2]);
		//System.out.println(vetor[3]);
		//System.out.println(vetor[4]);

		}
	}

}
