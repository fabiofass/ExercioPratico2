package aula04;

public class EstruturaDoWhile {

	public static void main(String[] args) {
		
		int contador = 0;
		
		do { System.out.println(contador);
		contador++;
		if (contador > 5) {
			System.out.println("contador maior ou igual a 5");
		}
			
		}while(contador <= 5);

	}

}
