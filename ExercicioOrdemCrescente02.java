package ExerciciosLacosCondicionais;

import java.util.Scanner;

public class ExercicioOrdemCrescente02 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		double a, b, c;
		
		System.out.println("Digite aqui o valor do primeiro n�mero: ");
		a = ler.nextDouble();
		
		System.out.println("Digite aqui o valor do segundo n�mero: ");
		b = ler.nextDouble();
		
		System.out.println("Digite aqui o valor do terceiro n�mero: ");
		c = ler.nextDouble();
		
		
		
		if ( a > b )
            if  (b > c) {
                System.out.println("A ordem crescente dos valores � \n" + c + "\n" + b + "\n" + a);
               
            }
            else {
                if (a > c){
                    System.out.println("A ordem crescente dos valores � \n" + b + "\n" + c + "\n" + a);
                
                }
                else {
                    System.out.println("A ordem crescente dos valores � \n" + b + "\n" + a + "\n" + c);
                
                }
            }
		  else {
	            if(b > c) {
	                if(a > c) {
	                    System.out.println("A ordem crescente dos valores � \n" + c + "\n" + a + "\n" + b);
	                  
	                }

	                else{
	                    System.out.println("A ordem crescente dos valores � \n" + a + "\n" + c + "\n" + b);
	             
	                }
	            }
	            else {
	                System.out.println("A ordem crescente dos valores � \n" + a + "\n" + b + "\n" + c);
	              
	            }
	        }
		}
	}


