package imp;

import java.util.Scanner;

public class Usuario {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
        
		 Produtos produto = new Produtos();
		 Servico servico = new Servico();
		
		 System.out.print("Digite o valor do produto: ");
	        produto.setValor(scanner.nextFloat());
	        
	        System.out.print("Digite o valor do frete: ");
	        produto.setFrete(scanner.nextFloat());
	        
	        System.out.print("Digite o valor do seguro: ");
	        produto.setSeguro(scanner.nextFloat());
	        
	        System.out.print("Digite a margem de lucro: ");
	        produto.setMargem(scanner.nextFloat());

	        System.out.print("Digite o valor do serviço: ");
	        servico.setValor(scanner.nextFloat());
	        
	        System.out.print("Digite o valor da aliquota: ");
	        servico.setAliquota(scanner.nextFloat());
	        
	        System.out.println("Valor do produto: " + produto.getValor());
	        System.out.println("Frete: " + produto.getFrete());
	        System.out.println("Seguro: " + produto.getSeguro());
	        System.out.println("Margem de Lucro: " + produto.getMargem());
	        System.out.println("Valor do serviço: " + servico.getValor());
	        System.out.println("Valor da aliquota: " + servico.getAliquota());
	        System.out.println("Preço Final(com IPI e ICMS): " + produto.calcularPrecoFinal());
	        System.out.println("Valor do ISS sobre o serviço: " + servico.calcularISS());

	        float totalFinal = produto.calcularPrecoFinal() + servico.calcularISS();
	        System.out.println("\nTotal Final (Produto + Serviço com ISS): " + totalFinal);
	        // Fechar o Scanner
	        scanner.close();
	}

}
