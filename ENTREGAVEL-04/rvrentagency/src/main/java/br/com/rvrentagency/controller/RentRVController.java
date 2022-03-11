package br.com.rvrentagency.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rvrentagency.model.RentRV;
import br.com.rvrentagency.repository.RentRVRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/rentRVs")
public class RentRVController {

	@Autowired
	private RentRVRepository rentRVRepository;
	
	// GET
	@GetMapping
	public ResponseEntity<List<RentRV>> findAll() {
		List<RentRV> rentRVs = rentRVRepository.findAll();
		return ResponseEntity.ok().body(rentRVs);
	}
	
	//GET por ID
	@GetMapping(value = "/{id}")
	public ResponseEntity<RentRV> findById(@PathVariable Integer RentRVID) {
		RentRV rentRV = rentRVRepository.findById(RentRVID).get();
		return ResponseEntity.ok().body(rentRV);
	}
	
	// CREATE
	public RentRV create(@RequestBody RentRV rentRV) {
		return rentRVRepository.save(rentRV);
	}
	
	 // UPDATE
    @PutMapping("{id}")
    public ResponseEntity<RentRV> update(@PathVariable Integer RentRVID,@RequestBody RentRV rentRVDetails) {
    	RentRV updateRentRV = rentRVRepository.findById(RentRVID).get();
    	updateRentRV.setFindRV(rentRVDetails.getFindRV());
    	updateRentRV.setPrice(rentRVDetails.getPrice());
    	
    	rentRVRepository.save(updateRentRV);

        return ResponseEntity.ok(updateRentRV);
    }
	
	// DELETE
	@DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable Integer RentRVID) {

    	RentRV rentRV = rentRVRepository.findById(RentRVID).get();

    	rentRVRepository.delete(rentRV);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }
}
