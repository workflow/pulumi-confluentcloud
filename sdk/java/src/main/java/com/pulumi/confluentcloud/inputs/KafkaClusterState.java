// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.confluentcloud.inputs.KafkaClusterBasicArgs;
import com.pulumi.confluentcloud.inputs.KafkaClusterDedicatedArgs;
import com.pulumi.confluentcloud.inputs.KafkaClusterEnvironmentArgs;
import com.pulumi.confluentcloud.inputs.KafkaClusterNetworkArgs;
import com.pulumi.confluentcloud.inputs.KafkaClusterStandardArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KafkaClusterState extends com.pulumi.resources.ResourceArgs {

    public static final KafkaClusterState Empty = new KafkaClusterState();

    /**
     * (Required String) An API Version of the schema version of the Kafka cluster, for example, `cmk/v2`.
     * 
     */
    @Import(name="apiVersion")
    private @Nullable Output<String> apiVersion;

    /**
     * @return (Required String) An API Version of the schema version of the Kafka cluster, for example, `cmk/v2`.
     * 
     */
    public Optional<Output<String>> apiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }

    /**
     * The availability zone configuration of the Kafka cluster. Accepted values are: `SINGLE_ZONE` and `MULTI_ZONE`.
     * 
     */
    @Import(name="availability")
    private @Nullable Output<String> availability;

    /**
     * @return The availability zone configuration of the Kafka cluster. Accepted values are: `SINGLE_ZONE` and `MULTI_ZONE`.
     * 
     */
    public Optional<Output<String>> availability() {
        return Optional.ofNullable(this.availability);
    }

    /**
     * The configuration of the Basic Kafka cluster.
     * 
     */
    @Import(name="basics")
    private @Nullable Output<List<KafkaClusterBasicArgs>> basics;

    /**
     * @return The configuration of the Basic Kafka cluster.
     * 
     */
    public Optional<Output<List<KafkaClusterBasicArgs>>> basics() {
        return Optional.ofNullable(this.basics);
    }

    /**
     * (Required String) The bootstrap endpoint used by Kafka clients to connect to the Kafka cluster. (e.g., `SASL_SSL://pkc-00000.us-central1.gcp.confluent.cloud:9092`).
     * 
     */
    @Import(name="bootstrapEndpoint")
    private @Nullable Output<String> bootstrapEndpoint;

    /**
     * @return (Required String) The bootstrap endpoint used by Kafka clients to connect to the Kafka cluster. (e.g., `SASL_SSL://pkc-00000.us-central1.gcp.confluent.cloud:9092`).
     * 
     */
    public Optional<Output<String>> bootstrapEndpoint() {
        return Optional.ofNullable(this.bootstrapEndpoint);
    }

    /**
     * The cloud service provider that runs the Kafka cluster. Accepted values are: `AWS`, `AZURE`, and `GCP`.
     * 
     */
    @Import(name="cloud")
    private @Nullable Output<String> cloud;

    /**
     * @return The cloud service provider that runs the Kafka cluster. Accepted values are: `AWS`, `AZURE`, and `GCP`.
     * 
     */
    public Optional<Output<String>> cloud() {
        return Optional.ofNullable(this.cloud);
    }

    @Import(name="dedicated")
    private @Nullable Output<KafkaClusterDedicatedArgs> dedicated;

    public Optional<Output<KafkaClusterDedicatedArgs>> dedicated() {
        return Optional.ofNullable(this.dedicated);
    }

    /**
     * The name of the Kafka cluster.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The name of the Kafka cluster.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     * 
     */
    @Import(name="environment")
    private @Nullable Output<KafkaClusterEnvironmentArgs> environment;

    /**
     * @return Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     * 
     */
    public Optional<Output<KafkaClusterEnvironmentArgs>> environment() {
        return Optional.ofNullable(this.environment);
    }

    /**
     * (Required String) A kind of the Kafka cluster, for example, `Cluster`.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return (Required String) A kind of the Kafka cluster, for example, `Cluster`.
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
     * accounts.
     * 
     */
    @Import(name="network")
    private @Nullable Output<KafkaClusterNetworkArgs> network;

    /**
     * @return Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
     * accounts.
     * 
     */
    public Optional<Output<KafkaClusterNetworkArgs>> network() {
        return Optional.ofNullable(this.network);
    }

    /**
     * (Required String) The Confluent Resource Name of the Kafka cluster, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123/cloud-cluster=lkc-abc123`.
     * 
     */
    @Import(name="rbacCrn")
    private @Nullable Output<String> rbacCrn;

    /**
     * @return (Required String) The Confluent Resource Name of the Kafka cluster, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123/cloud-cluster=lkc-abc123`.
     * 
     */
    public Optional<Output<String>> rbacCrn() {
        return Optional.ofNullable(this.rbacCrn);
    }

    /**
     * The cloud service provider region where the Kafka cluster is running, for example, `us-west-2`. See [Cloud Providers and Regions](https://docs.confluent.io/cloud/current/clusters/regions.html#cloud-providers-and-regions) for a full list of options for AWS, Azure, and GCP.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The cloud service provider region where the Kafka cluster is running, for example, `us-west-2`. See [Cloud Providers and Regions](https://docs.confluent.io/cloud/current/clusters/regions.html#cloud-providers-and-regions) for a full list of options for AWS, Azure, and GCP.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * (Required String) The REST endpoint of the Kafka cluster (e.g., `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
     * 
     */
    @Import(name="restEndpoint")
    private @Nullable Output<String> restEndpoint;

    /**
     * @return (Required String) The REST endpoint of the Kafka cluster (e.g., `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
     * 
     */
    public Optional<Output<String>> restEndpoint() {
        return Optional.ofNullable(this.restEndpoint);
    }

    /**
     * The configuration of the Standard Kafka cluster.
     * 
     */
    @Import(name="standards")
    private @Nullable Output<List<KafkaClusterStandardArgs>> standards;

    /**
     * @return The configuration of the Standard Kafka cluster.
     * 
     */
    public Optional<Output<List<KafkaClusterStandardArgs>>> standards() {
        return Optional.ofNullable(this.standards);
    }

    private KafkaClusterState() {}

    private KafkaClusterState(KafkaClusterState $) {
        this.apiVersion = $.apiVersion;
        this.availability = $.availability;
        this.basics = $.basics;
        this.bootstrapEndpoint = $.bootstrapEndpoint;
        this.cloud = $.cloud;
        this.dedicated = $.dedicated;
        this.displayName = $.displayName;
        this.environment = $.environment;
        this.kind = $.kind;
        this.network = $.network;
        this.rbacCrn = $.rbacCrn;
        this.region = $.region;
        this.restEndpoint = $.restEndpoint;
        this.standards = $.standards;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KafkaClusterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KafkaClusterState $;

        public Builder() {
            $ = new KafkaClusterState();
        }

        public Builder(KafkaClusterState defaults) {
            $ = new KafkaClusterState(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiVersion (Required String) An API Version of the schema version of the Kafka cluster, for example, `cmk/v2`.
         * 
         * @return builder
         * 
         */
        public Builder apiVersion(@Nullable Output<String> apiVersion) {
            $.apiVersion = apiVersion;
            return this;
        }

        /**
         * @param apiVersion (Required String) An API Version of the schema version of the Kafka cluster, for example, `cmk/v2`.
         * 
         * @return builder
         * 
         */
        public Builder apiVersion(String apiVersion) {
            return apiVersion(Output.of(apiVersion));
        }

        /**
         * @param availability The availability zone configuration of the Kafka cluster. Accepted values are: `SINGLE_ZONE` and `MULTI_ZONE`.
         * 
         * @return builder
         * 
         */
        public Builder availability(@Nullable Output<String> availability) {
            $.availability = availability;
            return this;
        }

        /**
         * @param availability The availability zone configuration of the Kafka cluster. Accepted values are: `SINGLE_ZONE` and `MULTI_ZONE`.
         * 
         * @return builder
         * 
         */
        public Builder availability(String availability) {
            return availability(Output.of(availability));
        }

        /**
         * @param basics The configuration of the Basic Kafka cluster.
         * 
         * @return builder
         * 
         */
        public Builder basics(@Nullable Output<List<KafkaClusterBasicArgs>> basics) {
            $.basics = basics;
            return this;
        }

        /**
         * @param basics The configuration of the Basic Kafka cluster.
         * 
         * @return builder
         * 
         */
        public Builder basics(List<KafkaClusterBasicArgs> basics) {
            return basics(Output.of(basics));
        }

        /**
         * @param basics The configuration of the Basic Kafka cluster.
         * 
         * @return builder
         * 
         */
        public Builder basics(KafkaClusterBasicArgs... basics) {
            return basics(List.of(basics));
        }

        /**
         * @param bootstrapEndpoint (Required String) The bootstrap endpoint used by Kafka clients to connect to the Kafka cluster. (e.g., `SASL_SSL://pkc-00000.us-central1.gcp.confluent.cloud:9092`).
         * 
         * @return builder
         * 
         */
        public Builder bootstrapEndpoint(@Nullable Output<String> bootstrapEndpoint) {
            $.bootstrapEndpoint = bootstrapEndpoint;
            return this;
        }

        /**
         * @param bootstrapEndpoint (Required String) The bootstrap endpoint used by Kafka clients to connect to the Kafka cluster. (e.g., `SASL_SSL://pkc-00000.us-central1.gcp.confluent.cloud:9092`).
         * 
         * @return builder
         * 
         */
        public Builder bootstrapEndpoint(String bootstrapEndpoint) {
            return bootstrapEndpoint(Output.of(bootstrapEndpoint));
        }

        /**
         * @param cloud The cloud service provider that runs the Kafka cluster. Accepted values are: `AWS`, `AZURE`, and `GCP`.
         * 
         * @return builder
         * 
         */
        public Builder cloud(@Nullable Output<String> cloud) {
            $.cloud = cloud;
            return this;
        }

        /**
         * @param cloud The cloud service provider that runs the Kafka cluster. Accepted values are: `AWS`, `AZURE`, and `GCP`.
         * 
         * @return builder
         * 
         */
        public Builder cloud(String cloud) {
            return cloud(Output.of(cloud));
        }

        public Builder dedicated(@Nullable Output<KafkaClusterDedicatedArgs> dedicated) {
            $.dedicated = dedicated;
            return this;
        }

        public Builder dedicated(KafkaClusterDedicatedArgs dedicated) {
            return dedicated(Output.of(dedicated));
        }

        /**
         * @param displayName The name of the Kafka cluster.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The name of the Kafka cluster.
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
        public Builder environment(@Nullable Output<KafkaClusterEnvironmentArgs> environment) {
            $.environment = environment;
            return this;
        }

        /**
         * @param environment Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
         * 
         * @return builder
         * 
         */
        public Builder environment(KafkaClusterEnvironmentArgs environment) {
            return environment(Output.of(environment));
        }

        /**
         * @param kind (Required String) A kind of the Kafka cluster, for example, `Cluster`.
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind (Required String) A kind of the Kafka cluster, for example, `Cluster`.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param network Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
         * accounts.
         * 
         * @return builder
         * 
         */
        public Builder network(@Nullable Output<KafkaClusterNetworkArgs> network) {
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
        public Builder network(KafkaClusterNetworkArgs network) {
            return network(Output.of(network));
        }

        /**
         * @param rbacCrn (Required String) The Confluent Resource Name of the Kafka cluster, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123/cloud-cluster=lkc-abc123`.
         * 
         * @return builder
         * 
         */
        public Builder rbacCrn(@Nullable Output<String> rbacCrn) {
            $.rbacCrn = rbacCrn;
            return this;
        }

        /**
         * @param rbacCrn (Required String) The Confluent Resource Name of the Kafka cluster, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123/cloud-cluster=lkc-abc123`.
         * 
         * @return builder
         * 
         */
        public Builder rbacCrn(String rbacCrn) {
            return rbacCrn(Output.of(rbacCrn));
        }

        /**
         * @param region The cloud service provider region where the Kafka cluster is running, for example, `us-west-2`. See [Cloud Providers and Regions](https://docs.confluent.io/cloud/current/clusters/regions.html#cloud-providers-and-regions) for a full list of options for AWS, Azure, and GCP.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The cloud service provider region where the Kafka cluster is running, for example, `us-west-2`. See [Cloud Providers and Regions](https://docs.confluent.io/cloud/current/clusters/regions.html#cloud-providers-and-regions) for a full list of options for AWS, Azure, and GCP.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param restEndpoint (Required String) The REST endpoint of the Kafka cluster (e.g., `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
         * 
         * @return builder
         * 
         */
        public Builder restEndpoint(@Nullable Output<String> restEndpoint) {
            $.restEndpoint = restEndpoint;
            return this;
        }

        /**
         * @param restEndpoint (Required String) The REST endpoint of the Kafka cluster (e.g., `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
         * 
         * @return builder
         * 
         */
        public Builder restEndpoint(String restEndpoint) {
            return restEndpoint(Output.of(restEndpoint));
        }

        /**
         * @param standards The configuration of the Standard Kafka cluster.
         * 
         * @return builder
         * 
         */
        public Builder standards(@Nullable Output<List<KafkaClusterStandardArgs>> standards) {
            $.standards = standards;
            return this;
        }

        /**
         * @param standards The configuration of the Standard Kafka cluster.
         * 
         * @return builder
         * 
         */
        public Builder standards(List<KafkaClusterStandardArgs> standards) {
            return standards(Output.of(standards));
        }

        /**
         * @param standards The configuration of the Standard Kafka cluster.
         * 
         * @return builder
         * 
         */
        public Builder standards(KafkaClusterStandardArgs... standards) {
            return standards(List.of(standards));
        }

        public KafkaClusterState build() {
            return $;
        }
    }

}
