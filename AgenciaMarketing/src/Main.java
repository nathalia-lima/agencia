
public class Main {

	public static void main(String[] args) {
		ServicoDiagramacao cliente1 = new ServicoDiagramacao();
		
		cliente1.setCodigo(3456);
		cliente1.setNomeCliente("Jubisr�ia");
		cliente1.setServico("Diagrama��o de E-book");
		cliente1.setTema("Ado��o de Animais");
		cliente1.setNumeroPaginas(130);
		cliente1.setImagens(true);
		cliente1.setTamanho("Folha A4");
		
		System.out.println("C�digo do cliente: " + cliente1.getCodigo());
		System.out.println("Nome da Cliente: " + cliente1.getNomeCliente());
		System.out.println("Servi�o solicitado: " + cliente1.getServico());
		System.out.println("Tema do E-book: " + cliente1.getTema());
		System.out.println("N�mero de p�ginas: " + cliente1.getNumeroPaginas());
		System.out.println("Possui imagens: " + cliente1.isImagens());
		System.out.println("Tamanho para impress�o: " + cliente1.getTamanho());
		
		

	}

}
