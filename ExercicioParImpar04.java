package ExerciciosLacosCondicionais;

import java.util.Scanner;

public class ExercicioParImpar04 {
	
	public static void main(String [] args) {
		
		double num, solucao;
	
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite o número desejado");
		num = entrada.nextDouble();
		
		solucao = num % 2;
	
		if(solucao == 0){
			System.out.println("Seu número é par! E a raiz quadrada é: " + (Math.sqrt(num)));
		
		}
		else{
		System.out.println("Seu número é ímpar! E elevado ao quadrado é: " + (Math.pow(num, 2.0)));
		}
	}

}
