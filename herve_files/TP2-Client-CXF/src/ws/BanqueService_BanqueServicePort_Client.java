
package ws;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.6.2
 * 2018-03-14T15:46:24.130+01:00
 * Generated source version: 2.6.2
 * 
 */
public final class BanqueService_BanqueServicePort_Client {

    private static final QName SERVICE_NAME = new QName("http://ws/", "BanqueWS");

    private BanqueService_BanqueServicePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = BanqueWS.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        BanqueWS ss = new BanqueWS(wsdlURL, SERVICE_NAME);
        BanqueService port = ss.getBanqueServicePort();  
        
        {
        System.out.println("Invoking getCompte...");
        long _getCompte_code = 1330855848549593220l;
        ws.Compte _getCompte__return = port.getCompte(_getCompte_code);
        System.out.println("getCompte.result=" + _getCompte__return);


        }
        {
        System.out.println("Invoking getComptes...");
        java.util.List<ws.Compte> _getComptes__return = port.getComptes();
        System.out.println("getComptes.result=" + _getComptes__return);


        }
        {
        System.out.println("Invoking conversionEuroToD...");
        double _conversionEuroToD_montant = 0.030620825385670347;
        double _conversionEuroToD__return = port.conversionEuroToD(_conversionEuroToD_montant);
        System.out.println("conversionEuroToD.result=" + _conversionEuroToD__return);


        }

        System.exit(0);
    }

}
