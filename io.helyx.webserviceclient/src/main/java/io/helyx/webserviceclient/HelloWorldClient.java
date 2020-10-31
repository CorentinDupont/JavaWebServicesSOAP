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
		Author author2 = new Author("Dany", "Corbineau");
		Author author3 = new Author("Pierre", "Chene");
		author = authorService.create(author);
		author2 = authorService.create(author2);
		author3 = authorService.create(author3);

		author.setLastName("Dupont");
		authorService.update(author.getId(), author);

		authorService.delete(author3.getId());

		Author[] authors = authorService.readAll();
		for( Author authorTemp : authors ) {
			System.out.println(authorTemp.getId() + ": " + authorTemp.getFirstName() + " " + authorTemp.getLastName());
		}
	}
}
