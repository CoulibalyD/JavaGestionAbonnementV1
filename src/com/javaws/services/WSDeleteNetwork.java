package com.javaws.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.javaws.entities.Service;



@WebService(targetNamespace="http://DeleteDataSubcriber.tns")
public class WSDeleteNetwork {
	
	@SuppressWarnings("unused")
	private Service service;
	public WSDeleteNetwork() {		
		service = new Service ();
	}
	@WebMethod
	public void deleteClientGPRS(@WebParam String numero)
	{
		service.deleteClientGprs(numero);
	}
}