package io.helyx.webserviceserver.services;

import io.helyx.webserviceserver.models.Author;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style=SOAPBinding.Style.DOCUMENT, use=SOAPBinding.Use.LITERAL)
public interface IAuthorService {

    @WebMethod
    Author create(@WebParam(name="Author") Author object);
}
