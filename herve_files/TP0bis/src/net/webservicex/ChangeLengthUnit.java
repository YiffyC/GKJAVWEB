
package net.webservicex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LengthValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="fromLengthUnit" type="{http://www.webserviceX.NET/}Lengths"/>
 *         &lt;element name="toLengthUnit" type="{http://www.webserviceX.NET/}Lengths"/>
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
    "lengthValue",
    "fromLengthUnit",
    "toLengthUnit"
})
@XmlRootElement(name = "ChangeLengthUnit")
public class ChangeLengthUnit {

    @XmlElement(name = "LengthValue")
    protected double lengthValue;
    @XmlElement(required = true)
    protected Lengths fromLengthUnit;
    @XmlElement(required = true)
    protected Lengths toLengthUnit;

    /**
     * Obtient la valeur de la propriété lengthValue.
     * 
     */
    public double getLengthValue() {
        return lengthValue;
    }

    /**
     * Définit la valeur de la propriété lengthValue.
     * 
     */
    public void setLengthValue(double value) {
        this.lengthValue = value;
    }

    /**
     * Obtient la valeur de la propriété fromLengthUnit.
     * 
     * @return
     *     possible object is
     *     {@link Lengths }
     *     
     */
    public Lengths getFromLengthUnit() {
        return fromLengthUnit;
    }

    /**
     * Définit la valeur de la propriété fromLengthUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link Lengths }
     *     
     */
    public void setFromLengthUnit(Lengths value) {
        this.fromLengthUnit = value;
    }

    /**
     * Obtient la valeur de la propriété toLengthUnit.
     * 
     * @return
     *     possible object is
     *     {@link Lengths }
     *     
     */
    public Lengths getToLengthUnit() {
        return toLengthUnit;
    }

    /**
     * Définit la valeur de la propriété toLengthUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link Lengths }
     *     
     */
    public void setToLengthUnit(Lengths value) {
        this.toLengthUnit = value;
    }

}
