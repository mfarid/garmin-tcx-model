
package guru.springframework.garmin.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Training_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Training_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QuickWorkoutResults" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}QuickWorkout_t" minOccurs="0"/>
 *         &lt;element name="Plan" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Plan_t" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="VirtualPartner" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Training_t", namespace = "http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2", propOrder = {
    "quickWorkoutResults",
    "plan"
})
public class TrainingT {

    @XmlElement(name = "QuickWorkoutResults", namespace = "http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2")
    protected QuickWorkoutT quickWorkoutResults;
    @XmlElement(name = "Plan", namespace = "http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2")
    protected PlanT plan;
    @XmlAttribute(name = "VirtualPartner", required = true)
    protected boolean virtualPartner;

    /**
     * Gets the value of the quickWorkoutResults property.
     * 
     * @return
     *     possible object is
     *     {@link QuickWorkoutT }
     *     
     */
    public QuickWorkoutT getQuickWorkoutResults() {
        return quickWorkoutResults;
    }

    /**
     * Sets the value of the quickWorkoutResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuickWorkoutT }
     *     
     */
    public void setQuickWorkoutResults(QuickWorkoutT value) {
        this.quickWorkoutResults = value;
    }

    /**
     * Gets the value of the plan property.
     * 
     * @return
     *     possible object is
     *     {@link PlanT }
     *     
     */
    public PlanT getPlan() {
        return plan;
    }

    /**
     * Sets the value of the plan property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanT }
     *     
     */
    public void setPlan(PlanT value) {
        this.plan = value;
    }

    /**
     * Gets the value of the virtualPartner property.
     * 
     */
    public boolean isVirtualPartner() {
        return virtualPartner;
    }

    /**
     * Sets the value of the virtualPartner property.
     * 
     */
    public void setVirtualPartner(boolean value) {
        this.virtualPartner = value;
    }

}
