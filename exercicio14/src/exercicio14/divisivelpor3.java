package exercicio14;


//Faça o mesmo que você fez para o exercício 1, mas agora faça utilizando o laço "while".

public class divisivelpor3 {

	
		static final Integer Divisor = 3;
		
		public static void main(String[] args) {
			Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
			
			//for(int i = 0; i < numeros.length; i++) {
				//Integer numero = numeros[i];
				//Integer divisivel = numero % Divisor;
				
			int i = 0;
			while (i < numeros.length) {
			
				Integer numero = numeros[i];
				Integer divisivel = numero % Divisor;
			
				if(divisivel.equals(0)) {
					System.out.print("numero: " + numero + " é divisivel por 3."+" / ");
					
					
				}
				
				i++;
			}
			}
		}

	
