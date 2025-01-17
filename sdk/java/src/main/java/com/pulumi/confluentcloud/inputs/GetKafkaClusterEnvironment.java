// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetKafkaClusterEnvironment extends com.pulumi.resources.InvokeArgs {

    public static final GetKafkaClusterEnvironment Empty = new GetKafkaClusterEnvironment();

    /**
     * The ID of the Environment that the Kafka cluster belongs to, for example, `env-xyz456`.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The ID of the Environment that the Kafka cluster belongs to, for example, `env-xyz456`.
     * 
     */
    public String id() {
        return this.id;
    }

    private GetKafkaClusterEnvironment() {}

    private GetKafkaClusterEnvironment(GetKafkaClusterEnvironment $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetKafkaClusterEnvironment defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetKafkaClusterEnvironment $;

        public Builder() {
            $ = new GetKafkaClusterEnvironment();
        }

        public Builder(GetKafkaClusterEnvironment defaults) {
            $ = new GetKafkaClusterEnvironment(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the Environment that the Kafka cluster belongs to, for example, `env-xyz456`.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetKafkaClusterEnvironment build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
