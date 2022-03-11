package br.com.rvrentagency.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.rvrentagency.repository.BuyRVRepository;
import br.com.rvrentagency.repository.ContactUsRepository;
import br.com.rvrentagency.repository.PlanTripRepository;
import br.com.rvrentagency.repository.RentRVRepository;

@SpringBootApplication
public class RvrentagencyApplication implements CommandLineRunner {

	@Autowired
	private PlanTripRepository planTripRepository;

	@Autowired
	private RentRVRepository rentRVRepository;

	@Autowired
	private BuyRVRepository buyRVRepository;

	@Autowired
	private ContactUsRepository contactUsRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(RvrentagencyApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		
		/*
		Autor a1 = new Autor(null, "George", "R.R. Martin");
		Autor a2 = new Autor(null, "Tom", "Clancy");
		
		Editora e1 = new Editora(null, "Suma");
		Editora e2 = new Editora(null, "Matrix");
		Editora e3 = new Editora(null, "Twister");
		
		Livro l1 = new Livro(null, "Raibow Six", (long) 654, 149.9, a2, e3);
		Livro l2 = new Livro(null, "A Guerra dos Tronos", (long) 321, 199.9, a1, e1);
		
		a1.getLivros().addAll(Arrays.asList(l2));
		a2.getLivros().addAll(Arrays.asList(l1));
		
		e1.getLivros().addAll(Arrays.asList(l2));
		e3.getLivros().addAll(Arrays.asList(l1));
		
		autorRepository.save(a1);
		autorRepository.save(a2);
		
		editoraRepository.save(e1);
		editoraRepository.save(e2);
		editoraRepository.save(e3);
		
		livroRepository.save(l1);
		livroRepository.save(l2);
		*/
		
	}
}
