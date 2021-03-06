
package guru.springframework.garmin.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Position_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Position_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LatitudeDegrees" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}DegreesLatitude_t"/>
 *         &lt;element name="LongitudeDegrees" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}DegreesLongitude_t"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Position_t", namespace = "http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2", propOrder = {
    "latitudeDegrees",
    "longitudeDegrees"
})
public class PositionT {

    @XmlElement(name = "LatitudeDegrees", namespace = "http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2")
    protected double latitudeDegrees;
    @XmlElement(name = "LongitudeDegrees", namespace = "http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2")
    protected double longitudeDegrees;

    /**
     * Gets the value of the latitudeDegrees property.
     * 
     */
    public double getLatitudeDegrees() {
        return latitudeDegrees;
    }

    /**
     * Sets the value of the latitudeDegrees property.
     * 
     */
    public void setLatitudeDegrees(double value) {
        this.latitudeDegrees = value;
    }

    /**
     * Gets the value of the longitudeDegrees property.
     * 
     */
    public double getLongitudeDegrees() {
        return longitudeDegrees;
    }

    /**
     * Sets the value of the longitudeDegrees property.
     * 
     */
    public void setLongitudeDegrees(double value) {
        this.longitudeDegrees = value;
    }

}
