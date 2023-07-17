package com.marketing.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marketing.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact,Long> {

}
