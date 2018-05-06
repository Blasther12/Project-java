import java.util.Scanner;
import java.text.DecimalFormat;
import javax.swing.SingleSelectionModel;
import java.util.Locale;
public class Principal {

	public static void main(String[] args) {
		
				
			}
			
			public static void exe01(){
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
				
			}
			
			public static void exe02(){
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
					
				
				
				
			}
			
			public static void exe03(){
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
					sal = sal+100;
					System.out.printf("SALARIO FINAL: %.2f\n", sal);
				}else{
					System.out.println("FIM DO PROGRAMA");
				}
				
			}
			
			public static void exe06() {
				Scanner in = new Scanner(System.in);
				in.useLocale(Locale.ENGLISH);
				
				
				System.out.println("CLASSIFICAÇÃO PESO E ALTURA");
				float pes, alt;
				System.out.println("DIGITE SEU PESO");
				pes = in.nextFloat();
				System.out.println("DIGITE SUA ALTURA");
				alt = in.nextFloat();
				
				if(pes<= 60.00 && alt <1.20) {
					
					System.out.println("VOCÊ ESTA DENTRO DA CLASSIFICAÇÃO: (A)");
				}else if(pes<= 60.00 && alt >= 1.20 && pes <=60.00 && alt < 1.70) {
					
					System.out.println("VOCÊ ESTA DENTRO DA CLASSIFICAÇÃO: (B)");
					
				}else if(pes<= 60.00 && alt > 1.70) {
					
					System.out.println("VOCÊ ESTA DENTRO DA CLASSIFICAÇÃO: (C)");
					
				}else if(pes >  60.00 && pes <= 90.00 && alt <1.20) {
					
					System.out.println("VOCÊ ESTA DENTRO DA CLASSIFICAÇÃO: (D)");
					
				}else if(pes >  60.00 && pes <= 90.00 &&  alt >= 1.20 && alt < 1.70 ) {
					
					System.out.println("VOCÊ ESTA DENTRO DA CLASSIFICAÇÃO: (E)");
					
				}else if(pes<= 60.00 && pes <= 90.00 && alt >1.70) {
					
					System.out.println("VOCÊ ESTA DENTRO DA CLASSIFICAÇÃO: (F)");
					
				}else if(pes >  90.00 && alt <1.20) {
					
					System.out.println("VOCÊ ESTA DENTRO DA CLASSIFICAÇÃO: (G)");
					
				}else if(pes > 90.00 && alt > 1.20 && alt < 1.70) {
					
					System.out.println("VOCÊ ESTA DENTRO DA CLASSIFICAÇÃO: (H)");
					
				}else if(pes >  90.00 && alt > 1.70) {
					
					System.out.println("VOCÊ ESTA DENTRO DA CLASSIFICAÇÃO: (I)");
					
				}else {
					
				}
					
				
					
				
				
				
				
				
				
				
			}
		
			public static void exe07() {
				
				Scanner in = new Scanner(System.in);
				in.useLocale(Locale.ENGLISH);
				
				double fat, val, valf, fat2;
				int num;
				System.out.println("Digite o valor total da sua fatura: ");
				val = in.nextDouble();
				System.out.println("Escolha a porcentagem que pretende pagar no primeiro mes: ");
				System.out.println("10% - Digite (1)");
				System.out.println("30% - Digite (2)");
				System.out.println("50% - Digite (3)");
				
				num = 0;
			
				
				num = in.nextInt();
				
				switch(num)
				{
				case 1:
					fat = val*0.10;
					fat2 = fat + (fat*0.05);
					
					System.out.printf("VALOR DA PRIMEIRA FATURA: %2.f\n", fat);
					System.out.printf("VALOR DA SEGUNDA FATURA: %2.f\n", fat2 );
					
					
				case 2:
					fat = val*0.20;
					fat2 = fat + (fat*0.05);
					System.out.printf("VALOR DA PRIMEIRA FATURA: %2.f\n", fat);
					System.out.printf("VALOR DA SEGUNDA FATURA: %2.f\n", fat2);
					
					
				case 3:
					fat = val*0.50;
					fat2 = fat + (fat*0.03);
					System.out.printf("VALOR DA PRRMEIRA FATURA: %2.f\n", fat);
					System.out.printf("VALOR DA SEGUNDA FATURA: %2.f\n", fat2);
					
				default:
					System.out.println("OPÇÃO INCORRETA");
					
				}
				
				
			}	
			   

}// fim classe

