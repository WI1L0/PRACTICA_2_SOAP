
package ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.5
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WSOperaciones", targetNamespace = "http://WS/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WSOperaciones {


    /**
     * 
     * @param total
     * @param pago
     * @return
     *     returns int
     */
    @WebMethod(operationName = "ProcesarPago")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ProcesarPago", targetNamespace = "http://WS/", className = "ws.ProcesarPago")
    @ResponseWrapper(localName = "ProcesarPagoResponse", targetNamespace = "http://WS/", className = "ws.ProcesarPagoResponse")
    @Action(input = "http://WS/WSOperaciones/ProcesarPagoRequest", output = "http://WS/WSOperaciones/ProcesarPagoResponse")
    public int procesarPago(
        @WebParam(name = "total", targetNamespace = "")
        int total,
        @WebParam(name = "pago", targetNamespace = "")
        int pago);

    /**
     * 
     * @param usuario
     * @param contrasena
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "Login")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Login", targetNamespace = "http://WS/", className = "ws.Login")
    @ResponseWrapper(localName = "LoginResponse", targetNamespace = "http://WS/", className = "ws.LoginResponse")
    @Action(input = "http://WS/WSOperaciones/LoginRequest", output = "http://WS/WSOperaciones/LoginResponse")
    public Boolean login(
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "contrasena", targetNamespace = "")
        String contrasena);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://WS/", className = "ws.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://WS/", className = "ws.HelloResponse")
    @Action(input = "http://WS/WSOperaciones/helloRequest", output = "http://WS/WSOperaciones/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

}
