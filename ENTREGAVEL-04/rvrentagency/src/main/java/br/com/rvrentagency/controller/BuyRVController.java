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

import br.com.rvrentagency.model.BuyRV;
import br.com.rvrentagency.repository.BuyRVRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/buyRVs")
public class BuyRVController {

	@Autowired
	private BuyRVRepository buyRVRepository;
	
	// GET
	@GetMapping
	public ResponseEntity<List<BuyRV>> findAll() {
		List<BuyRV> buyRVs = buyRVRepository.findAll();
		return ResponseEntity.ok(buyRVs);
	}
	
	//GET por ID
	@GetMapping(value = "/{id}")
	public ResponseEntity<BuyRV> findById(@PathVariable Integer BuyRVID) {
		BuyRV buyRV = buyRVRepository.findById(BuyRVID).get();
		return ResponseEntity.ok(buyRV);
	}
	
	// CREATE
	public BuyRV create(@RequestBody BuyRV buyRV) {
		return buyRVRepository.save(buyRV);
	}
	
	 // UPDATE
    @PutMapping("{id}")
    public ResponseEntity<BuyRV> update(@PathVariable Integer BuyRVID,@RequestBody BuyRV buyRVDetails) {
    	
    	BuyRV updateBuyRV = buyRVRepository.findById(BuyRVID).get();
    	
    	updateBuyRV.setFindRV(buyRVDetails.getFindRV());
    	updateBuyRV.setPrice(buyRVDetails.getPrice());
    	
    	buyRVRepository.save(updateBuyRV);

        return ResponseEntity.ok(updateBuyRV);
    }
	
	// DELETE
	@DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable Integer BuyRVID) {

		BuyRV buyRV = buyRVRepository.findById(BuyRVID).get();

		buyRVRepository.delete(buyRV);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }
}
