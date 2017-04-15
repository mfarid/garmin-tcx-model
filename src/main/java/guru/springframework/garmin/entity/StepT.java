
package guru.springframework.garmin.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Step_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Step_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}AbstractStep_t">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}RestrictedToken_t" minOccurs="0"/>
 *         &lt;element name="Duration" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Duration_t"/>
 *         &lt;element name="Intensity" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Intensity_t"/>
 *         &lt;element name="Target" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Target_t"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Step_t", namespace = "http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2", propOrder = {
    "name",
    "duration",
    "intensity",
    "target"
})
public class StepT
    extends AbstractStepT
{

    @XmlElement(name = "Name", namespace = "http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String name;
    @XmlElement(name = "Duration", namespace = "http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2", required = true)
    protected DurationT duration;
    @XmlElement(name = "Intensity", namespace = "http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2", required = true)
    @XmlSchemaType(name = "token")
    protected IntensityT intensity;
    @XmlElement(name = "Target", namespace = "http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2", required = true)
    protected TargetT target;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link DurationT }
     *     
     */
    public DurationT getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationT }
     *     
     */
    public void setDuration(DurationT value) {
        this.duration = value;
    }

    /**
     * Gets the value of the intensity property.
     * 
     * @return
     *     possible object is
     *     {@link IntensityT }
     *     
     */
    public IntensityT getIntensity() {
        return intensity;
    }

    /**
     * Sets the value of the intensity property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntensityT }
     *     
     */
    public void setIntensity(IntensityT value) {
        this.intensity = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link TargetT }
     *     
     */
    public TargetT getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetT }
     *     
     */
    public void setTarget(TargetT value) {
        this.target = value;
    }

}