
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package net.webservicex;

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
 * 2018-03-13T11:07:40.562+01:00
 * Generated source version: 2.6.2
 * 
 */

@javax.jws.WebService(
                      serviceName = "lengthUnit",
                      portName = "lengthUnitSoap12",
                      targetNamespace = "http://www.webserviceX.NET/",
                      wsdlLocation = "http://www.webservicex.net/length.asmx?WSDL",
                      endpointInterface = "net.webservicex.LengthUnitSoap")
                      
public class LengthUnitSoapImpl1 implements LengthUnitSoap {

    private static final Logger LOG = Logger.getLogger(LengthUnitSoapImpl.class.getName());

    /* (non-Javadoc)
     * @see net.webservicex.LengthUnitSoap#changeLengthUnit(double  lengthValue ,)net.webservicex.Lengths  fromLengthUnit ,)net.webservicex.Lengths  toLengthUnit )*
     */
    public double changeLengthUnit(double lengthValue,net.webservicex.Lengths fromLengthUnit,net.webservicex.Lengths toLengthUnit) { 
        LOG.info("Executing operation changeLengthUnit");
        System.out.println(lengthValue);
        System.out.println(fromLengthUnit);
        System.out.println(toLengthUnit);
        try {
            double _return = 0.7521606046808907;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
