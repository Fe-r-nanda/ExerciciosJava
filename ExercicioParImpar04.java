package ExerciciosLacosCondicionais;

import java.util.Scanner;

public class ExercicioParImpar04 {
	
	public static void main(String [] args) {
		
		double num, solucao;
	
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite o n�mero desejado");
		num = entrada.nextDouble();
		
		solucao = num % 2;
	
		if(solucao == 0){
			System.out.println("Seu n�mero � par! E a raiz quadrada �: " + (Math.sqrt(num)));
		
		}
		else{
		System.out.println("Seu n�mero � �mpar! E elevado ao quadrado �: " + (Math.pow(num, 2.0)));
		}
	}

}
