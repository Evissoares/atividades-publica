package fuso_horario;

import utils.Teclado;

public class Principal {
	public static void main(String[] args) {

		int horaBrasilia = Teclado.inteiro("Digite o hor�rio de Brasilia");

		int cidadeEscolhida = Teclado.inteiro("Digite" + 
				"\n1 - Cidade do M�xico" +
				"\n2 - T�quio" + 
				"\n3 - Nova Iorque");

		int hora;

		switch (cidadeEscolhida) {

		case 1: 
			hora = (horaBrasilia + (-6)) % 24;   
			System.out.println(hora);
			break;
		case 2:
			hora = (horaBrasilia + 9) % 24;   
			System.out.println(hora);
			break;
		case 3:
			hora = (horaBrasilia + (-5)) % 24;   
			System.out.println(hora);	
			break;
		default : System.out.println("Erro de convers�o"); 
		} 
		

	}
}
