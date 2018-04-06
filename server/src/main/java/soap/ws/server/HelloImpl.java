/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soap.ws.server;

import javax.jws.WebService;
import soap.ws.shared.Hello;

/**
 *
 * @author juan
 */
@WebService(
        endpointInterface = "soap.ws.shared.Hello"
)
public class HelloImpl implements Hello{

    public String greeting(String name) {
        return "Hello " + name + '!';
    }
    
}
