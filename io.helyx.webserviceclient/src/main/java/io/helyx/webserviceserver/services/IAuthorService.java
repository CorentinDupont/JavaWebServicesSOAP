package io.helyx.webserviceserver.services;

import io.helyx.webserviceserver.models.Author;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.sql.SQLException;

@WebService
@SOAPBinding(style=SOAPBinding.Style.DOCUMENT, use=SOAPBinding.Use.LITERAL)
public interface IAuthorService {

    @WebMethod
    Author[] readAll() throws SQLException;

    @WebMethod
    Author read(@WebParam(name="Id") int id) throws SQLException;

    @WebMethod
    Author create(@WebParam(name="Author") Author author) throws SQLException;

    @WebMethod
    Author update(@WebParam(name="Id") int id, @WebParam(name="Author") Author author) throws SQLException;

    @WebMethod
    void delete(@WebParam(name="Id") int id) throws SQLException;
}
