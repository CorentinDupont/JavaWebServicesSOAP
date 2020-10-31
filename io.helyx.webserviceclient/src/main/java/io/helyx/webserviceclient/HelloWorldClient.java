package io.helyx.webserviceclient;

import io.helyx.webserviceserver.models.Author;
import io.helyx.webserviceserver.services.IAuthorService;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class HelloWorldClient {
	
	public static void main(String[] args) throws JAXBException, SQLException, MalformedURLException {

		JAXBContext context = JAXBContext.newInstance(Author.class);
		URL url = new URL("http://localhost:9998/ws/author");
		QName qname = new QName("http://services.webserviceserver.helyx.io/", "AuthorServiceService");
		Service service = Service.create(url, qname);
		IAuthorService authorService = service.getPort(IAuthorService.class);

		Author author = new Author("Corentin", "Dupond");
		System.out.println(authorService.create(author).getId());

		author.setLastName("Dupont");
		authorService.update(author.getId(), author);	

		Author[] authors = authorService.readAll();
		for( Author authorTemp : authors ) {
			System.out.println(authorTemp.getId() + ": " + authorTemp.getFirstName() + " " + author.getLastName());
		}
	}
}
