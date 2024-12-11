package com.github.qa.shared.component.user.response.dataobjects.postUserReposResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "advanced_security",
    "dependabot_security_updates",
    "secret_scanning",
    "secret_scanning_push_protection",
    "secret_scanning_non_provider_patterns",
    "secret_scanning_ai_detection",
    "secret_scanning_validity_checks",
})
@Data
public class SecurityAndAnalysis {

    @JsonProperty("advanced_security")
    public AdvancedSecurity advancedSecurity;
    /**
     * Enable or disable Dependabot security updates for the repository.
     * 
     */
    @JsonProperty("dependabot_security_updates")
    @JsonPropertyDescription("Enable or disable Dependabot security updates for the repository.")
    public DependabotSecurityUpdates dependabotSecurityUpdates;
    @JsonProperty("secret_scanning")
    public SecretScanning secretScanning;
    @JsonProperty("secret_scanning_push_protection")
    public SecretScanningPushProtection secretScanningPushProtection;
    @JsonProperty("secret_scanning_non_provider_patterns")
    public SecretScanningNonProviderPatterns secretScanningNonProviderPatterns;
    @JsonProperty("secret_scanning_ai_detection")
    public SecretScanningAiDetection secretScanningAiDetection;
    @JsonProperty("secret_scanning_validity_checks")
    public SecretScanningValidityChecks secretScanningValidityChecks;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SecurityAndAnalysis.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("advancedSecurity");
        sb.append('=');
        sb.append(((this.advancedSecurity == null)?"<null>":this.advancedSecurity));
        sb.append(',');
        sb.append("dependabotSecurityUpdates");
        sb.append('=');
        sb.append(((this.dependabotSecurityUpdates == null)?"<null>":this.dependabotSecurityUpdates));
        sb.append(',');
        sb.append("secretScanning");
        sb.append('=');
        sb.append(((this.secretScanning == null)?"<null>":this.secretScanning));
        sb.append(',');
        sb.append("secretScanningPushProtection");
        sb.append('=');
        sb.append(((this.secretScanningPushProtection == null)?"<null>":this.secretScanningPushProtection));
        sb.append(',');
        sb.append("secretScanningNonProviderPatterns");
        sb.append('=');
        sb.append(((this.secretScanningNonProviderPatterns == null)?"<null>":this.secretScanningNonProviderPatterns));
        sb.append(',');
        sb.append("secretScanningAiDetection");
        sb.append('=');
        sb.append(((this.secretScanningAiDetection == null)?"<null>":this.secretScanningAiDetection));
        sb.append(',');
        sb.append("secretScanningValidityChecks");
        sb.append('=');
        sb.append(((this.secretScanningValidityChecks == null)?"<null>":this.secretScanningValidityChecks));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.dependabotSecurityUpdates == null)? 0 :this.dependabotSecurityUpdates.hashCode()));
        result = ((result* 31)+((this.secretScanningPushProtection == null)? 0 :this.secretScanningPushProtection.hashCode()));
        result = ((result* 31)+((this.secretScanningAiDetection == null)? 0 :this.secretScanningAiDetection.hashCode()));
        result = ((result* 31)+((this.secretScanningValidityChecks == null)? 0 :this.secretScanningValidityChecks.hashCode()));
        result = ((result* 31)+((this.advancedSecurity == null)? 0 :this.advancedSecurity.hashCode()));
        result = ((result* 31)+((this.secretScanning == null)? 0 :this.secretScanning.hashCode()));
        result = ((result* 31)+((this.secretScanningNonProviderPatterns == null)? 0 :this.secretScanningNonProviderPatterns.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SecurityAndAnalysis) == false) {
            return false;
        }
        SecurityAndAnalysis rhs = ((SecurityAndAnalysis) other);
        return (((((((this.dependabotSecurityUpdates == rhs.dependabotSecurityUpdates)||((this.dependabotSecurityUpdates!= null)&&this.dependabotSecurityUpdates.equals(rhs.dependabotSecurityUpdates)))&&((this.secretScanningPushProtection == rhs.secretScanningPushProtection)||((this.secretScanningPushProtection!= null)&&this.secretScanningPushProtection.equals(rhs.secretScanningPushProtection))))&&((this.secretScanningAiDetection == rhs.secretScanningAiDetection)||((this.secretScanningAiDetection!= null)&&this.secretScanningAiDetection.equals(rhs.secretScanningAiDetection))))&&((this.secretScanningValidityChecks == rhs.secretScanningValidityChecks)||((this.secretScanningValidityChecks!= null)&&this.secretScanningValidityChecks.equals(rhs.secretScanningValidityChecks)))&&((this.advancedSecurity == rhs.advancedSecurity)||((this.advancedSecurity!= null)&&this.advancedSecurity.equals(rhs.advancedSecurity))))&&((this.secretScanning == rhs.secretScanning)||((this.secretScanning!= null)&&this.secretScanning.equals(rhs.secretScanning))))&&((this.secretScanningNonProviderPatterns == rhs.secretScanningNonProviderPatterns)||((this.secretScanningNonProviderPatterns!= null)&&this.secretScanningNonProviderPatterns.equals(rhs.secretScanningNonProviderPatterns))));
    }

}
