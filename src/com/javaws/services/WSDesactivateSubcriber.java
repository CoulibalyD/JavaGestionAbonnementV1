package com.javaws.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import com.javaws.entities.Service;



@WebService(targetNamespace="http://desactiveSubcriber.tns")
public class WSDesactivateSubcriber {
	private Service service;
	public WSDesactivateSubcriber() {		
		service = new Service ();
	}
	@WebMethod
	public void deleteClientHLR(@WebParam String numero)
	{
		service.deleteClientHlr(numero);
	}
}