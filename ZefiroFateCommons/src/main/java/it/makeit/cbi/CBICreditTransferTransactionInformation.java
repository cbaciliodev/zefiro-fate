//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.19 at 03:00:47 PM CEST 
//


package it.makeit.cbi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CBICreditTransferTransactionInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CBICreditTransferTransactionInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PmtId" type="{urn:CBI:xsd:CBIPaymentRequest.00.04.00}PaymentIdentification1"/>
 *         &lt;element name="PmtTpInf" type="{urn:CBI:xsd:CBIPaymentRequest.00.04.00}CBIPaymentTypeInformation2" minOccurs="0"/>
 *         &lt;element name="Amt" type="{urn:CBI:xsd:CBIPaymentRequest.00.04.00}CBIAmountType1"/>
 *         &lt;element name="ChqInstr" type="{urn:CBI:xsd:CBIPaymentRequest.00.04.00}CBICheque1" minOccurs="0"/>
 *         &lt;element name="UltmtDbtr" type="{urn:CBI:xsd:CBIPaymentRequest.00.04.00}CBIPartyIdentification2" minOccurs="0"/>
 *         &lt;element name="SrvInf" type="{urn:CBI:xsd:CBIPaymentRequest.00.04.00}CBISrvInf1" minOccurs="0"/>
 *         &lt;element name="CdtrAgt" type="{urn:CBI:xsd:CBIPaymentRequest.00.04.00}CBIBranchAndFinancialInstitutionIdentification3" minOccurs="0"/>
 *         &lt;element name="Cdtr" type="{urn:CBI:xsd:CBIPaymentRequest.00.04.00}CBIPartyIdentification3"/>
 *         &lt;element name="CdtrAcct" type="{urn:CBI:xsd:CBIPaymentRequest.00.04.00}CBICashAccount1" minOccurs="0"/>
 *         &lt;element name="UltmtCdtr" type="{urn:CBI:xsd:CBIPaymentRequest.00.04.00}CBIPartyIdentification3" minOccurs="0"/>
 *         &lt;element name="DestCdtrRsp" type="{urn:CBI:xsd:CBIPaymentRequest.00.04.00}CBIPartyIdentification5" minOccurs="0"/>
 *         &lt;element name="Purp" type="{urn:CBI:xsd:CBIPaymentRequest.00.04.00}Purpose1Choice" minOccurs="0"/>
 *         &lt;element name="RgltryRptg" type="{urn:CBI:xsd:CBIPaymentRequest.00.04.00}CBIRegulatoryReporting1" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="RltdRmtInf" type="{urn:CBI:xsd:CBIPaymentRequest.00.04.00}CBIRemittanceLocation1" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="RmtInf" type="{urn:CBI:xsd:CBIPaymentRequest.00.04.00}RemittanceInformation5" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CBICreditTransferTransactionInformation", propOrder = {
    "pmtId",
    "pmtTpInf",
    "amt",
    "chqInstr",
    "ultmtDbtr",
    "srvInf",
    "cdtrAgt",
    "cdtr",
    "cdtrAcct",
    "ultmtCdtr",
    "destCdtrRsp",
    "purp",
    "rgltryRptg",
    "rltdRmtInf",
    "rmtInf"
})
public class CBICreditTransferTransactionInformation {

    @XmlElement(name = "PmtId", required = true)
    protected PaymentIdentification1 pmtId;
    @XmlElement(name = "PmtTpInf")
    protected CBIPaymentTypeInformation2 pmtTpInf;
    @XmlElement(name = "Amt", required = true)
    protected CBIAmountType1 amt;
    @XmlElement(name = "ChqInstr")
    protected CBICheque1 chqInstr;
    @XmlElement(name = "UltmtDbtr")
    protected CBIPartyIdentification2 ultmtDbtr;
    @XmlElement(name = "SrvInf")
    protected CBISrvInf1 srvInf;
    @XmlElement(name = "CdtrAgt")
    protected CBIBranchAndFinancialInstitutionIdentification3 cdtrAgt;
    @XmlElement(name = "Cdtr", required = true)
    protected CBIPartyIdentification3 cdtr;
    @XmlElement(name = "CdtrAcct")
    protected CBICashAccount1 cdtrAcct;
    @XmlElement(name = "UltmtCdtr")
    protected CBIPartyIdentification3 ultmtCdtr;
    @XmlElement(name = "DestCdtrRsp")
    protected CBIPartyIdentification5 destCdtrRsp;
    @XmlElement(name = "Purp")
    protected Purpose1Choice purp;
    @XmlElement(name = "RgltryRptg")
    protected List<CBIRegulatoryReporting1> rgltryRptg;
    @XmlElement(name = "RltdRmtInf")
    protected List<CBIRemittanceLocation1> rltdRmtInf;
    @XmlElement(name = "RmtInf")
    protected RemittanceInformation5 rmtInf;

    /**
     * Gets the value of the pmtId property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentIdentification1 }
     *     
     */
    public PaymentIdentification1 getPmtId() {
        return pmtId;
    }

    /**
     * Sets the value of the pmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentIdentification1 }
     *     
     */
    public void setPmtId(PaymentIdentification1 value) {
        this.pmtId = value;
    }

    /**
     * Gets the value of the pmtTpInf property.
     * 
     * @return
     *     possible object is
     *     {@link CBIPaymentTypeInformation2 }
     *     
     */
    public CBIPaymentTypeInformation2 getPmtTpInf() {
        return pmtTpInf;
    }

