// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PrivateLinkAccessAzure {
    /**
     * @return The Azure subscription ID to enable for the Private Link Access. You can find your Azure subscription ID in the subscription section of your [Microsoft Azure Portal] (https://portal.azure.com/#blade/Microsoft_Azure_Billing/SubscriptionsBlade). Must be a valid **32 character UUID string**.
     * 
     */
    private final String subscription;

    @CustomType.Constructor
    private PrivateLinkAccessAzure(@CustomType.Parameter("subscription") String subscription) {
        this.subscription = subscription;
    }

    /**
     * @return The Azure subscription ID to enable for the Private Link Access. You can find your Azure subscription ID in the subscription section of your [Microsoft Azure Portal] (https://portal.azure.com/#blade/Microsoft_Azure_Billing/SubscriptionsBlade). Must be a valid **32 character UUID string**.
     * 
     */
    public String subscription() {
        return this.subscription;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkAccessAzure defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String subscription;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkAccessAzure defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subscription = defaults.subscription;
        }

        public Builder subscription(String subscription) {
            this.subscription = Objects.requireNonNull(subscription);
            return this;
        }        public PrivateLinkAccessAzure build() {
            return new PrivateLinkAccessAzure(subscription);
        }
    }
}
