// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud;

import com.pulumi.confluentcloud.inputs.PrivateLinkAccessAwsArgs;
import com.pulumi.confluentcloud.inputs.PrivateLinkAccessAzureArgs;
import com.pulumi.confluentcloud.inputs.PrivateLinkAccessEnvironmentArgs;
import com.pulumi.confluentcloud.inputs.PrivateLinkAccessNetworkArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrivateLinkAccessArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateLinkAccessArgs Empty = new PrivateLinkAccessArgs();

    @Import(name="aws")
    private @Nullable Output<PrivateLinkAccessAwsArgs> aws;

    public Optional<Output<PrivateLinkAccessAwsArgs>> aws() {
        return Optional.ofNullable(this.aws);
    }

    @Import(name="azure")
    private @Nullable Output<PrivateLinkAccessAzureArgs> azure;

    public Optional<Output<PrivateLinkAccessAzureArgs>> azure() {
        return Optional.ofNullable(this.azure);
    }

    /**
     * The name of the Private Link Access.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The name of the Private Link Access.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     * 
     */
    @Import(name="environment", required=true)
    private Output<PrivateLinkAccessEnvironmentArgs> environment;

    /**
     * @return Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     * 
     */
    public Output<PrivateLinkAccessEnvironmentArgs> environment() {
        return this.environment;
    }

    /**
     * Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
     * accounts.
     * 
     */
    @Import(name="network", required=true)
    private Output<PrivateLinkAccessNetworkArgs> network;

    /**
     * @return Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
     * accounts.
     * 
     */
    public Output<PrivateLinkAccessNetworkArgs> network() {
        return this.network;
    }

    private PrivateLinkAccessArgs() {}

    private PrivateLinkAccessArgs(PrivateLinkAccessArgs $) {
        this.aws = $.aws;
        this.azure = $.azure;
        this.displayName = $.displayName;
        this.environment = $.environment;
        this.network = $.network;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateLinkAccessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateLinkAccessArgs $;

        public Builder() {
            $ = new PrivateLinkAccessArgs();
        }

        public Builder(PrivateLinkAccessArgs defaults) {
            $ = new PrivateLinkAccessArgs(Objects.requireNonNull(defaults));
        }

        public Builder aws(@Nullable Output<PrivateLinkAccessAwsArgs> aws) {
            $.aws = aws;
            return this;
        }

        public Builder aws(PrivateLinkAccessAwsArgs aws) {
            return aws(Output.of(aws));
        }

        public Builder azure(@Nullable Output<PrivateLinkAccessAzureArgs> azure) {
            $.azure = azure;
            return this;
        }

        public Builder azure(PrivateLinkAccessAzureArgs azure) {
            return azure(Output.of(azure));
        }

        /**
         * @param displayName The name of the Private Link Access.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The name of the Private Link Access.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param environment Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
         * 
         * @return builder
         * 
         */
        public Builder environment(Output<PrivateLinkAccessEnvironmentArgs> environment) {
            $.environment = environment;
            return this;
        }

        /**
         * @param environment Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
         * 
         * @return builder
         * 
         */
        public Builder environment(PrivateLinkAccessEnvironmentArgs environment) {
            return environment(Output.of(environment));
        }

        /**
         * @param network Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
         * accounts.
         * 
         * @return builder
         * 
         */
        public Builder network(Output<PrivateLinkAccessNetworkArgs> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
         * accounts.
         * 
         * @return builder
         * 
         */
        public Builder network(PrivateLinkAccessNetworkArgs network) {
            return network(Output.of(network));
        }

        public PrivateLinkAccessArgs build() {
            $.environment = Objects.requireNonNull($.environment, "expected parameter 'environment' to be non-null");
            $.network = Objects.requireNonNull($.network, "expected parameter 'network' to be non-null");
            return $;
        }
    }

}
