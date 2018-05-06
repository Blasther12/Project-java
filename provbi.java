"provbi" 
import java.util.Scanner;
import java.lang.Math;
public class Principal {

	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num;
		do {
			System.out.println("DIGITE QUAL PROGRAMA DESEJA EXECUTAR:");
			System.out.println("1)EXERCICIO 01");
			System.out.println("2)EXERCICIO 02");
			System.out.println("3)EXERCICIO 03");
			System.out.println("4)EXERCICIO 04");
			System.out.println("5)EXERCICIO 05");
			System.out.println("6)EXERCICIO 06");
			System.out.println("0) SAIR");
			num = in.nextInt();
			switch(num)
			{
			case 1:
				exercicio01();
				break;
			case 2:
				exercicio02();
				break;
			case 3:
				exercicio03();
				break;
			case 4:
				exercicio04();
				break;
			case 5:
				exercicio05();
				break;
			case 6:
				exercicio06();
				break;
			case 0:
				break;
				default:
					System.out.println("OPÇÃO INVALIDA!!");
			}
		}while(num != 0);
		System.out.println("programa finalizado");
	
	}
	public static void exercicio01()
	{
		Scanner in = new Scanner(System.in);
		int cont = 1;
		
		float expo, base; 
		int potencia = 1;
		
		base = in.nextInt();
		
		expo = in.nextFloat();
		
		for(cont = 1; cont<= expo; cont++)
		{
			
			potencia =(int) (potencia*base);
		}
		
		System.out.println("Valor de " + base + " elevado a " + expo + " = " + potencia);
		
	}
	public static void exercicio02() {
		Scanner in = new Scanner(System.in);
		
		float altura =0.0f, maiorAlt=0.0f;
		int alt = 0;
		
		for(int i = 1; i <=10; i++)
		{
			System.out.println("INFORME SUA ALTURA: ");
			altura = in.nextFloat();
			
			
			if(altura>1.70)
			{
				alt = alt+1;
				
				if(altura >= maiorAlt)
				{
					maiorAlt= altura;
				}
			}
			
			
		}
		System.out.println("Quantidade altura maior que 1.70: "+ alt);
		System.out.printf("Maior altura: %.2f\n ", maiorAlt);
		
		
	}
	public static void exercicio03() {
		Scanner in = new Scanner(System.in);
		int x, y, i, soma=0, aux=0;
		
		System.out.println("INFORME O VALOR DE X: ");
	    x = in.nextInt();
		System.out.println("INFORME O VALOR DE Y: ");
		y = in.nextInt();
		soma = x;
		
		for(i = x; i<=y; i+=2)
		{
			
			soma+=i;
			
		}
		System.out.println("SOMA DOS NUMEROS PARES ENTRE X E Y: "+ soma);
	}
	public static void exercicio04() {
		Scanner in = new Scanner(System.in);
		int i, fat, mult = 0, num=0;
		
		System.out.println("DIGITE O NUMERO QUE VOC^E QUER CALCULAR O FATORIAL: ");
		fat = in.nextInt();
		mult = fat;
		for(i = 0; i <fat; i++)
		{
			
			
			mult = mult *(fat-1);
			
			fat = fat -1;
		}
		System.out.println("VALOR DO FATORIAL DO NUMERO DIGITADO: "+mult);
	
	}
	public static void exercicio05() {
		Scanner in = new Scanner(System.in);
		float bruno = 2.800f, sergio = 3.400f;
		int mes =0;
		
		while(bruno <= sergio)
		{
			bruno += 0.300;
			sergio += 0.200;
			
			mes+=1;
		}
		System.out.println("MESES NECESSARIOS PARA BRUNO PASSAR SERGIO: "+ mes);
	}
	public static void exercicio06() {
		Scanner in = new Scanner(System.in);
		int intrevistado = 0, idade = 0, op, mil=0, cur=0, est=0, eS=0, somaID=0, masc=0, fem=0, sM=0, mn =0, sexo;
		String nomeMaior="";
		float media =0.0f;
		
		for(int i = 1; i<=300; i++)
		{
			
			do {
				System.out.println("INFORME SEU SHOPPING PREFERIDO: ");
				System.out.println("1) MULLER");
				System.out.println("2) CURITIBA");
				System.out.println("3) ESTAÇÃO");
				op = in.nextInt();
				switch(op)
				{
				case 1:
					mil++;
					if(mil > mn) {
						mn = mil;
						nomeMaior = "MILLER";
					}
					break;
				case 2:
					cur++;
					if(cur > mn) {
						mn = cur;
						nomeMaior = "CURITIBA";
					}
					break;
				case 3:
					est++;
					if(est > mn) {
						mn = est;
						nomeMaior = "ESTAÇÃO";
					}
					break;
					
				}
			}while(op > 3);
				System.out.println("INFORME SUA IDADE:\n");
				idade = in.nextInt();
				System.out.println("APERTE ENTER PARA CONTINUAR:");
				in.nextLine();
				System.out.println("INFORME SEU SEXO:");
				System.out.println("1) FEMININO");
				System.out.println("2) masculino");
				sexo = in.nextInt();
				System.out.println("INFORME SEU ESTADO CIVIL:");
				System.out.println("1)SOLTEIRO");
				System.out.println("2)CASADO");
				System.out.println("3) VIÚVO");
				System.out.println("4) DIVORCIADO");
				eS = in.nextInt();
				
				
				somaID+=idade;
				
				
				if(sexo == 2 && op == 3 && eS == 1)
				{
					masc+=1;
				}
				
				
				if(sexo == 1 && idade >= 20 && idade <= 30 && op ==2)
				{
					fem+=1;
				}
				
				
				
				
		}
			 
	
		
		media = somaID/300;
		System.out.println("SHOPPING MAIS VOTADO FOI: "+nomeMaior);
		System.out.printf("MEDIA IDADE DOS INTREVISTADOS: %.2f\n",media);
		System.out.println("ENTREVISTADOS QUE PREFERIRAM O SHOPPING MILLER: "+mil);
		System.out.println("SEXO MASCULINO QUE PREFEREM O ESTAÇÃO: "+masc);
		System.out.println("SEXO FEMININO COM IDADE ENTRE 20 E 30 ANOS QUE PREFEREM O SHOPPING CURITIBA: "+fem);
		
		
		
		
		
	}
	
}
