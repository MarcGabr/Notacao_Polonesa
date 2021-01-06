import java.util.Scanner;
import java.util.Stack;

public class NotaçãoPolonesa {
	public static void main(String[] argv) {
		Scanner input = new Scanner(System.in);
		Stack<Double> pilha = new Stack<Double>();
		//double a = 10, b = 20, c = 22;
		String nome2;
		String nome = input.nextLine();
		int a = nome.length();
		int i;
		double b,c,d;
		
		for(i=0;i<a;i++) {
			nome2 = nome;
			if(nome.charAt(i)== '+') {
				 b = (double) pilha.pop();
				 c = (double) pilha.pop();
				//System.out.println("Retirando da pilha: " +  b); 
				//System.out.println("Retirando da pilha: " +  c); 
				b = b + c;
				//System.out.println("Somando : " +  b); 
				pilha.push(b);
				
			}	else if (nome.charAt(i) == '-') {
				 b = (double) pilha.pop();
				 c = (double) pilha.pop();
				//System.out.println("Retirando da pilha: " +  b); 
				//System.out.println("Retirando da pilha: " +  c); 
				b = c - b;
				//System.out.println("Subtraindo : " +  b); 
				pilha.push(b);	
			}
			else if (nome.charAt(i) == '*') {
				 b = (double) pilha.pop();
				 c = (double) pilha.pop();
				//System.out.println("Retirando da pilha: " +  b); 
				//System.out.println("Retirando da pilha: " +  c); 
				b = b * c;
				//System.out.println("Multiplicando " +  b); 
				pilha.push(b);	
			}else if (nome.charAt(i) == '/') {
				 b = (double) pilha.pop();
				 c = (double) pilha.pop();
				//System.out.println("Retirando da pilha: " +  b); 
				//System.out.println("Retirando da pilha: " +  c); 
				b = c / b;
				//System.out.println("Dividindo " +  b); 
				pilha.push(b);	
			}
			else {
				nome2 = nome2.substring(i, i+1);
				c = (double) Integer.parseInt(nome2);
				pilha.push(c);
				//System.out.println("Inserindo na pilha: " + pilha.push(c)); 				
			}
		}
		System.out.println("Resultado eh " + pilha.peek());
		
		/*
		System.out.println("Inserindo na pilha: " + pilha.push(a));  
		System.out.println("Inserindo na pilha: " + pilha.push(b)); 
		System.out.println("Retirando da pilha: " + j);  
		System.out.println("O topo esta assim " + pilha.peek());  
		*/
	        
	}
}