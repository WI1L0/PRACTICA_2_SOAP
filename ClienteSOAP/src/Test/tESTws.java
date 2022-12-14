/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import ws.WSOperaciones;
import ws.WSOperaciones_Service;

/**
 *
 * @author MAWIL
 */
public class tESTws {
    public static void main(String[] args) {
        
        WSOperaciones_Service service = new WSOperaciones_Service();
        WSOperaciones port = service.getWSOperacionesPort();
        System.out.println(port.hello("William"));
        
        if (port.login("William", "12345")) {
            System.out.println("Credenciales Correctas");
        } else {
            System.out.println("Credenciales Incorrectas");
        }
        
        System.out.println(port.procesarPago(5000, 20000));
    }
}
