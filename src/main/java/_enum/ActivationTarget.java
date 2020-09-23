package _enum;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.io.Serializable;

/**
 * Describes configuration common to any Activation Target.
 */

//@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "targetType", visible = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "targetType", visible = true)
public class ActivationTarget  implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("targetId")
    private String targetId;

    @JsonProperty("name")
    private String name;

    @JsonProperty("enabled")
    private Boolean enabled;

    @JsonProperty("targetType")
    private String targetType;

    public ActivationTarget targetId(String targetId) {
        this.targetId = targetId;
        return this;
    }

    /**
     * The unique ID of the activation definition.
     * @return targetId
     */
    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public ActivationTarget name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ActivationTarget enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get enabled
     * @return enabled
     */


    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public ActivationTarget targetType(String targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * Get targetType
     * @return targetType
     */


    public String getTargetType() {
        return targetType;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActivationTarget activationTarget = (ActivationTarget) o;
        return Objects.equals(this.targetId, activationTarget.targetId) &&
                Objects.equals(this.name, activationTarget.name) &&
                Objects.equals(this.enabled, activationTarget.enabled) &&
                Objects.equals(this.targetType, activationTarget.targetType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetId, name, enabled, targetType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActivationTarget {\n");

        sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}


