"pug" 
import java.util.Scanner;
import java.util.Locale;

public class Principal {

	public static void main(String[] args) {
		
		
	}// fim main
	
	public static void exemplo01(){
		Scanner in = new Scanner(System.in);
		in.useLocale(Locale.ENGLISH);
		
		System.out.println("--=CONVERSOR DE TEMPERATURA=--"+"\n\n\n");
		double C, F;
		int num;
		
		System.out.println("ESCOLHA QUAL CONVERSÃO IRÁ QUERER FAZER: ");
		System.out.println("1 - DE CELSIUS PARA FAHRENHEIT");
		System.out.println("2 - DE FAHRENHEIT PARA CELSIUS");
		
		num = in.nextInt();
		
		
		if(num == 1)
		{
			
			System.out.println("INFORME A QUANTIDADE DE GRAUS EM CELSIUS QUE DESEJA CONVERTER: ");
			C = in.nextDouble();
			
			F = (C*1.8)+32;
			
			System.out.printf("O  VALOR EM FAHRENHEIT É: %.1f\n", F, "F" );
			
			
		}else
		{
			
		}if(num==2)
		{
			System.out.println("INFORME A QUANTIDADE DE GRAUS EM FAHRENHEIT QUE DESEJA CONVERTER: ");
			F = in.nextDouble();
			
			C = ((F-32)/1.8);
			System.out.printf("O  VALOR EM CELSIUS É: %.1f\n", C);
		}else
		{
			System.out.println("FIM DO PROGRAMA");
		}
		
	}//fim metodo exemplo01
	
	public static void exemplo02(){
		Scanner in = new Scanner(System.in);
		in.useLocale(Locale.ENGLISH);
		
		System.out.println("--=MENU CATEGORIA NADADOR=--");
		int num;
		
		System.out.println("INFORME A SUA IDADE: ");
		num = in.nextInt();
		
		
		if(num>= 5 && num<=7)
		{
			System.out.println("VOCÊ FAZ PARTE DA CATEGORIA (INFANTIL) ");
			
		}else if(num>=8 && num<=10)
		{
			System.out.println("VOCÊ FAZ PARTE DA CATEGORIA (JUVENIL) ");
		}else if(num>=11 && num<=15)
		{
			System.out.println("VOCÊ FAZ PARTE DA CATEGORIA (ADOLESCENTE) ");
		}else if(num>=16 && num<=30)
		{
			System.out.println("VOCÊ FAZ PARTE DA CATEGORIA (JOVEM) ");
		}else if(num>30)
		{
			System.out.println("VOCÊ FAZ PARTE DA CATEGORIA (ADULTO) ");
		}else if(num<5)
		{
			System.out.println(" IDADE FORA DAS CATEGORIAS ");
		}else
		{
			System.out.println(" -=BOA SORTE=- ");
		}
			
		
		
		
	}//FIM METODO EXEMPLO02
	
	public static void exemplo03(){
		Scanner in = new Scanner(System.in);
		in.useLocale(Locale.ENGLISH);
		
		System.out.println("-=CALCULO SALARIO + BONIFICAÇÃO E AUXILIO ESCOLA=-\n");
		System.out.println("INFORME O SEU SALARIO: \n");
		double sal, bon, salf, IB;
		sal = in.nextDouble();
		
		if(sal<500.00)
		{
			bon = ((sal/100)*5+150);
			salf = (bon+sal);
			IB = ((sal/100)*5);
			System.out.printf("SARALARIO FINAL :%.2f\n", salf);
			System.out.printf("BONIFICAÇÃO = %.2f\n", IB);
			System.out.println("AUXILIO ESCOLA = 150,00");
		}else if(sal>=500.00 && sal<=600.00)
		{
			bon = ((sal/100)*12+150);
			salf = (bon+sal);
			IB = ((sal/100)*12);
			System.out.printf("SALARIO FINAL: %.2f\n", salf);
			System.out.printf("BONIFICAÇÃO = %.2f\n", IB);
			System.out.println("AUXILIO ESCOLA = 150,00");
					
		}else if(sal>600.00 && sal<=1200.00)
		{
			bon = ((sal/100)*12+100);
			salf = (bon+sal);
			IB = ((sal/100)*12);
			System.out.printf("SALARIO FINAL: %.2f\n", salf);
			System.out.printf("BONIFICAÇÃO = %.2f\n", IB);
			System.out.println("AUXILIO ESCOLA = 100,00");
		}else if(sal>1200.00)
		{
			System.out.println("FUNCIONARIO SEM BONIFICAÇÃO");
		}else{
			System.out.println("FIM DO PROGRAMA");
		}
		
	}//fim metodo exemplo03
	

}// fim classe
