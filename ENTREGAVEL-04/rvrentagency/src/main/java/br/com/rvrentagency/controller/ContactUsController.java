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

import br.com.rvrentagency.model.ContactUs;
import br.com.rvrentagency.repository.ContactUsRepository;


	@CrossOrigin(origins = "*")
	@RestController
	@RequestMapping(value = "/contactUss")
	public class ContactUsController {

		@Autowired
		private ContactUsRepository contactUsRepository;
		
		// GET
		@GetMapping
		public ResponseEntity<List<ContactUs>> findAll() {
			List<ContactUs> contactUss = contactUsRepository.findAll();
			return ResponseEntity.ok(contactUss);
		}
		
		//GET por ID
		@GetMapping(value = "/{id}")
		public ResponseEntity<ContactUs> findById(@PathVariable Integer ContactID) {
			ContactUs contactUs = contactUsRepository.findById(ContactID).get();
			return ResponseEntity.ok(contactUs);
		}
		
		// CREATE
		public ContactUs create(@RequestBody ContactUs contactUs) {
			return contactUsRepository.save(contactUs);
		}
		
		 // UPDATE
	    @PutMapping("{id}")
	    public ResponseEntity<ContactUs> update(@PathVariable Integer ContactID,@RequestBody ContactUs contactUsDetails) {
	    	ContactUs updateContactUs = contactUsRepository.findById(ContactID).get();
	    	updateContactUs.setEmail(contactUsDetails.getEmail());
	    	updateContactUs.setPhone(contactUsDetails.getPhone());
	    	updateContactUs.setNewMessage(contactUsDetails.getNewMessage());
	    	
	    	contactUsRepository.save(updateContactUs);

	        return ResponseEntity.ok(updateContactUs);
	    }
		
		// DELETE
		@DeleteMapping("{id}")
	    public ResponseEntity<HttpStatus> delete(@PathVariable Integer ContactID) {

			ContactUs contactUs = contactUsRepository.findById(ContactID).get();

		contactUsRepository.delete(contactUs);

	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

	    }
}
