package com.marketing.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.marketing.Repository.LeadRepository;
import com.marketing.entities.Lead;
import com.marketing.payload.PostResponse;

@Service
public class LeadServiceImpl implements LeadService{

	@Autowired
	private LeadRepository leadRepo;
	@Override
	public Lead createOneLead(Lead lead) {
		Lead save = leadRepo.save(lead);
		return save;
	}
	@Override
	public PostResponse getAllLeads(int pageNo,int pageSize) {
		
		Pageable pageable=PageRequest.of(pageNo, pageSize);
		Page<Lead> lead = leadRepo.findAll(pageable);
		List<Lead> content = lead.getContent();
		
		PostResponse postResponse=new PostResponse();
		postResponse.setContent(content);
		postResponse.setPageNo(lead.getNumber());
		postResponse.setPageSize(lead.getSize());
		postResponse.setTotalElements(lead.getTotalElements());
		postResponse.setTotalPages(lead.getTotalPages());
		postResponse.setLast(lead.isLast());
		//List<Object> collect = content.stream().map(leads->mapToPostDto(leads)).collect(Collectors.toList());
		//List<Lead> findAll = leadRepo.findAll();
		return postResponse;
	}
}
