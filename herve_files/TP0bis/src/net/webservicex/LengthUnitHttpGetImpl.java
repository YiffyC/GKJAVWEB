
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
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.6.2
 * 2018-03-13T11:07:40.332+01:00
 * Generated source version: 2.6.2
 * 
 */

@javax.jws.WebService(
                      serviceName = "lengthUnit",
                      portName = "lengthUnitHttpGet",
                      targetNamespace = "http://www.webserviceX.NET/",
                      wsdlLocation = "http://www.webservicex.net/length.asmx?WSDL",
                      endpointInterface = "net.webservicex.LengthUnitHttpGet")
                      
public class LengthUnitHttpGetImpl implements LengthUnitHttpGet {

    private static final Logger LOG = Logger.getLogger(LengthUnitHttpGetImpl.class.getName());

    /* (non-Javadoc)
     * @see net.webservicex.LengthUnitHttpGet#changeLengthUnit(java.lang.String  lengthValue ,)java.lang.String  fromLengthUnit ,)java.lang.String  toLengthUnit )*
     */
    public double changeLengthUnit(java.lang.String lengthValue,java.lang.String fromLengthUnit,java.lang.String toLengthUnit) { 
        LOG.info("Executing operation changeLengthUnit");
        System.out.println(lengthValue);
        System.out.println(fromLengthUnit);
        System.out.println(toLengthUnit);
        try {
            double _return = 0.012657415464629174;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
