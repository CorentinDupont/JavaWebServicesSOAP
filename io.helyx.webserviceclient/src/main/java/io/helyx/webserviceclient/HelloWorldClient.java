package io.helyx.webserviceclient;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import io.helyx.webservices.IHelloWorld;

public class HelloWorldClient {
	
	public static void main(String[] args) {
		try {
			URL url = new URL("http://localhost:9998/ws/hello");
			QName qname = new QName("http://webservices.helyx.io/", "HelloWorldService");
			Service service = Service.create(url, qname);
			IHelloWorld helloWorld = service.getPort(IHelloWorld.class);
			System.out.println(helloWorld.getHelloWorldAsString("Corentin"));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
