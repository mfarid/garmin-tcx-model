
package guru.springframework.garmin.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Version_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Version_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VersionMajor" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="VersionMinor" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="BuildMajor" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *         &lt;element name="BuildMinor" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Version_t", namespace = "http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2", propOrder = {
    "versionMajor",
    "versionMinor",
    "buildMajor",
    "buildMinor"
})
public class VersionT {

    @XmlElement(name = "VersionMajor", namespace = "http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2")
    @XmlSchemaType(name = "unsignedShort")
    protected int versionMajor;
    @XmlElement(name = "VersionMinor", namespace = "http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2")
    @XmlSchemaType(name = "unsignedShort")
    protected int versionMinor;
    @XmlElement(name = "BuildMajor", namespace = "http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer buildMajor;
    @XmlElement(name = "BuildMinor", namespace = "http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer buildMinor;

    /**
     * Gets the value of the versionMajor property.
     * 
     */
    public int getVersionMajor() {
        return versionMajor;
    }

    /**
     * Sets the value of the versionMajor property.
     * 
     */
    public void setVersionMajor(int value) {
        this.versionMajor = value;
    }

    /**
     * Gets the value of the versionMinor property.
     * 
     */
    public int getVersionMinor() {
        return versionMinor;
    }

    /**
     * Sets the value of the versionMinor property.
     * 
     */
    public void setVersionMinor(int value) {
        this.versionMinor = value;
    }

    /**
     * Gets the value of the buildMajor property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBuildMajor() {
        return buildMajor;
    }

    /**
     * Sets the value of the buildMajor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBuildMajor(Integer value) {
        this.buildMajor = value;
    }

    /**
     * Gets the value of the buildMinor property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBuildMinor() {
        return buildMinor;
    }

    /**
     * Sets the value of the buildMinor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBuildMinor(Integer value) {
        this.buildMinor = value;
    }

}
