package io.helyx.webserviceserver.services;

import io.helyx.webserviceserver.models.Author;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(endpointInterface="io.helyx.webserviceserver.services.IAuthorService")
public class AuthorService implements IAuthorService {

//	@WebMethod(operationName = "readAllAuthor")
//	public Author readAll() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	public Author create(Author object) {
		object.setFirstName("coco");
		return object;
	}

//	@WebMethod(operationName = "readAuthor")
//	public Author read(Long id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@WebMethod(operationName = "updateAuthor")
//	public Author update(Long id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@WebMethod(operationName = "deleteAuthor")
//	public void delete(Long id) {
//		// TODO Auto-generated method stub
//	}

}
