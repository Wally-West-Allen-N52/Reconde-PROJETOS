package br.com.rvrentagency.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rvrentagency.model.BuyRV;
import br.com.rvrentagency.model.ContactUs;
import br.com.rvrentagency.model.PlanTrip;
import br.com.rvrentagency.model.RentRV;
import br.com.rvrentagency.repository.BuyRVRepository;
import br.com.rvrentagency.repository.ContactUsRepository;
import br.com.rvrentagency.repository.PlanTripRepository;
import br.com.rvrentagency.repository.RentRVRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/PlanTrip")
public class PlanTripController {

	@Autowired
	private PlanTripRepository planTripRepository;

	@Autowired
	private RentRVRepository rentRVRepository;

	@Autowired
	private BuyRVRepository buyRVRepository;

	@Autowired
	private ContactUsRepository contactUsRepository;

	@GetMapping
	public ResponseEntity<List<PlanTrip>> findAll() {
		List<PlanTrip> planTrips = planTripRepository.findAll();
		return ResponseEntity.ok().body(planTrips);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<PlanTrip> findById(@PathVariable Integer Plan_tripID) {
		PlanTrip planTrip = planTripRepository.findById(Plan_tripID).get();
		return ResponseEntity.ok().body(planTrip);
	}

	// CREATE
	@PostMapping
	public PlanTrip createEmployee(@RequestBody PlanTrip planTrip) {
		return planTripRepository.save(planTrip);
	}

	// UPDATE

	@PutMapping("{id}")
	public ResponseEntity<PlanTrip> update(@PathVariable Integer id, @RequestBody PlanTrip PlanTripDetails) {
		PlanTrip updatePlanTrip = planTripRepository.findById(id).get();
		RentRV rentRV = rentRVRepository.findById(PlanTripDetails.getRentRV().getRentRVID()).get();
		BuyRV buyRV = buyRVRepository.findById(PlanTripDetails.getBuyRV().getBuyRVID()).get();
		ContactUs contactUs = contactUsRepository.findById(PlanTripDetails.getContactUs().getContactID()).get();

	    	updatePlanTrip.setArriving_at(PlanTripDetails.getBeginning_from());
	    	updatePlanTrip.setArriving_at(PlanTripDetails.getArriving_at());
	    	updatePlanTrip.setRentRV(rentRV);
	    	updatePlanTrip.setBuyRV(buyRV);;
	    	updatePlanTrip.setContactUs(contactUs);;
//
	    	planTripRepository.save(updatePlanTrip);

		return ResponseEntity.ok(updatePlanTrip);
	}
	
	// DELETE
	@DeleteMapping("{id}")
	public ResponseEntity<HttpStatus> delete(@PathVariable Integer Plan_tripID) {

		PlanTrip planTrip = planTripRepository.findById(Plan_tripID).get();

		planTripRepository.delete(planTrip);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }
}
