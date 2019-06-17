package com.zuora.dataAnalysis.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.zuora.dataAnalysis.service.DataAnalysisService;

@Path("/users")
public class DataAnalysisResource {
	
	Logger LOGGER = LoggerFactory.getLogger(DataAnalysisResource.class);
	
	@Autowired
	DataAnalysisService dataAnalysisService;
	
	@GET
	@Produces("application/json")
	@Consumes("application/json")
    public String sayHello() {
		LOGGER.debug("Came to controller...");
		return dataAnalysisService.returnHello();
    }

}
