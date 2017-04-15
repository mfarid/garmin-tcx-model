
package guru.springframework.garmin.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NextSport_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NextSport_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Transition" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}ActivityLap_t" minOccurs="0"/>
 *         &lt;element name="Activity" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Activity_t"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NextSport_t", namespace = "http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2", propOrder = {
    "transition",
    "activity"
})
public class NextSportT {

    @XmlElement(name = "Transition", namespace = "http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2")
    protected ActivityLapT transition;
    @XmlElement(name = "Activity", namespace = "http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2", required = true)
    protected ActivityT activity;

    /**
     * Gets the value of the transition property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityLapT }
     *     
     */
    public ActivityLapT getTransition() {
        return transition;
    }

    /**
     * Sets the value of the transition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityLapT }
     *     
     */
    public void setTransition(ActivityLapT value) {
        this.transition = value;
    }

    /**
     * Gets the value of the activity property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityT }
     *     
     */
    public ActivityT getActivity() {
        return activity;
    }

    /**
     * Sets the value of the activity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityT }
     *     
     */
    public void setActivity(ActivityT value) {
        this.activity = value;
    }

}
