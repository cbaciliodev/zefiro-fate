//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.19 at 03:00:47 PM CEST 
//


package it.makeit.cbi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CBIPartyIdentification4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CBIPartyIdentification4">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Nm" type="{urn:CBI:xsd:CBIPaymentRequest.00.04.00}Max70Text"/>
 *         &lt;element name="PstlAdr" type="{urn:CBI:xsd:CBIPaymentRequest.00.04.00}CBIPostalAddress6" minOccurs="0"/>
 *         &lt;element name="Id" type="{urn:CBI:xsd:CBIPaymentRequest.00.04.00}CBIIdType2" minOccurs="0"/>
 *         &lt;element name="CtryOfRes" type="{urn:CBI:xsd:CBIPaymentRequest.00.04.00}CountryCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CBIPartyIdentification4", propOrder = {
    "nm",
    "pstlAdr",
    "id",
    "ctryOfRes"
})
public class CBIPartyIdentification4 {

    @XmlElement(name = "Nm", required = true)
    protected String nm;
    @XmlElement(name = "PstlAdr")
    protected CBIPostalAddress6 pstlAdr;
    @XmlElement(name = "Id")
    protected CBIIdType2 id;
    @XmlElement(name = "CtryOfRes")
    protected String ctryOfRes;

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNm(String value) {
        this.nm = value;
    }

    /**
     * Gets the value of the pstlAdr property.
     * 
     * @return
     *     possible object is
     *     {@link CBIPostalAddress6 }
     *     
     */
    public CBIPostalAddress6 getPstlAdr() {
        return pstlAdr;
    }

    /**
     * Sets the value of the pstlAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CBIPostalAddress6 }
     *     
     */
    public void setPstlAdr(CBIPostalAddress6 value) {
        this.pstlAdr = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link CBIIdType2 }
     *     
     */
    public CBIIdType2 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link CBIIdType2 }
     *     
     */
    public void setId(CBIIdType2 value) {
        this.id = value;
    }

    /**
     * Gets the value of the ctryOfRes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryOfRes() {
        return ctryOfRes;
    }

    /**
     * Sets the value of the ctryOfRes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtryOfRes(String value) {
        this.ctryOfRes = value;
    }

}
