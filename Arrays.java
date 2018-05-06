import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int op = 0;
		do {
			System.out.println("\n\n");
			System.out.println("##MENU##");
			System.out.println("1) EXERCICIO 1;");
			System.out.println("2) EXERCICIO 2;");
			System.out.println("3) EXERCICIO 3;");
			System.out.println("4) EXERCICIO 4;");
			System.out.println("5) EXERCICIO 5;");
			System.out.println("6) EXERCICIO 6;");
			System.out.println("7) EXERCICIO 7;");
			System.out.println("8) EXERCICIO 8;");
			System.out.println("0) SAIR DO PROGRAMA;");
			op = in.nextInt();
			switch(op)
			{
			case 1:
				exe1();
				break;
			case 2:
				exe2();
				break;
			case 3:
				exe3();
				break;
			case 4:
				exe4();
				break;
			case 5:
				exe5();
				break;
			case 6:
				exe6();
				break;
			case 7:
				exe7();
				break;
			case 8:
				exe8();
				break;
			case 0:
				System.out.println("FIM DO PROGRAMA");
				break;
				default:
					System.out.println("-> OPÇÃO INVALIDA <-");
			}
		}while(op != 0);
	}
	public static void exe1() {
		Scanner in = new Scanner(System.in);
		float media, soma = 0;
		float nota[] = new float[15];
		
		for(int i = 0; i<nota.length; i++)
		{
			System.out.println("Informe sua nota: ");
			nota[i] = in.nextFloat();
			
			soma+=nota[i];
			
			
		}
		media = soma/15;
		System.out.printf("Media: %.2f", media);
		System.out.println("Notas iguais ou maiores a media: ");
		for(int i = 0; i<nota.length; i++)
		{
			if(nota[i] >= media)
			{
				System.out.println("\t->"+nota[i]+";");
			}
		}
		
	}
	public static void exe2() {
		Scanner in = new Scanner(System.in);
		float media, soma = 0;
		float nota[] = new float[15];
		
		for(int i = 0; i<nota.length; i++)
		{
			System.out.println("Informe sua nota: ");
			nota[i] = in.nextFloat();
			
			soma+=nota[i];
			
			
		}
		media = soma/15;
		System.out.printf("Media: %.2f\n", media);
		
		float maiorNota = nota[0];
		float menorNota = nota[0];
		
		for(int i = 0; i<nota.length; i++)
		{
			if(nota[i] > maiorNota)
			{
				maiorNota = nota[i];
			}
		}
		for(int i = 0; i<nota.length;i++)
		{
			if(nota[i]<menorNota)
			{
				menorNota = nota[i];
			}
		}
		System.out.printf("Maior nota: %.2f\n", maiorNota);
		System.out.printf("Menor nota: %.2f\n", menorNota);
	}
	public static void exe3() {
		Scanner in = new Scanner(System.in);
		
		int num[] = new int[10];
		int dob[] = new int[10];
		
		for(int i = 0; i<num.length; i++)
		{
			System.out.println("Digite um numero para a "+(i+1)+"º posição do vetor:");
			num[i] = in.nextInt();
			
			dob[i] = num[i]*2;
		}
		System.out.println("Valor do vetor 2: ");
		for(int i = 0; i<dob.length; i++)
		{
			System.out.println("\t->"+dob[i]);
		}
	}
	public static void exe4() {
		Scanner in = new Scanner(System.in);
		int n;
		System.out.println("Digite um numero N: ");
		n = in.nextInt();
		int num[] = new int[5];
		
		for(int i = 0; i<num.length; i++)
		{
			System.out.println("Informe o valor da "+(i+1)+"º posição do vetor: ");
			num[i] = in.nextInt();
		}
		System.out.println("valores inferiores a N");
		for(int i = 0; i<num.length; i++)
		{
			if(num[i] < n)
			{
				System.out.println("\t-"+num[i]);
			}
		}
	}
	public static void exe5() {
		Scanner in = new Scanner(System.in);
		int n, cont=0;
		int num[] = new int[5];
		System.out.println("Informe um numero N: ");
		n = in.nextInt();
		
		for(int i = 0; i<num.length; i++)
		{
			System.out.println("Informe o valor da "+(i+1)+"º posição do vetor: ");
			num[i] = in.nextInt();
			if(num[i] == n)
			{
				cont++;
			}
		}
		System.out.println("O valor N aparece "+cont+" no vetor;");
		
		
	}
	public static void exe6() {
		Scanner in = new Scanner(System.in);
		int num[] = new int[10];
		int soma=0; 
		for(int i = 0; i<num.length; i++)
		{
			System.out.println("Informe o valor da "+(i)+"º posição do vetor: ");
			num[i] = in.nextInt();
			
			if(i%2==0)
			{
				
				if(num[i]%2 == 0)
				{
					soma = soma + num[i];
				}
			}
		}
		
		System.out.println("Valor da soma: "+soma+";");
	}
	public static void exe7() {
		Scanner in = new Scanner(System.in);
		int a = 0, cont = 0;
		int vetor1[] = new int[5];
		int vetor2[] = new int[5];
		String igualdade ="";
		
		for(int i = 0; i < vetor1.length; i++)
		{
			System.out.println("informe o "+(i+1)+"º valor do vetor 1: ");
			vetor1[i] = in.nextInt();
			System.out.println("informe o "+(i+1)+"º valor do vetor 2: ");
			vetor2[i] = in.nextInt();
		}
		do {
			
			
			if(vetor1[a] == vetor2[a])
			{
				cont++;
				igualdade = "Vetor 1 é igual ao Vetor 2";
			}else{
				System.out.println("\n");
				System.out.println("-> Vetor 1 é diferente de Vetor 2 <-");
				igualdade = "Vetor 1 é diferente de Vetor 2";
			}
			a++;
			
		}while(igualdade != "Vetor 1 é diferente de Vetor 2"  && cont < 4 );
		
		if(igualdade == "Vetor 1 é igual ao Vetor 2")
		{
			System.out.println("\n");
			System.out.println("-> Vetor 1 é igual ao Vetor 2 <-");
		}
		
	}
	public static void exe8() {
		Scanner in = new Scanner(System.in);
		int A[] = new int[10];
		int B[] = new int[10];
		int C[] = new int[10];
		
		A[0] = 1; B[0] = 10;
		A[1] = 2; B[1] = 11;
		A[2] = 3; B[2] = 12;
		A[3] = 4; B[3] = 13;
		A[4] = 5; B[4] = 14;
		A[5] = 6; B[5] = 15;
		A[6] = 7; B[6] = 16;
		A[7] = 8; B[7] = 17;
		A[8] = 9; B[8] = 18;
		A[9] = 10; B[9] = 19;
		
		System.out.println("Soma de vetor A com vetor B:");
		for(int i = 0; i<C.length; i++)
		{
			C[i] = A[i] + B[i];
			System.out.println((i+1)+"º posição Vetor A + Vetor B "+" -> "+C[i]);
			
		}
		
	
		
		
	}
}