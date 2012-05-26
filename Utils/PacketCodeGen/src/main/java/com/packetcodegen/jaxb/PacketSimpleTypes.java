//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.05.27 at 01:21:41 AM CEST 
//


package com.packetcodegen.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PacketSimpleTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PacketSimpleTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="int8"/>
 *     &lt;enumeration value="int16"/>
 *     &lt;enumeration value="int32"/>
 *     &lt;enumeration value="int64"/>
 *     &lt;enumeration value="packed"/>
 *     &lt;enumeration value="float"/>
 *     &lt;enumeration value="vec2"/>
 *     &lt;enumeration value="vec3"/>
 *     &lt;enumeration value="vec4"/>
 *     &lt;enumeration value="uuid16"/>
 *     &lt;enumeration value="uuid28"/>
 *     &lt;enumeration value="agentid"/>
 *     &lt;enumeration value="ascii"/>
 *     &lt;enumeration value="utf16"/>
 *     &lt;enumeration value="nested"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PacketSimpleTypes")
@XmlEnum
public enum PacketSimpleTypes {

    @XmlEnumValue("int8")
    INT_8("int8"),
    @XmlEnumValue("int16")
    INT_16("int16"),
    @XmlEnumValue("int32")
    INT_32("int32"),
    @XmlEnumValue("int64")
    INT_64("int64"),
    @XmlEnumValue("packed")
    PACKED("packed"),
    @XmlEnumValue("float")
    FLOAT("float"),
    @XmlEnumValue("vec2")
    VEC_2("vec2"),
    @XmlEnumValue("vec3")
    VEC_3("vec3"),
    @XmlEnumValue("vec4")
    VEC_4("vec4"),
    @XmlEnumValue("uuid16")
    UUID_16("uuid16"),
    @XmlEnumValue("uuid28")
    UUID_28("uuid28"),
    @XmlEnumValue("agentid")
    AGENTID("agentid"),
    @XmlEnumValue("ascii")
    ASCII("ascii"),
    @XmlEnumValue("utf16")
    UTF_16("utf16"),
    @XmlEnumValue("nested")
    NESTED("nested");
    private final String value;

    PacketSimpleTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PacketSimpleTypes fromValue(String v) {
        for (PacketSimpleTypes c: PacketSimpleTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
