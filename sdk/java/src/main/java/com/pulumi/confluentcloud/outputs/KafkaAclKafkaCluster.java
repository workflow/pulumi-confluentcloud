// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class KafkaAclKafkaCluster {
    /**
     * @return The ID of the Kafka cluster, for example, `lkc-abc123`.
     * 
     */
    private final String id;

    @CustomType.Constructor
    private KafkaAclKafkaCluster(@CustomType.Parameter("id") String id) {
        this.id = id;
    }

    /**
     * @return The ID of the Kafka cluster, for example, `lkc-abc123`.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KafkaAclKafkaCluster defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(KafkaAclKafkaCluster defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }        public KafkaAclKafkaCluster build() {
            return new KafkaAclKafkaCluster(id);
        }
    }
}