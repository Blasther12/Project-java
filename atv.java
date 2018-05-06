"prog" 
import java.util.Scanner;
import java.util.Locale;
public class Principal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		in.useLocale(Locale.ENGLISH);
		String cliente = "", produto = "";
		int quant = 0, num = 0, num2 = 0, num3 = 0;
		float vP= 0.0f, soma = 0.0f, total = 0.0f, totalF = 0.0f, soma1 = 0.0f;
		
		
	do {
		System.out.println("APERTE ->ENTER<- PARA INICIAR O PROGRAMA:");
		in.nextLine();
		System.out.println("INFORME NOME DO CLIENTE:\n");
		cliente = in.nextLine();
		System.out.println("DIGITE ->ENTER<- PARA CONTINUAR");
		do {
			
			in.nextLine();
			System.out.println("INFORME O NOME DO PRODUTO:\n");
			produto = in.nextLine();
			System.out.println("IMFORME A QUANTIDADE DE PRODUTO:\n");
			quant = in.nextInt();
			System.out.println("INFORME O VALOR DO PRODUTO:\n");
			vP = in.nextFloat();
			
			
			soma = quant * vP;
			total += soma;
			
			System.out.println("DESEJA REALIZAR A LEITURA DE NOVOS PEDIDOS? \n");
			System.out.println("1) SIM");
			System.out.println("2) NÃO");
			num = in.nextInt();

			
			switch(num)
			{
			case 1:
				
			case 2:
				default:
				
			}
			
			
		}while(num != 2);
		
		System.out.printf("Valor total: %.2f\n", total);
		
		
		do {
			System.out.println("\n\n");
			System.out.println("INFORME SUA FORMA DE PAGAMENTO: ");
			System.out.println("1) A VISTA NO DINHEIRO");
			System.out.println("2) A VISTA NO DÉBITO ");
			System.out.println("3) PARCELADO EM 2X NO CARTÃO");
			System.out.println("4) PARCELADO EM 3X NO CARTÃO");
			System.out.println("5) PARCELADO EM 4X NO CARTÃO");
            System.out.println("6) PARCELADO EM 5X NO CARTÃO.");
			num2 = in.nextInt();
			
			if(num2 == 1)
			{
				soma1 = total*0.05f;
				totalF = total - soma1;
				System.out.printf("VALOR TOTAL: R$ %.2f\n", totalF);
			}
			if(num2 == 2)
			{
				totalF = total;
				System.out.printf("VALOR TOTAL: R$ %.2f\n", totalF);
			}
			if(num2==3)
			{
				totalF = total + (total*0.02f);
				System.out.printf("VALOR PARCELADO: 2X R$ %.2f\n", totalF/2);
			}
			if(num2==4)
			{
				totalF = total + (total*0.02f);
				System.out.printf("VALOR PARCELADO: 3X R$ %.2f\n", totalF/3);
			}
			if(num2 == 5)
			{	
				totalF = total + (total*0.05f);
				System.out.printf("VALOR PARCELADO: 4X R$ %.2f\n", totalF/4);
			}
			if(num2 == 6)
			{
				totalF = total + (total*0.05f);
				System.out.printf("VALOR PARCELADO: 5X R$ %.2f\n", totalF/5);

			}

			
		}while(num2 > 6);
		System.out.println("\n\n");
		System.out.println("DESEJA REALIZAR UMA NOVA VENDA?");
		System.out.println("1) sim");
		System.out.println("2) não");
		num3 = in.nextInt();
		
		switch(num3)
		{
		case 1:
		break;
		case 2:
			System.out.println("FIM DO PROGRAMA");
			break;
			default:
		}
	}while(num3 != 2);
	
	
	}

}
