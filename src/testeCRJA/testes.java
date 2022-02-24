package testeCRJA;
import java.util.Scanner;
public class testes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int opcao = 0;

	    do {
	      System.out.println("## Escolha uma das opções abaixo ##");
	      System.out.println();
	      System.out.println("Opção 1 - Exercicio 1");
	          System.out.println("Opção 2 - Exercicio 2");
	          System.out.println("Opção 3 - Exercicio 3");
	          System.out.println("Opção 4 - Exercicio 4");
	          System.out.println("Opção 0 - Sair do teste");
	          System.out.println("_______________________");
	          System.out.println();
	          System.out.print("Digite aqui sua opção: ");
	          opcao = sc.nextInt();

	          if(opcao == 1){
	        	  
	        	int x = 0;
	        	int y = 0;
	        	int z = 0;
	        	String resposta = "";
	        	
	        	System.out.print("Digite o valor de x: ");
	        	x = sc.nextInt(); 
	        	
	        	System.out.print("Digite o valor de y: ");
	        	y = sc.nextInt();
	        	
	        	z = (x * y) + 5;
	        	
	        	if(z <= 0) {
	        		resposta = "A";
	        	} else if(z <= 100) {
	        		resposta = "B";
	        	} else {
	        		resposta = "C";
	        	}
	        	
	        	System.out.println();
	        	System.out.println("valor de z: " + z + " resposta: " + resposta);
	        	System.out.println();
	            
	          }else if(opcao == 2){
	        	  
	            int idadeHA = 0;
	        	int idadeHB = 0;
	        	int idadeMA = 0;
	        	int idadeMB = 0;
	        	int idadeHmais = 0;
	        	int idadeHmenos = 0;
	        	int idadeMmais = 0;
	        	int idadeMmenos = 0;
	        		        	
	        	System.out.print("Digite a idade do 1º homem: ");
	        	idadeHA = sc.nextInt(); 
	        	
	        	System.out.print("Digite a idade do 2º homem: ");
	        	idadeHB = sc.nextInt();
	        	
	        	System.out.print("Digite a idade da 1º mulher: ");
	        	idadeMA = sc.nextInt(); 
	        	
	        	System.out.print("Digite a idade da 2º mulher: ");
	        	idadeMB = sc.nextInt();
	        	
	        	if(idadeHA > idadeHB) {
	        		idadeHmais = idadeHA;
	        		idadeHmenos = idadeHB;
	        	} else{
	        		idadeHmais = idadeHB;
	        		idadeHmenos = idadeHA;
	        	}
	        	if(idadeMA > idadeMB) {
	        		idadeMmais = idadeMA;
	        		idadeMmenos = idadeMB;
	        	} else{
	        		idadeMmais = idadeMB;
	        		idadeMmenos = idadeMA;
	        	}
	        	
	        	System.out.println();
	        	System.out.println("Soma das idades do homem mais velho com a mulher mais nova = "
	        	+ (idadeHmais + idadeMmenos));
	        	System.out.println();
	        	System.out.println("Produto das idades do homem mais novo com a mulher mais velha = "
	    	    + (idadeHmenos * idadeMmais));
	        	System.out.println();
	        	
	          }else if(opcao == 3) {
	        	  
	        	String seq = "1, 1 2 3 4 5 6 7 8 9 10";
	        	int index = 0;
	        	int fim = 0;
	        	int i = 0;
	        	
	        	System.out.println();
	        	while(fim < 10) {
	        		
	        		System.out.println("("+seq+")");	        		
		        	fim = Integer.parseInt(seq.substring(0, 1)) + 2;		        		
		        	seq = seq.substring(0, index) + String.valueOf(fim) + seq.substring(index + 1);
		        	
	        	}
	        	System.out.println();
	          }else if(opcao == 4) {
	        	  
	        	  int[] v1 = {8,15,18,20,33,42,54,66,78,80};
	        	  int[] v2 = {6,7,9,14,15,23,35,39,43,69};
	        	  int[] v3 = new int[v1.length + v2.length];
	        	  
	        	  for (int i = 0, j = 0, k = 0; i < v1.length || j < v2.length; k++) {
	                  if (i >= v1.length) {
	                      v3[k] = v2[j];
	                      j++;
	                  } else if (j >= v2.length) {
	                      v3[k] = v1[i];
	                      i++;
	                  } else {
	                      if (v1[i] <= v2[j]) {
	                          v3[k] = v1[i];
	                          i++;
	                      } else {
	                          v3[k] = v2[j];
	                          j++;
	                      }        
	                  }
	              }

	        	  System.out.println();
	        	  System.out.print("v3 = { ");
	        	  for (int i = 0; i < v3.length; i++) {
	                  System.out.print(v3[i] + " ");
	              }
	        	  System.out.print("}");
	              System.out.println();
	              System.out.println();	        	  
	          }
	          else{
	        	  System.out.println();
	        	  System.out.println("Pressione uma tecla para sair.");
	              sc.nextLine();
	          }         
	    } while (opcao != 0);

	    sc.close();

	}

}
