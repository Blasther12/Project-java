import java.util.Scanner;

public class Principal {
	 static String cadastro = "";
	 static float cpf = 0.0f;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String nomeCliente = "", nomeProduto = "";	
		int op = 0, op1 = 0, op2 = 0, op3 = 0, op4 = 0, quant = 0;
		float total = 0.0f, valorP = 0.0f, soma = 0.0f, tF = 0.0f;
		
		
		do {
		    do {	
		    	System.out.println("Deseseja realizar um cadastro antes de efuar a compra?");
				System.out.println("1) SIM");
				System.out.println("2) NÃO");
				op = in.nextInt();
				
				switch(op)
				{
				case 1:
					in.nextLine();
					System.out.println("Imforme seu nome: ");
					cadastro = in.nextLine();
					System.out.println("informe seu cpf:");
					cpf = in.nextFloat();
					System.out.println("\n");
					System.out.println("obrigado por se cadastrar\n");
					break;
				case 2:
					break;
					default:
					
				}
		    }while(op != 1 && op != 2);
			do {
				System.out.println("informe o tipo de venda que deseja realizar: ");
				System.out.println("1) eletronicos");
				System.out.println("2) vestuario");
				System.out.println("3) alimentos");
				op1 = in.nextInt();
				switch(op1)
				{
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
					default:
						System.out.println("Opção Invalida\n");
				}
			   }while(op1 > 3);
			{
		    	in.nextLine();
			    System.out.println("Infome seu nome: ");
			    nomeCliente = in.nextLine();
			}
			do {
				in.nextLine();
				System.out.println("Informe o nome do produto:\n");
				nomeProduto = in.nextLine();
				System.out.println("Quantidade de produto adquirido:\n");
				quant = in.nextInt();
				System.out.println("Valor unitario do produto:\n");
				valorP = in.nextFloat();
				
				
				soma = quant * valorP;
				total += soma;
				
				System.out.println("quer realizar uma nova leitura de pedidos? \n");
				System.out.println("1) SIM");
				System.out.println("2) NÃO");
				op2 = in.nextInt();

				
				switch(op2)
				{
				case 1:
					
				case 2:
					
				}
			   }while(op2 != 2);//fim declaraçao de produtos
			System.out.printf("valor total: %.2f\n", total);
		do {	
			
			System.out.println("\n\n");
			
			System.out.println("FORMA DE PAGAMENTO: ");
			System.out.println("1) A VISTA NO DINHEIRO");
			System.out.println("2) A VISTA NO DÉBITO ");
			System.out.println("3) 2X NO CARTÃO");
			System.out.println("4) 3X NO CARTÃO");
			System.out.println("5) 4X NO CARTÃO");
            System.out.println("6) 5X NO CARTÃO.");
			op3 = in.nextInt();
			
			if(nomeCliente.equals(cadastro))
			{
				switch(op3)
				{
				case 1:
					
					tF = total - (total*0.08f);
					System.out.printf("VALOR TOTAL: R$ %.2f\n", tF);
					break;
				case 2:
					tF = total - (total*0.03f);
					System.out.printf("VALOR TOTAL: R$ %.2f\n", tF);
					break;
				case 3:
					tF = total + (total*0.02f);
					System.out.printf("VALOR PARCELADO: 2X R$ %.2f\n", tF/2);
					break;
				case 4:
					tF = total + (total*0.02f);
					System.out.printf("VALOR PARCELADO: 3X R$ %.2f\n", tF/3);
					break;
				case 5:
					tF = total + (total*0.05f);
					System.out.printf("VALOR PARCELADO: 4X R$ %.2f\n", tF/4);
					break;
				case 6:
					tF = total + (total*0.05f);
					System.out.printf("VALOR PARCELADO: 5X R$ %.2f\n", tF/5);
					break;
					default:
				}
			}else {
				switch(op3)
				{
				case 1:
					
					tF = total - (total*0.05f);
					System.out.printf("VALOR TOTAL: R$ %.2f\n", tF);
					break;
				case 2:
					tF = total;
					System.out.printf("VALOR TOTAL: R$ %.2f\n", tF);
					break;
				case 3:
					tF = total + (total*0.02f);
					System.out.printf("VALOR PARCELADO: 2X R$ %.2f\n", tF/2);
					break;
				case 4:
					tF = total + (total*0.02f);
					System.out.printf("VALOR PARCELADO: 3X R$ %.2f\n", tF/3);
					break;
				case 5:
					tF = total + (total*0.05f);
					System.out.printf("VALOR PARCELADO: 4X R$ %.2f\n", tF/4);
					break;
				case 6:
					tF = total + (total*0.05f);
					System.out.printf("VALOR PARCELADO: 5X R$ %.2f\n", tF/5);
					break;
					default:
				}
				
			}
		}while(op3 > 6);
		System.out.println("\n\n");
		System.out.println("DESEJA REALIZAR UMA NOVA VENDA?");
		System.out.println("1) sim");
		System.out.println("2) não");
		op4 = in.nextInt();
		
		switch(op4)
		{
		case 1:
		break;
		case 2:
			System.out.println("FIM DO PROGRAMA");
			break;
			default:
		}
		}while(op4 != 2);//fim do programa
		
		
		

	}

}
