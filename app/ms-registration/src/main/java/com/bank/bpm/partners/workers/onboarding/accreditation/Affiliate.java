package com.bank.bpm.partners.workers.onboarding.accreditation;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Affiliate {

	@JsonProperty("document_number")
	private String documentNumber;

	@JsonProperty("business_name")
	private String businessName;

}
