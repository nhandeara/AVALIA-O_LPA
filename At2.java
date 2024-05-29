package AvaliaçãoLPA;
import java.util.Scanner;
public class At2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);//chamando o scanner
		Double b,h,area;//criação da variaveis para guardar dados
		
		//entrada
		System.out.println ("informe o valor da altura: ");//informar valores para o calculo
		h= ler.nextDouble();//ler variavel (h) em tipo Double(real)
		
		System.out.println("informe o valor da base: ");//informar valores para o calculo
		b=ler.nextDouble();//ler variavel (h) em tipo Double(real)
		
		//processamento
		area= (b*h)/2;//calculo da área
		
		//saída
		System.out.println("o valor da área é: " + area);//exibição do resultado 

	}

}
