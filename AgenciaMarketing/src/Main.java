
public class Main {

	public static void main(String[] args) {
		ServicoDiagramacao cliente1 = new ServicoDiagramacao();
		
		cliente1.setCodigo(3456);
		cliente1.setNomeCliente("Jubisréia");
		cliente1.setServico("Diagramação de E-book");
		cliente1.setTema("Adoção de Animais");
		cliente1.setNumeroPaginas(130);
		cliente1.setImagens(true);
		cliente1.setTamanho("Folha A4");
		
		System.out.println("Código do cliente: " + cliente1.getCodigo());
		System.out.println("Nome da Cliente: " + cliente1.getNomeCliente());
		System.out.println("Serviço solicitado: " + cliente1.getServico());
		System.out.println("Tema do E-book: " + cliente1.getTema());
		System.out.println("Número de páginas: " + cliente1.getNumeroPaginas());
		System.out.println("Possui imagens: " + cliente1.isImagens());
		System.out.println("Tamanho para impressão: " + cliente1.getTamanho());
		
		

	}

}
