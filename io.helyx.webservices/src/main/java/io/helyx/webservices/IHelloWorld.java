package io.helyx.webservices;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;


@WebService
@SOAPBinding(style=Style.RPC, use=Use.LITERAL)
public interface IHelloWorld {
	
	@WebMethod
	String getHelloWorldAsString(String name);
}
