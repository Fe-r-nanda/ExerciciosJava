package ExerciciosLacosCondicionais;

import java.util.Scanner;

public class Exercicio3inteiros01 {
	
	public static void main(String [] args) {
		
	int num1, num2, num3, maior = 0;
	
	
	Scanner entrada = new Scanner (System.in);
	
	System.out.println("Digite aqui o primeiro número: ");
	num1 = entrada.nextInt();
	if (maior < num1)
	maior = num1;
	
	System.out.println("Digite aqui o segundo número: ");
	num2 = entrada.nextInt();
	if(maior < num2)
	maior = num2;
	
	System.out.println("Digite aqui o terceiro número: ");
	num3 = entrada.nextInt();
	if (maior< num3)
	maior = num3;
	

	System.out.println("O maior número é: " + maior);
	}
	
}
