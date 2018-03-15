
package net.webservicex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChangeLengthUnitResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "changeLengthUnitResult"
})
@XmlRootElement(name = "ChangeLengthUnitResponse")
public class ChangeLengthUnitResponse {

    @XmlElement(name = "ChangeLengthUnitResult")
    protected double changeLengthUnitResult;

    /**
     * Obtient la valeur de la propri�t� changeLengthUnitResult.
     * 
     */
    public double getChangeLengthUnitResult() {
        return changeLengthUnitResult;
    }

    /**
     * D�finit la valeur de la propri�t� changeLengthUnitResult.
     * 
     */
    public void setChangeLengthUnitResult(double value) {
        this.changeLengthUnitResult = value;
    }

}
