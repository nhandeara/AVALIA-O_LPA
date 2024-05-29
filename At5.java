package AvaliaçãoLPA;

import java.util.Scanner;

public class At5 {

	public static void main(String[] args) {
		Scanner ler= new Scanner (System.in);//chamando o Scanner
		
		String a[]=new String[6];//criando 6 vagas na garagem (armazenamento)criação da variavel
		
		
		for (int i =0; i<6; i++) {//processamento e repetição
			System.out.println("informe o carro da vaga " + i+"..:");//entrada de dados
			a[i]= ler.next();//ler a variavel tipo string 
			
		}
		//saida 
	    for (int i =0; i<6; i++) {
	     System.out.println(a[i++]);	
	    }
       ler.close();//fechamento do programa 

	}

}
