package soap.ws.server;

import javax.xml.ws.Endpoint;

/**
 * Hello world!
 *
 */
public class Loader {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9090/Hello", new HelloImpl());
    }
}
