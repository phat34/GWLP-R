//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.05.27 at 01:21:41 AM CEST 
//


package com.packetcodegen.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PacketFieldType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PacketFieldType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Info" type="{}MetaInfo" minOccurs="0"/>
 *         &lt;element name="Field" type="{}PacketFieldType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" use="required" type="{}PacketSimpleTypes" />
 *       &lt;attribute name="prefixType" type="{}PacketSimpleTypes" />
 *       &lt;attribute name="static" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="occurs" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PacketFieldType", propOrder = {
    "info",
    "field"
})
public class PacketFieldType {

    @XmlElement(name = "Info")
    protected MetaInfo info;
    @XmlElement(name = "Field")
    protected List<PacketFieldType> field;
    @XmlAttribute(name = "type", required = true)
    protected PacketSimpleTypes type;
    @XmlAttribute(name = "prefixType")
    protected PacketSimpleTypes prefixType;
    @XmlAttribute(name = "static")
    protected Boolean _static;
    @XmlAttribute(name = "occurs")
    @XmlSchemaType(name = "unsignedInt")
    protected Long occurs;

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link MetaInfo }
     *     
     */
    public MetaInfo getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaInfo }
     *     
     */
    public void setInfo(MetaInfo value) {
        this.info = value;
    }

    /**
     * Gets the value of the field property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the field property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PacketFieldType }
     * 
     * 
     */
    public List<PacketFieldType> getField() {
        if (field == null) {
            field = new ArrayList<PacketFieldType>();
        }
        return this.field;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link PacketSimpleTypes }
     *     
     */
    public PacketSimpleTypes getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link PacketSimpleTypes }
     *     
     */
    public void setType(PacketSimpleTypes value) {
        this.type = value;
    }

    /**
     * Gets the value of the prefixType property.
     * 
     * @return
     *     possible object is
     *     {@link PacketSimpleTypes }
     *     
     */
    public PacketSimpleTypes getPrefixType() {
        return prefixType;
    }

    /**
     * Sets the value of the prefixType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PacketSimpleTypes }
     *     
     */
    public void setPrefixType(PacketSimpleTypes value) {
        this.prefixType = value;
    }

    /**
     * Gets the value of the static property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatic() {
        return _static;
    }

    /**
     * Sets the value of the static property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatic(Boolean value) {
        this._static = value;
    }

    /**
     * Gets the value of the occurs property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOccurs() {
        return occurs;
    }

    /**
     * Sets the value of the occurs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOccurs(Long value) {
        this.occurs = value;
    }

}
