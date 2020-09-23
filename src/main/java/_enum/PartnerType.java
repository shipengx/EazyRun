package _enum;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;

/**
 * Activation Partner types in CDP.
 *
 * @author Siddharth Sharma
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum PartnerType {
    MarketingCloud("Salesforce Marketing Cloud"),
    S3("Amazon S3", true);

    private final String value;
    private final boolean crossAccount;

    PartnerType(String value) {
        this(value, false);
    }

    PartnerType(String value, boolean crossAccount) {
        this.value = value;
        this.crossAccount = crossAccount;
    }

    public String getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public boolean isCrossAccount() {
        return crossAccount;
    }

    /**
     * Get partner type based on name stored in core.
     *
     * @param name name of partner type in core
     * @return partner type enum
     */
    public static PartnerType getPartnerType(String name) {
        return Arrays.stream(PartnerType.values())
                .filter(partnerType -> partnerType.getValue().equals(name))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}

