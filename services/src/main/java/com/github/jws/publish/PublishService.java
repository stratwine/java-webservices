package com.github.jws.publish;

import javax.xml.ws.Endpoint;

import com.github.jws.services.CircleFunctions;

public class PublishService {

 public static void main(String[] args) {
	 System.out.println("Starting WS");
	  Endpoint.publish("http://localhost:8096/ws", new CircleFunctions());
	  System.out.println("Started WS");
	  
}
}
