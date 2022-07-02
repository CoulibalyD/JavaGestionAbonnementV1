package com.javaws.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.javaws.entities.Service;



@WebService(targetNamespace="http://authentification.tns")
public class WSAuthentification {
	
	@SuppressWarnings("unused")
	private Service service;
	public WSAuthentification() {		
		service = new Service ();
	}
	
	@WebMethod
	public boolean validate (@WebParam(name="login") String login, 
			@WebParam(name="password") String password) {		
		boolean statut = false;
		
		try {
			statut = service.authentifierUser(login, password);
			
		} catch (Exception e) {
			System.err.println("Error : " + e.getMessage());
		}
		
		return statut;
	}
}