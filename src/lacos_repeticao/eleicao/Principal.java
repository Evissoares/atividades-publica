package lacos_repeticao.eleicao;

import utils.Teclado;

public class Principal {

	public static void main(String[] args) {

		int candidato1;
		int candidato2;
		int candidato3;
		int candidato4;

		int continuar = 1;
		
		do {
			
			System.out.println("");
			
			continuar = Teclado.inteiro("Deseja continuar?\n[1] - SIM\n[2] - N�O");
			
		}while(continuar == 1);
		
		
		/**
		 * Criar um sistema de vota��o, nele haver� quatro candidatos. Crie uma lista
		 * exibindo os candidatos, receba o voto e contabilize em um contador, em
		 * seguida pergunte se deseja continuar a vota��o ou encerrar.
		 * 
		 * Quando encerrada a vota��o, informe a quantidade de votos de cada candidato,
		 * o percentual e o nome do candidato eleito (pode haver mais que um).
		 */

	}
}