    /**
     * Sets the value of the pmtTpInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CBIPaymentTypeInformation2 }
     *     
     */
    public void setPmtTpInf(CBIPaymentTypeInformation2 value) {
        this.pmtTpInf = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link CBIAmountType1 }
     *     
     */
    public CBIAmountType1 getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CBIAmountType1 }
     *     
     */
    public void setAmt(CBIAmountType1 value) {
        this.amt = value;
    }

    /**
     * Gets the value of the chqInstr property.
     * 
     * @return
     *     possible object is
     *     {@link CBICheque1 }
     *     
     */
    public CBICheque1 getChqInstr() {
        return chqInstr;
    }

    /**
     * Sets the value of the chqInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CBICheque1 }
     *     
     */
    public void setChqInstr(CBICheque1 value) {
        this.chqInstr = value;
    }

    /**
     * Gets the value of the ultmtDbtr property.
     * 
     * @return
     *     possible object is
     *     {@link CBIPartyIdentification2 }
     *     
     */
    public CBIPartyIdentification2 getUltmtDbtr() {
        return ultmtDbtr;
    }

    /**
     * Sets the value of the ultmtDbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CBIPartyIdentification2 }
     *     
     */
    public void setUltmtDbtr(CBIPartyIdentification2 value) {
        this.ultmtDbtr = value;
    }

    /**
     * Gets the value of the srvInf property.
     * 
     * @return
     *     possible object is
     *     {@link CBISrvInf1 }
     *     
     */
    public CBISrvInf1 getSrvInf() {
        return srvInf;
    }

    /**
     * Sets the value of the srvInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CBISrvInf1 }
     *     
     */
    public void setSrvInf(CBISrvInf1 value) {
        this.srvInf = value;
    }

    /**
     * Gets the value of the cdtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link CBIBranchAndFinancialInstitutionIdentification3 }
     *     
     */
    public CBIBranchAndFinancialInstitutionIdentification3 getCdtrAgt() {
        return cdtrAgt;
    }

    /**
     * Sets the value of the cdtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CBIBranchAndFinancialInstitutionIdentification3 }
     *     
     */
    public void setCdtrAgt(CBIBranchAndFinancialInstitutionIdentification3 value) {
        this.cdtrAgt = value;
    }

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link CBIPartyIdentification3 }
     *     
     */
    public CBIPartyIdentification3 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CBIPartyIdentification3 }
     *     
     */
    public void setCdtr(CBIPartyIdentification3 value) {
        this.cdtr = value;
    }

    /**
     * Gets the value of the cdtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CBICashAccount1 }
     *     
     */
    public CBICashAccount1 getCdtrAcct() {
        return cdtrAcct;
    }

    /**
     * Sets the value of the cdtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CBICashAccount1 }
     *     
     */
    public void setCdtrAcct(CBICashAccount1 value) {
        this.cdtrAcct = value;
    }

    /**
     * Gets the value of the ultmtCdtr property.
     * 
     * @return
     *     possible object is
     *     {@link CBIPartyIdentification3 }
     *     
     */
    public CBIPartyIdentification3 getUltmtCdtr() {
        return ultmtCdtr;
    }

    /**
     * Sets the value of the ultmtCdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CBIPartyIdentification3 }
     *     
     */
    public void setUltmtCdtr(CBIPartyIdentification3 value) {
        this.ultmtCdtr = value;
    }

    /**
     * Gets the value of the destCdtrRsp property.
     * 
     * @return
     *     possible object is
     *     {@link CBIPartyIdentification5 }
     *     
     */
    public CBIPartyIdentification5 getDestCdtrRsp() {
        return destCdtrRsp;
    }

    /**
     * Sets the value of the destCdtrRsp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CBIPartyIdentification5 }
     *     
     */
    public void setDestCdtrRsp(CBIPartyIdentification5 value) {
        this.destCdtrRsp = value;
    }

    /**
     * Gets the value of the purp property.
     * 
     * @return
     *     possible object is
     *     {@link Purpose1Choice }
     *     
     */
    public Purpose1Choice getPurp() {
        return purp;
    }

    /**
     * Sets the value of the purp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Purpose1Choice }
     *     
     */
    public void setPurp(Purpose1Choice value) {
        this.purp = value;
    }

    /**
     * Gets the value of the rgltryRptg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rgltryRptg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRgltryRptg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CBIRegulatoryReporting1 }
     * 
     * 
     */
    public List<CBIRegulatoryReporting1> getRgltryRptg() {
        if (rgltryRptg == null) {
            rgltryRptg = new ArrayList<CBIRegulatoryReporting1>();
        }
        return this.rgltryRptg;
    }

    /**
     * Gets the value of the rltdRmtInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rltdRmtInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdRmtInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CBIRemittanceLocation1 }
     * 
     * 
     */
    public List<CBIRemittanceLocation1> getRltdRmtInf() {
        if (rltdRmtInf == null) {
            rltdRmtInf = new ArrayList<CBIRemittanceLocation1>();
        }
        return this.rltdRmtInf;
    }

    /**
     * Gets the value of the rmtInf property.
     * 
     * @return
     *     possible object is
     *     {@link RemittanceInformation5 }
     *     
     */
    public RemittanceInformation5 getRmtInf() {
        return rmtInf;
    }

    /**
     * Sets the value of the rmtInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemittanceInformation5 }
     *     
     */
    public void setRmtInf(RemittanceInformation5 value) {
        this.rmtInf = value;
    }

}
