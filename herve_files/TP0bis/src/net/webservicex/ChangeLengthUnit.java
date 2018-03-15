
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
     * Obtient la valeur de la propri�t� lengthValue.
     * 
     */
    public double getLengthValue() {
        return lengthValue;
    }

    /**
     * D�finit la valeur de la propri�t� lengthValue.
     * 
     */
    public void setLengthValue(double value) {
        this.lengthValue = value;
    }

    /**
     * Obtient la valeur de la propri�t� fromLengthUnit.
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
     * D�finit la valeur de la propri�t� fromLengthUnit.
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
     * Obtient la valeur de la propri�t� toLengthUnit.
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
     * D�finit la valeur de la propri�t� toLengthUnit.
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
