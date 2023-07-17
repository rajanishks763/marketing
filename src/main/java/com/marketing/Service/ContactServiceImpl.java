package com.marketing.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketing.Repository.ContactRepository;
import com.marketing.entities.Contact;
import com.marketing.entities.Lead;

@Service
public class ContactServiceImpl implements ContactService{
	
	@Autowired
	private ContactRepository contactRepo;

	@Override
	public Contact createOneContact(Contact contact) {
		Contact save = contactRepo.save(contact);
		return save;
	}
	@Override
	public List<Contact> getAllContact() {
		List<Contact> findAll = contactRepo.findAll();
		return findAll;
	}
	@Override
	public Contact convertOneLeaad(Lead lead) {
		Contact con = new Contact();
		
		con.setFirstName(lead.getFirstName());
		con.setLastName(lead.getLastName());
		con.setEmail(lead.getEmail());
		con.setMobile(lead.getMobile());
	
		Contact save = contactRepo.save(con);
		return save;
	}

}
