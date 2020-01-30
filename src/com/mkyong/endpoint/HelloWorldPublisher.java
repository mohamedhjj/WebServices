package com.mkyong.endpoint;
 
import javax.xml.ws.Endpoint;
import com.mkyong.ws.HelloWorldImpl;
 
//Endpoint publisher
public class HelloWorldPublisher{
 
	public static void main(String[] args) {
		//tuto url https://www.mkyong.com/webservices/jax-ws/jax-ws-hello-world-example/
	   Endpoint.publish("http://localhost:9999/ws/hello", new HelloWorldImpl());
    }
 
}