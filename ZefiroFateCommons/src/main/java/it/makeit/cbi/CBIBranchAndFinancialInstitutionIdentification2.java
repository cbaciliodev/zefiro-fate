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
 * <p>Java class for CBIBranchAndFinancialInstitutionIdentification2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CBIBranchAndFinancialInstitutionIdentification2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FinInstnId" type="{urn:CBI:xsd:CBIPaymentRequest.00.04.00}CBIFinancialInstitutionIdentification3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CBIBranchAndFinancialInstitutionIdentification2", propOrder = {
    "finInstnId"
})
public class CBIBranchAndFinancialInstitutionIdentification2 {

    @XmlElement(name = "FinInstnId", required = true)
    protected CBIFinancialInstitutionIdentification3 finInstnId;

    /**
     * Gets the value of the finInstnId property.
     * 
     * @return
     *     possible object is
     *     {@link CBIFinancialInstitutionIdentification3 }
     *     
     */
    public CBIFinancialInstitutionIdentification3 getFinInstnId() {
        return finInstnId;
    }

    /**
     * Sets the value of the finInstnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CBIFinancialInstitutionIdentification3 }
     *     
     */
    public void setFinInstnId(CBIFinancialInstitutionIdentification3 value) {
        this.finInstnId = value;
    }

}
