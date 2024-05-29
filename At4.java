package AvaliaçãoLPA;
import java.util.Scanner;
public class At4 {

	public static void main(String[] args) {
		Scanner ler= new Scanner (System.in);//chamando o Scanner
		
		int valores[] = new int[15];//criando espaço para valores e variavel 
		int soma = 0;//calculo a ser feito
		
		for (int i =0;i<15; i++) {//processamentoe recebe 15 valores com repetição
		System.out.print("Informe um valor "+i+":");//entrada de dados
		valores[i]=ler.nextInt();//ler valores inteiros
		}
		
		for (int valor : valores) {//processamento 
		soma= soma+ valor;//calculo
		}
		System.out.println("A soma dos valores é: " + soma);//exibição de resultados 
		}
		}
	


