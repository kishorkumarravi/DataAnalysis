package com.zuora.dataAnalysis;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.zuora.dataAnalysis.resource.DataAnalysisResource;


@Component
public class JerseyConfig extends ResourceConfig {
	    public JerseyConfig()
	    {
	        register(DataAnalysisResource.class);
	    }

}
