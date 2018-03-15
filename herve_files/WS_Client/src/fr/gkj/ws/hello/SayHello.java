
package fr.gkj.ws.hello;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour sayHello complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="sayHello">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="texte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sayHello", propOrder = {
    "texte"
})
public class SayHello {

    protected String texte;

    /**
     * Obtient la valeur de la propriété texte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTexte() {
        return texte;
    }

    /**
     * Définit la valeur de la propriété texte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTexte(String value) {
        this.texte = value;
    }

}
