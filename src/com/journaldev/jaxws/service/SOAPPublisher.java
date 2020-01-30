package com.journaldev.jaxws.service;

import javax.xml.ws.Endpoint;

public class SOAPPublisher {
// url tuto https://www.journaldev.com/9123/jax-ws-tutorial
	public static void main(String[] args) {
		 Endpoint.publish("http://localhost:7777/ws/person", new PersonServiceImpl());  
	}

}