//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.11 at 11:53:11 AM CET 
//


package it.makeit.fatturazione.commons.jaxb.fattura;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Blocco relativo ai dati del Terzo Intermediario che
 * 				emette fattura elettronica per conto del
 * 				Cedente/Prestatore
 * 			
 * 
 * <p>Java class for TerzoIntermediarioSoggettoEmittenteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TerzoIntermediarioSoggettoEmittenteType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DatiAnagrafici" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}DatiAnagraficiTerzoIntermediarioType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerzoIntermediarioSoggettoEmittenteType", propOrder = {
    "datiAnagrafici"
})
public class TerzoIntermediarioSoggettoEmittenteType {

    @XmlElement(name = "DatiAnagrafici", required = true)
    protected DatiAnagraficiTerzoIntermediarioType datiAnagrafici;

    /**
     * Gets the value of the datiAnagrafici property.
     * 
     * @return
     *     possible object is
     *     {@link DatiAnagraficiTerzoIntermediarioType }
     *     
     */
    public DatiAnagraficiTerzoIntermediarioType getDatiAnagrafici() {
        return datiAnagrafici;
    }

    /**
     * Sets the value of the datiAnagrafici property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiAnagraficiTerzoIntermediarioType }
     *     
     */
    public void setDatiAnagrafici(DatiAnagraficiTerzoIntermediarioType value) {
        this.datiAnagrafici = value;
    }

}
