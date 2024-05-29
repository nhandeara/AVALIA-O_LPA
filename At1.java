package AvaliaçãoLPA;
import java.util.Scanner;
public class At1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);//chamando Scanner
		Double a,b,soma,sub,multi,div;//criação de variaveis para guardar dados
		
		//entrada de dados
		System.out.println("informe o valor 1: ");//informar valores para o calculo
	    a=ler.nextDouble();//ler variavel (a) em tipo Double(real)
	    
	    System.out.println("informe o valor 2: ");//informar valores para o calculo
	    b=ler.nextDouble();//ler variavel (b) em tipo Double(real)
	    
	    //processamento
	   soma=a+b;//operação da soma
	   sub=a-b;//operação de subtração
	   multi=a*b;//operação da multiplicação
	   div=a/b;//operação divisão
	   
	   //saida de dados
	   System.out.println("O resultado da soma é: "+soma);//resultado soma
	
	   System.out.println("o resultado da subtração é: " +sub);//resultado subtração
	   
	   System.out.println("o resultado da multiplicação é: " +multi);//resultado multiplicação
	   
	   System.out.println("o resultado da divisão é : "+div);//resultado divisão
		

	}

}
