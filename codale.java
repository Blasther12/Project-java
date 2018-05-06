"cod Aleatorios" 
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Locale;
public class testejava {
	
	public static void main (String[] args) {
		
		
		exercicio6();

	}
		
	 public static void exercicio5() {

			Scanner in = new Scanner(System.in);
			
			
			String sexo = "";
			
			
			
			do{
			
				System.out.println("Informe seu sexo: ");
				sexo = in.nextLine();
				
				if(sexo.equals("M"))
				{
					System.out.println("Masculino");
					
				}else if(sexo.equals("F"))
				{
					System.out.println("Feminino");
				
				}else{
					System.out.println("Errado");
				}
				
				}while(!sexo.equals("F") && !sexo.equals("M"));
			
		 
	 }//FIM PROGRAMA
	public static void exercicio3() {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um numero");
		int num1, num2, cont;
		num1 = in.nextInt();
		num2 = num1;
		while(num1<(num2+10)){
			cont = num1*2;
			System.out.println(num1+" X "+"2"+" = "+cont);
			num1++;
		}
		
		
		
	}//FIM PROGRAMA
	public static void exercicio4() {
		Scanner in = new Scanner(System.in);
		int aluno, som1, som2, som3, som4, som5, nat, atl, bas, vo, fut, mod;
		aluno = 1;
		nat=0;
		atl=0;
		bas=0;
		vo=0;
		fut=0;
		

		for(int i = 1; i < 36; i++){
			
			System.out.println("Digite sua modalidade aluno: "+aluno);
			System.out.println("1 - natação");
			System.out.println("2 - Atletismo - corrida");
			System.out.println("3 - Basquete");
			System.out.println("4 - Volei");
			System.out.println("5 - Futebol");
			mod = in.nextInt();
			
			if(mod == 1){
				System.out.println("natação");
				som1 = nat+1;
				System.out.println("Alunos inscritos em natação: "+som1+"\n\n");
				nat++;
				}else if(mod == 2) {
				System.out.println("Atletismo - Corrida");
				som2 = atl+1;
				System.out.println("Alunos inscritos em Atletismo: "+som2+"\n\n");
				atl++;
			}else if(mod == 3) {
				System.out.println("Basquete");
				som3 = bas+1;
				System.out.println("Alunos inscritos em Basquete: "+som3+"\n\n");
				bas++;
			}else if(mod == 4) {
				System.out.println("Volei");
				som4 = vo+1;
				System.out.println("Alunos inscritos em Volei: "+som4+"\n\n");
				vo++;
			}else if(mod == 5) {
				System.out.println("Futebol");
				som5 = fut+1;
				System.out.println("Alunos inscritos em Futebol: "+som5+"\n\n");
				fut++;
			}else{
				
			}
			aluno++;
		}
		
		
	}//FIM PROGRMA
	
	 public static void exemplo(){
	        Scanner in = new Scanner(System.in);
	        
	        
	        double[] vetor = new double[3];
	        
	        
	        double media = 0, mediaX, acima, cont = 0;
	        
	        
	        for(int i = 0; i < 3; i++){
	            
	            
	            System.out.println("Qual a temperatura média?");
	            vetor[i] = in.nextInt();
	            
	            
	            media = media + vetor[i];
	        }
	        
	        
	        System.out.println("A temperatura média foi "
	                + (mediaX = media / vetor.length));
	        
	        
	        for(int i = 0; i < vetor.length; i++){
	            
	            
	            acima = vetor[i];
	            
	            
	            if(acima > mediaX){
	                cont++;
	            }
	        }
	        
	        System.out.println("Temperaturas acima da média " + cont);
	    }//FIM PROGRAMA
	 public static void exemplo01() {
		 Scanner in = new Scanner(System.in);
		 
		 int[] array;
		 array = new int[10];
		 System.out.printf("%s%10s\n", " _______", " ________");
		 System.out.printf("%s%10s\n", "|indice ","| Valores");
		 System.out.printf("%s%10s\n", "|------- ","|--------|");
		 System.out.printf("%s%10s\n", " Indice", "  Valores");
		 for(int i = 0; i <= 9; i++) {
			 System.out.printf("|%5d%3s%7d |\n", i, " |", array[i]);
		 }
		 System.out.printf("%s%10s\n", "|-------", "|--------|");
	 }//FIM PROGRAMA
	 public static void exercicio6() {
		 Scanner in = new Scanner(System.in);
		 in.useLocale(Locale.ENGLISH);	
			String[] nome = new String[4];
			double  media = 0;
			
			double[] nota = new double [4];

			for(int i = 0; i < nota.length; i++)
			{
				in.nextLine();
				System.out.println("Digite seu nome e sua nota aluno: "+i+1 );
				nome[i] = in.nextLine();
				nota[i] = in.nextDouble();

				media += nota[i];
				}
				
				float total = (float)media/nota.length;
				System.out.println("MEDIA DA TURMA: "+total);
				String nomeMaior = nome[0];
				String nomeMenor = nome[0];
				double menor = nota[0];
				double maior = nota[0];
				
				for(int i = 0; i< nota.length; i++) {
					if(i==0) {
						maior = nota[i];
						nomeMaior = nome[i];
					}
					if(nota[i] > maior) {
						maior = nota[i];
						nomeMaior = nome[i];
						
					}
				}
				for(int i = 0; i< nota.length; i++) {
					if(i==0) {
						menor = nota[i];
						nomeMenor = nome[i];
					}
					if(nota[i] < menor) {
						menor = nota[i];
						nomeMenor = nome[i];
						
					}
				}
				System.out.println("Aluno com a menor nota é: "+nomeMenor);
				System.out.println("A menor nota é: "+menor);
				System.out.println("Aluno com a maior nota é: "+nomeMaior);
				System.out.println("A maior nota é: "+maior);
				
				
					
				
				
	 }//FIM DO PRGRMA
	 public static void teste ()
	 {
		 Scanner in=new Scanner(System.in);
		 
		 int aluno=0,op=0,nat=0,atle=0,bas=0,vol=0,fut=0;
		 while (aluno<5)
		 {
			 op=in.nextInt();
			 switch (op)
			 {
			 case 1:
				 nat++;
				 aluno++;
				 break;
			 case 2:
				 atle++;
				 aluno++;
				 break;
			 case 3:
				 bas++;
				 aluno++;
				 break;
			 case 4:
				 vol++;
				 aluno++;
				 break;
			 case 5:
				 fut++;
				 aluno++;
				 break;
			 default:
				 System.out.println("Opcao invalida!!!");
					 
				 
			 }
		 }
		 System.out.println(nat);
		 System.out.println(atle);
		 System.out.println(bas);
		 System.out.println(vol);
		 System.out.println(fut);
	 }
}
