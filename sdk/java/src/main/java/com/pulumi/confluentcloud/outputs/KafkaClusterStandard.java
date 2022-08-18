// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class KafkaClusterStandard {
    @CustomType.Constructor
    private KafkaClusterStandard() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KafkaClusterStandard defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(KafkaClusterStandard defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public KafkaClusterStandard build() {
            return new KafkaClusterStandard();
        }
    }
}