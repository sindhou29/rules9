//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.01 at 03:42:28 PM SGT 
//


package com.emc.sett.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MnmeaSubT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MnmeaSubT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adjustments" type="{http://www.model.sett.emc.com}AdjustmentT" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="gmee" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="gmef" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="lmee" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="lmef" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="nmea" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="rerunId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="settId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="runType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="settDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MnmeaSubT", propOrder = {
    "adjustments",
    "gmee",
    "gmef",
    "lmee",
    "lmef",
    "nmea",
    "rerunId",
    "settId",
    "runType",
    "settDate"
})
public class MnmeaSubT {

    protected List<AdjustmentT> adjustments;
    @XmlElement(required = true)
    protected BigDecimal gmee;
    @XmlElement(required = true)
    protected BigDecimal gmef;
    @XmlElement(required = true)
    protected BigDecimal lmee;
    @XmlElement(required = true)
    protected BigDecimal lmef;
    @XmlElement(required = true)
    protected BigDecimal nmea;
    @XmlElement(required = true)
    protected String rerunId;
    @XmlElement(required = true)
    protected String settId;
    @XmlElement(required = true)
    protected String runType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar settDate;

    /**
     * Gets the value of the adjustments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adjustments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdjustments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdjustmentT }
     * 
     * 
     */
    public List<AdjustmentT> getAdjustments() {
        if (adjustments == null) {
            adjustments = new ArrayList<AdjustmentT>();
        }
        return this.adjustments;
    }

    /**
     * Gets the value of the gmee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGmee() {
        return gmee;
    }

    /**
     * Sets the value of the gmee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGmee(BigDecimal value) {
        this.gmee = value;
    }

    /**
     * Gets the value of the gmef property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGmef() {
        return gmef;
    }

    /**
     * Sets the value of the gmef property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGmef(BigDecimal value) {
        this.gmef = value;
    }

    /**
     * Gets the value of the lmee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLmee() {
        return lmee;
    }

    /**
     * Sets the value of the lmee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLmee(BigDecimal value) {
        this.lmee = value;
    }

    /**
     * Gets the value of the lmef property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLmef() {
        return lmef;
    }

    /**
     * Sets the value of the lmef property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLmef(BigDecimal value) {
        this.lmef = value;
    }

    /**
     * Gets the value of the nmea property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNmea() {
        return nmea;
    }

    /**
     * Sets the value of the nmea property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNmea(BigDecimal value) {
        this.nmea = value;
    }

    /**
     * Gets the value of the rerunId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRerunId() {
        return rerunId;
    }

    /**
     * Sets the value of the rerunId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRerunId(String value) {
        this.rerunId = value;
    }

    /**
     * Gets the value of the settId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettId() {
        return settId;
    }

    /**
     * Sets the value of the settId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettId(String value) {
        this.settId = value;
    }

    /**
     * Gets the value of the runType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunType() {
        return runType;
    }

    /**
     * Sets the value of the runType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunType(String value) {
        this.runType = value;
    }

    /**
     * Gets the value of the settDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSettDate() {
        return settDate;
    }

    /**
     * Sets the value of the settDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSettDate(XMLGregorianCalendar value) {
        this.settDate = value;
    }

}