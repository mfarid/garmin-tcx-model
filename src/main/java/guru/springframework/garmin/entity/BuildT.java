
package guru.springframework.garmin.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Build_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Build_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Version" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Version_t"/>
 *         &lt;element name="Type" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}BuildType_t" minOccurs="0"/>
 *         &lt;element name="Time" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Token_t" minOccurs="0"/>
 *         &lt;element name="Builder" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Token_t" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Build_t", namespace = "http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2", propOrder = {
    "version",
    "type",
    "time",
    "builder"
})
public class BuildT {

    @XmlElement(name = "Version", namespace = "http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2", required = true)
    protected VersionT version;
    @XmlElement(name = "Type", namespace = "http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2")
    @XmlSchemaType(name = "token")
    protected BuildTypeT type;
    @XmlElement(name = "Time", namespace = "http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String time;
    @XmlElement(name = "Builder", namespace = "http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String builder;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link VersionT }
     *     
     */
    public VersionT getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionT }
     *     
     */
    public void setVersion(VersionT value) {
        this.version = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link BuildTypeT }
     *     
     */
    public BuildTypeT getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildTypeT }
     *     
     */
    public void setType(BuildTypeT value) {
        this.type = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(String value) {
        this.time = value;
    }

    /**
     * Gets the value of the builder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuilder() {
        return builder;
    }

    /**
     * Sets the value of the builder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuilder(String value) {
        this.builder = value;
    }

}
