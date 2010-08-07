import java.util.HashMap;


public class Romanos {

	private static java.util.Map<Character, Integer> digitos;

	static {
		digitos = new HashMap<Character, Integer>();
		digitos.put('I',1);
		digitos.put('V',5);
		digitos.put('X',10);
		digitos.put('L',50);
	}
	
	public static int traduzir(String romano) {
		
		if(repeteMaisDe3Vezes(romano))
			throw new RuntimeException();
		
		int[] traduzidos = traduzDigitos(romano);
		tratarSubtracoes(traduzidos);
		return soma(traduzidos);
	}

	private static boolean repeteMaisDe3Vezes(String romano) {
		int ocorrencias=1;
		char charAtual=romano.charAt(0);
		
		for (int i = 1; i < romano.length(); i++) {
			
			char charAt = romano.charAt(i);
			
			if (charAt == charAtual)
				ocorrencias++;
			else {
				charAtual = charAt;
				ocorrencias = 1;
			}
			
			if (ocorrencias>3)
				return true;
			
		}
		
		return false;
	}

	private static void tratarSubtracoes(int[] traduzidos) {
		for(int i=0 ; i< traduzidos.length ; i++)
			if (i+1 < traduzidos.length && traduzidos[i] < traduzidos[i+1])
				traduzidos[i] *= -1;
	}

	private static int[] traduzDigitos(String romano) {
		int[] retorno = new int[romano.length()]; 
		for (int i = 0; i < romano.length(); i++) {
			retorno[i] = digitos.get(romano.charAt(i));
		}
		return retorno;
	}
	
	private static int soma(int[] traduzidos) {
		int soma = 0;
		for (int i: traduzidos) {
			soma += i;
		}
		return soma;
	}

}
