package com.source;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

@WebService
//@SOAPBinding(style = SOAPBinding.Style.RPC) //XSD include in other url
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)//XSD include in another url
public interface HelloWorld {
    @WebMethod
    String sayHelloWorld(String content);
}
