package HOROSCOPO_TERMINAR;

import utils.Teclado;

public class Principal {

	public static void main(String[] args) {

		
		
		int dia = Teclado.inteiro("Digite o dia do seu anivers�rio");
		int mes = Teclado.inteiro("Digite o m�s do seu anivers�rio"
				+ "\n1 - Janeiro"
				+ "\n2 - Fevereiro"
				+ "\n3 - Mar�o"
				+ "\n4 - Abril"
				+ "\n5 - Maio"
				+ "\n6 - Junho"
				+ "\n7 - Julho"
				+ "\n8 - Agosto"
				+ "\n9 - Setembro"
				+ "\n10 - Outubro"
				+ "\n11 - Novembro"
				+ "\n12 - Dezembro");
		
		if(mes == 1 && dia > 20) {
			
			
		}
		
		/**
		 * Aqu�rio: de 21 de janeiro a 18 de fevereiro;
		 * Peixes: de 19 de fevereiro a 20 de mar�o; 
		 * �ries: de 21 de mar�o a 20 de abril; 
		 * Touro: de 21 de abril a 20 de maio;
		 * G�meos: de 21 de maio a 20 de junho; 
		 * C�ncer: de 21 de junho a 22 de julho;
		 * Le�o: de 23 de julho a 22 de agosto; 
		 * Virgem: de 23 de agosto a 22 de setembro; 
		 * Libra: de 23 de setembro a 22 de outubro; 
		 * Escorpi�o: de 23 de outubro a 21 de novembro; 
		 * Sagit�rio: de 22 de novembro a 21 de dezembro;
		 * Capric�rnio: de 22 de dezembro a 20 de janeiro; 
		 */

	}
}
