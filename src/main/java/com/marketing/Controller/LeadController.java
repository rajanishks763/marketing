package com.marketing.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.marketing.Service.LeadService;
import com.marketing.entities.Lead;
import com.marketing.payload.PostResponse;

@RestController
@RequestMapping("/api/lead")
public class LeadController {

	@Autowired
	private LeadService leadService;
	@PostMapping
	public ResponseEntity<Lead> createOneLead(@RequestBody Lead lead){
		Lead leadSave = leadService.createOneLead(lead);
		return new ResponseEntity<Lead>(leadSave,HttpStatus.CREATED);
	}
	@GetMapping
	public PostResponse getAllLeads(@RequestParam(value="pageNo",defaultValue="0",required=false) int pageNo,
								@RequestParam(value="pageSize",defaultValue="10",required=false) int pageSize){
		PostResponse postResponse = leadService.getAllLeads(pageNo,pageSize);
		return postResponse;
		
	}
}
