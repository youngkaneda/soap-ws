/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soap.ws.client;

import soap.ws.server.Hello;
import soap.ws.server.HelloImplService;

/**
 *
 * @author juan
 */
public class Loader {

    public static void main(String[] args) {
        HelloImplService proxy = new HelloImplService();
        Hello service = proxy.getHelloImplPort();
        String greeting = service.greeting("Juan");
        System.out.println(greeting);
    }

}
