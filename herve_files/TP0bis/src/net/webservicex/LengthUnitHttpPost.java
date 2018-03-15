package net.webservicex;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.6.2
 * 2018-03-13T11:07:40.774+01:00
 * Generated source version: 2.6.2
 * 
 */
@WebService(targetNamespace = "http://www.webserviceX.NET/", name = "lengthUnitHttpPost")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface LengthUnitHttpPost {

    @WebMethod(operationName = "ChangeLengthUnit")
    @WebResult(name = "double", targetNamespace = "http://www.webserviceX.NET/", partName = "Body")
    public double changeLengthUnit(
        @WebParam(partName = "LengthValue", name = "LengthValue", targetNamespace = "http://www.webserviceX.NET/")
        java.lang.String lengthValue,
        @WebParam(partName = "fromLengthUnit", name = "fromLengthUnit", targetNamespace = "http://www.webserviceX.NET/")
        java.lang.String fromLengthUnit,
        @WebParam(partName = "toLengthUnit", name = "toLengthUnit", targetNamespace = "http://www.webserviceX.NET/")
        java.lang.String toLengthUnit
    );
}
