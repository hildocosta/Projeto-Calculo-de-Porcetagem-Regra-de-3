package Porcentagem;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ProjetoPorcentagemRegrade3 {
	
	
	public static void main(String[] args) {
		
		//Atribuindo as Variáveis X, Y e Valor
		
		double x;
		double y;
		double valor;
		
		
		//Objetos
		
		//Método Scanner para capturar entrada de dados digitados no Teclado
	    Scanner teclado = new Scanner(System.in);
	    
	    //Método DecimalFormat para formatação do Resultado em (uma ou duas casas decimais)
	    DecimalFormat formatador = new DecimalFormat("#0.00");
	    
	    //Método Entrada de Dados
	    System.out.println("Porcentagem Regra de 3");
	    System.out.println("x% de y = valor");
	    System.out.print("Digite o valor de X: ");
        
	    //Capturando os dados digitados no Teclado
	    x = teclado.nextDouble();
	    
       System.out.print("Digite o valor de Y: ");
	    
	    
	    //Capturando os dados digitados no Teclado
	    y = teclado.nextDouble();
	    
	    //Processamento dos Dados (Fórmula para Conversão)
	    valor = (x * y) / 100;
	    
	    //Resultado
	    System.out.println(x + "% de " + y + " = " +
	    formatador.format(valor));
	    
	    //Para Fechar o Teclado e  não permitir mais a entrada de Dados.
	    teclado.close();


	}
}
