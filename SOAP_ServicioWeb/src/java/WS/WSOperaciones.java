/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package WS;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author MAWIL
 */
@WebService(serviceName = "WSOperaciones")
public class WSOperaciones {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "Login")
    public Boolean Login(@WebParam(name = "usuario") String usuario, @WebParam(name = "contrasena") String contrasena) {
        //TODO write your implementation code here:
        return usuario.equals("William") && contrasena.equals("12345");
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ProcesarPago")
    public int ProcesarPago(@WebParam(name = "total") int total, @WebParam(name = "pago") int pago) {
        //TODO write your implementation code here:
        if (pago >= total) {
            return pago - total;
        } else {
            return -1;
        }
    }
}
