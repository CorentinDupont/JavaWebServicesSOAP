package io.helyx.webserviceserver.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;


@WebService
@SOAPBinding(style=Style.DOCUMENT, use=Use.LITERAL)
public interface ICrudService<T> {
	
//	@WebMethod
//	T readAll();
	
	@WebMethod
	T create(@WebParam(name="Object") T object);
	
//	@WebMethod
//	T read(Long id);
//
//	@WebMethod
//	T update(Long id);
//
//	@WebMethod
//	void delete(Long id);
}
