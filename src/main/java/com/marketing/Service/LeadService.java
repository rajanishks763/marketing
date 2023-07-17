package com.marketing.Service;

import com.marketing.entities.Lead;
import com.marketing.payload.PostResponse;

public interface LeadService {

	Lead createOneLead(Lead lead);

	PostResponse getAllLeads(int pageNo, int pageSize);

}
