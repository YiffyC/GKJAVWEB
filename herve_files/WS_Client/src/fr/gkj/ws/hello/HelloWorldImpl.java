
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package fr.gkj.ws.hello;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.6.2
 * 2018-03-12T09:08:31.774+01:00
 * Generated source version: 2.6.2
 * 
 */

@javax.jws.WebService(
                      serviceName = "HelloWorldService",
                      portName = "HelloWorldPort",
                      targetNamespace = "http://ws.gkj.fr/",
                      wsdlLocation = "http://localhost:9000/HelloWorld?wsdl",
                      endpointInterface = "fr.gkj.ws.hello.HelloWorld")
                      
public class HelloWorldImpl implements HelloWorld {

    private static final Logger LOG = Logger.getLogger(HelloWorldImpl.class.getName());

    /* (non-Javadoc)
     * @see fr.gkj.ws.hello.HelloWorld#sayHello(java.lang.String  texte )*
     */
    public java.lang.String sayHello(java.lang.String texte) { 
        LOG.info("Executing operation sayHello");
        System.out.println(texte);
        try {
            java.lang.String _return = "_return2118742514";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
