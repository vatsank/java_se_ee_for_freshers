package com.training;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface BookService {

	@WebMethod
	public String[] findBestBooks(@WebParam(name="srchTopic") String topic);
	
}
