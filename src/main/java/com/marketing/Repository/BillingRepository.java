package com.marketing.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marketing.entities.Billing;

public interface BillingRepository extends JpaRepository<Billing,Long> {

}
