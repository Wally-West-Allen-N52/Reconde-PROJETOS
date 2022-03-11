package Menu;

public class MetodoViagem {

	public static void main(String[] args) {
		
		CadastroCliente cliente1 = new CadastroCliente();
			cliente1.setNome("Hector Bonilla");
			
		CadastroCliente telefone1 = new CadastroCliente();
			telefone1.setTelefone("(+52 55 5568 4777");
			
		CadastroCliente email1 = new CadastroCliente();
			email1.setEmail("hectortbs@mexina.com");
			
		Partida partidaEstado1 = new Partida();
			partidaEstado1.setEstadoPartida("SP");
		
		Partida partidaCidade1 = new Partida();
			partidaCidade1.setCidadePartida("São Paulo");
		
		Destino destinoEstado1 = new Destino();
			destinoEstado1.setEstadoDestino("AM");
			
		Destino destinoCidade1 = new Destino();
			destinoCidade1.setCidadeDestino("Amazonas");	
		
		Transporte transporte1 = new Transporte(); //  OBJETO CRIADO
			transporte1.setAviao("Companhia Aéra = GOL");
			
		CadastroCliente cliente2 = new CadastroCliente();
				cliente2.setNome("Ericco Guttieres");	
				
		CadastroCliente telefone2 = new CadastroCliente();
				telefone2.setTelefone("+52 75 8968 8742");
				
		CadastroCliente email2 = new CadastroCliente();
			email2.setEmail("riccogutigut@ig.com");

			Partida partidaEstado2 = new Partida();
				partidaEstado2.setEstadoPartida("PR");
				
			Partida partidaCidade2 = new Partida();
				partidaCidade2.setCidadePartida("Curitiba");
			
			Destino destinoEstado2 = new Destino();
				destinoEstado2.setEstadoDestino("RS");
				
			Destino destinoCidade2 = new Destino();
				destinoCidade2.setCidadeDestino("Porto Alegre");
				
			Transporte trasporte2 = new  Transporte();
				trasporte2.setCarro("RentallCars - Locadora");
			
				System.out.println("Cliente 01: \n");
				System.out.println(cliente1.getNome());
				// ESTADO E CIDADE CHAMADOS JUNTOS
				System.out.println(partidaCidade1.getCidadePartida() + "-"+ partidaEstado1.getEstadoPartida() + " -> Para " + destinoCidade1.getCidadeDestino() + "-" + destinoEstado1.getEstadoDestino());
				System.out.println(transporte1.getAviao());

				System.out.println("Contatos: ");
				System.out.println(telefone1.getTelefone());
				System.out.println(email1.getEmail());
				
				System.out.println();
				System.out.println("Cliente 02: ");
				System.out.println(cliente2.getNome());
				// ESTADO E CIDADE CHAMADOS JUNTOS
				System.out.println(partidaCidade2.getCidadePartida() + "-"+ partidaEstado2.getEstadoPartida() + " -> Para " + destinoCidade2.getCidadeDestino() + "-" + destinoEstado2.getEstadoDestino());
				
				System.out.println("Contatos: ");
				System.out.println(telefone2.getTelefone());
				System.out.println(email2.getEmail());
				
	}

}
