package ExerciciosLacosCondicionais;

import java.util.Scanner;

public class ExercicioIdade03 {

	public static void main(String[] args) {
		
		double idade, categoria;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite sua idade: ");
		idade = entrada.nextDouble();
		
		if(idade >= 10 && idade<=14) {
			System.out.println("A sua categoria � INFANTIL");
		}
		else if(idade >= 15 && idade<=17) {
			System.out.println("A sua categoria � JUVENIL");
		}
		else if(idade>= 18 && idade<= 25) {
			System.out.println("A sua categoria � ADULTO");
		}
		else {
			System.out.println("Voc� n�o se encontra em nenhuma categoria.");
		}
			
			

	}

}
