package visao;

import java.util.Scanner;
import java.util.ArrayList;
import modelo.Venda;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static ArrayList<Venda> vendas = new ArrayList<>();
	static int menu = 0;

	public static void main(String[] args) {
		while (menu != 5) {
			System.out.println("\n1. Cadastrar vendas");
			System.out.println("2. Consultar vendas");
			System.out.println("3. Alterar venda");
			System.out.println("4. Excluir venda");
			System.out.println("5. Terminar o programa");
			menu = scan.nextInt();
			switch (menu) {
			case 1:
				System.out.println("Produto\tQuantidade\tPreco:");
				create();
				break;
			case 2:
				System.out.println("Produto\tQuantidade\tPreco\tsubTotal:");
				read();
				break;
			case 3:
				System.out.println("Digite qual item quer alterar:");
				update(scan.nextInt());
				break;
			case 4:
				System.out.println("Digite qual item quer excluir:");
				delete(scan.nextInt());
				break;
			case 5:
				System.out.println("Obrigado por utilizar nosso sistema. tchau. ");
				break;
			default:
				System.out.println("Opcao invalida.");
				break;
			}

		}

	}
	public static void create() {
		Venda v = new Venda();
		v.setProduto(scan.next());
		v.setQuantidade(scan.nextInt());
		v.setPreco(scan.nextFloat());
		vendas.add(v);
	}
	public static void read() {
		float total = 0;
		for(Venda v: vendas) {
			System.out.println(v.toString());
			total += v.subTotal();
		}
		System.out.printf("Total = %.2f\n",total);
	}
	public static void update(int update) {
		if(update >= 0 && update < vendas.size()) {
			System.out.println(vendas.get(update).toString());
			Venda v = new Venda();
			v.setProduto(scan.next());
			v.setQuantidade(scan.nextInt());
			v.setPreco(scan.nextFloat());
			vendas.set(update, v);
			System.out.println("Venda alterada.");
		}else
			System.out.println("Item inválido");
	}
	public static void delete(int update) {
		if(update >= 0 && update < vendas.size()) {
			vendas.remove(update);
			System.out.println("Venda excluida.");
		}else
			System.out.println("Item invalido.");
	}	
		
}
