package com.marketing.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marketing.Service.ContactService;
import com.marketing.entities.Contact;
import com.marketing.entities.Lead;

@RestController
@RequestMapping("/api/contact")
public class ContactController {
	@Autowired
	private ContactService contactService;
	
	@PostMapping
	public ResponseEntity<Contact> createOneContact(@RequestBody Contact contact){
		Contact createOneContact = contactService.createOneContact(contact);
		return new ResponseEntity<Contact>(createOneContact,HttpStatus.CREATED);
	}
	@GetMapping
	public List<Contact> getAllContact(){
		List<Contact> allContact = contactService.getAllContact();
		return allContact;
	}
	@PostMapping("/convert")
	public Contact convertLeadToContact(@RequestBody Lead lead) {
		
		return contactService.convertOneLeaad(lead);
		
	}

}
