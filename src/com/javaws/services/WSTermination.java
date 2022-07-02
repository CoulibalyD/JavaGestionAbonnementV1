package com.javaws.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.javaws.entities.Service;



@WebService(targetNamespace="http://deleteInSubcriber.tns")
public class WSTermination {
	
	@SuppressWarnings("unused")
	private Service service;
	public WSTermination() {		
		service = new Service ();
	}
	@WebMethod
	public void deleteClientIN(@WebParam String numero)
	{
		service.deleteClientIn(numero);
	}
}