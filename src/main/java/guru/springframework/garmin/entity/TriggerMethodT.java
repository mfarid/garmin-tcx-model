
package guru.springframework.garmin.entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TriggerMethod_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TriggerMethod_t">
 *   &lt;restriction base="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Token_t">
 *     &lt;enumeration value="Manual"/>
 *     &lt;enumeration value="Distance"/>
 *     &lt;enumeration value="Location"/>
 *     &lt;enumeration value="Time"/>
 *     &lt;enumeration value="HeartRate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TriggerMethod_t", namespace = "http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2")
@XmlEnum
public enum TriggerMethodT {

    @XmlEnumValue("Manual")
    MANUAL("Manual"),
    @XmlEnumValue("Distance")
    DISTANCE("Distance"),
    @XmlEnumValue("Location")
    LOCATION("Location"),
    @XmlEnumValue("Time")
    TIME("Time"),
    @XmlEnumValue("HeartRate")
    HEART_RATE("HeartRate");
    private final String value;

    TriggerMethodT(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TriggerMethodT fromValue(String v) {
        for (TriggerMethodT c: TriggerMethodT.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
