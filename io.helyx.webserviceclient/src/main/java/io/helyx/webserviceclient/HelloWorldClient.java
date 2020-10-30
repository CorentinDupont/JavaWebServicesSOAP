package io.helyx.webserviceclient;

import io.helyx.webserviceserver.models.Author;
import io.helyx.webserviceserver.services.IAuthorService;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class HelloWorldClient {
	
	public static void main(String[] args) {
		try {
			URL url = new URL("http://localhost:9998/ws/author");
			QName qname = new QName("http://services.webserviceserver.helyx.io/", "AuthorServiceService");
			Service service = Service.create(url, qname);
			IAuthorService authorService = service.getPort(IAuthorService.class);
			System.out.println(authorService.create(new Author("Corentin", "Dupont")));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
