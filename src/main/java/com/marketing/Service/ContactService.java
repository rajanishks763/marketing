package com.marketing.Service;

import java.util.List;

import com.marketing.entities.Contact;
import com.marketing.entities.Lead;

public interface ContactService {

	Contact createOneContact(Contact contact);

	List<Contact> getAllContact();

	Contact convertOneLeaad(Lead lead);

}
