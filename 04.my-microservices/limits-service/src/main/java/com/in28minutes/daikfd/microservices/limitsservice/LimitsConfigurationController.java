package com.in28minutes.daikfd.microservices.limitsservice;

import com.in28minutes.daikfd.microservices.limitsservice.bean.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LimitsConfigurationController {

	@Autowired
	private Configuration configuration;

	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfigurations() {
		return new LimitConfiguration(configuration.getMaximum(),
				configuration.getMinimum());
	}
	
//	@GetMapping("/fault-tolerance-example")
//	@HystrixCommand(fallbackMethod="fallbackRetrieveConfiguration")
//	public LimitConfiguration retrieveConfiguration() {
//		throw new RuntimeException("Not available");
//	}
//
//	public LimitConfiguration fallbackRetrieveConfiguration() {
//		return new LimitConfiguration(999, 9);
//	}

}
