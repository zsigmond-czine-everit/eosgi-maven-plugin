//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.02.12 at 05:29:34 PM CET 
//


package org.everit.osgi.dev.maven.jaxb.dist.definition;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OSGiAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OSGiAction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="install"/>
 *     &lt;enumeration value="start"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OSGiAction")
@XmlEnum
public enum OSGiAction {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("install")
    INSTALL("install"),
    @XmlEnumValue("start")
    START("start");
    private final String value;

    OSGiAction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OSGiAction fromValue(String v) {
        for (OSGiAction c: OSGiAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
