package AvaliaçãoLPA;

import java.util.Scanner;

public class At3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);//chamando o Scanner
		int dia;//criação de variáveis do tipo inteiro
		
		
		System.out.println("Informe o dia: ");//entrada de dados
		dia = ler.nextInt();
		
		//processamento e saida 
		if (dia == 1) {//verificando se é verdadeiro  
		System.out.println("Domingo");
		}
		//processamento e saida 
		else if (dia == 2) {//verificando se é verdadeiro 
		System.out.println("Segunda-Feira");
		}
		//processamento e saida 
		else if (dia == 3) {//verificando se é verdadeiro 
		System.out.println("Terça-Feira");
		}
		//processamento e saida 
		else if (dia == 4) {//verificando se é verdadeiro 
		System.out.println("Quarta-Feira");
		}
		//processamento e saida 
		else if (dia == 5) {//verificando se é verdadeiro 
		System.out.println("Quinta-Feira");
		}
		//processamento e saida 
		else if (dia == 6) {//verificando se é verdadeiro 
		System.out.println("Sexta-Feira");
		}
		//processamento e saida 
		else if (dia == 7) {//verificando se é verdadeiro 
		System.out.println("Sábado");
		}
		//processamento e saida 
		else {
		System.out.println("Dia inválido");
		}
		ler.close();//fechamento do programa
		}

	}


