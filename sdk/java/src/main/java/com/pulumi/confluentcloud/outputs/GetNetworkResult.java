// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.confluentcloud.outputs.GetNetworkAw;
import com.pulumi.confluentcloud.outputs.GetNetworkAzure;
import com.pulumi.confluentcloud.outputs.GetNetworkEnvironment;
import com.pulumi.confluentcloud.outputs.GetNetworkGcp;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetNetworkResult {
    /**
     * @return (Optional Configuration Block) The AWS-specific network details if available. It supports the following:
     * 
     */
    private final List<GetNetworkAw> aws;
    /**
     * @return (Optional Configuration Block) The Azure-specific network details if available. It supports the following:
     * 
     */
    private final List<GetNetworkAzure> azures;
    /**
     * @return (Required String) The IPv4 CIDR block to used for the network. Must be `/16`. Required for VPC peering and AWS TransitGateway.
     * 
     */
    private final String cidr;
    /**
     * @return (Required String) The cloud service provider in which the network exists. Accepted values are: `AWS`, `AZURE`, and `GCP`.
     * 
     */
    private final String cloud;
    /**
     * @return (Required List of String) The list of connection types that may be used with the network. Accepted connection types are: `PEERING`, `TRANSITGATEWAY`, and `PRIVATELINK`.
     * 
     */
    private final List<String> connectionTypes;
    /**
     * @return (Required String) The name of the Network.
     * 
     */
    private final String displayName;
    private final String dnsDomain;
    private final GetNetworkEnvironment environment;
    /**
     * @return (Optional Configuration Block) The GCP-specific network details if available. It supports the following:
     * 
     */
    private final List<GetNetworkGcp> gcps;
    /**
     * @return (Required String) The ID of the Network, for example, `n-abc123`.
     * 
     */
    private final String id;
    /**
     * @return (Required String) The cloud provider region where the network exists.
     * 
     */
    private final String region;
    /**
     * @return (Required String) The Confluent Resource Name of the Network.
     * 
     */
    private final String resourceName;
    private final Map<String,String> zonalSubdomains;
    /**
     * @return (Optional List of String) The 3 availability zones for this network. They can optionally be specified for AWS networks
     * used with Private Link. Otherwise, they are automatically chosen by Confluent Cloud.
     * On AWS, zones are AWS [AZ IDs](https://docs.aws.amazon.com/ram/latest/userguide/working-with-az-ids.html), for example, `use1-az3`.
     * On GCP, zones are GCP [zones](https://cloud.google.com/compute/docs/regions-zones), for example, `us-central1-c`.
     * On Azure, zones are Confluent-chosen names (for example, `1`, `2`, `3`) since Azure does not have universal zone identifiers.
     * 
     */
    private final List<String> zones;

    @CustomType.Constructor
    private GetNetworkResult(
        @CustomType.Parameter("aws") List<GetNetworkAw> aws,
        @CustomType.Parameter("azures") List<GetNetworkAzure> azures,
        @CustomType.Parameter("cidr") String cidr,
        @CustomType.Parameter("cloud") String cloud,
        @CustomType.Parameter("connectionTypes") List<String> connectionTypes,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("dnsDomain") String dnsDomain,
        @CustomType.Parameter("environment") GetNetworkEnvironment environment,
        @CustomType.Parameter("gcps") List<GetNetworkGcp> gcps,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("region") String region,
        @CustomType.Parameter("resourceName") String resourceName,
        @CustomType.Parameter("zonalSubdomains") Map<String,String> zonalSubdomains,
        @CustomType.Parameter("zones") List<String> zones) {
        this.aws = aws;
        this.azures = azures;
        this.cidr = cidr;
        this.cloud = cloud;
        this.connectionTypes = connectionTypes;
        this.displayName = displayName;
        this.dnsDomain = dnsDomain;
        this.environment = environment;
        this.gcps = gcps;
        this.id = id;
        this.region = region;
        this.resourceName = resourceName;
        this.zonalSubdomains = zonalSubdomains;
        this.zones = zones;
    }

    /**
     * @return (Optional Configuration Block) The AWS-specific network details if available. It supports the following:
     * 
     */
    public List<GetNetworkAw> aws() {
        return this.aws;
    }
    /**
     * @return (Optional Configuration Block) The Azure-specific network details if available. It supports the following:
     * 
     */
    public List<GetNetworkAzure> azures() {
        return this.azures;
    }
    /**
     * @return (Required String) The IPv4 CIDR block to used for the network. Must be `/16`. Required for VPC peering and AWS TransitGateway.
     * 
     */
    public String cidr() {
        return this.cidr;
    }
    /**
     * @return (Required String) The cloud service provider in which the network exists. Accepted values are: `AWS`, `AZURE`, and `GCP`.
     * 
     */
    public String cloud() {
        return this.cloud;
    }
    /**
     * @return (Required List of String) The list of connection types that may be used with the network. Accepted connection types are: `PEERING`, `TRANSITGATEWAY`, and `PRIVATELINK`.
     * 
     */
    public List<String> connectionTypes() {
        return this.connectionTypes;
    }
    /**
     * @return (Required String) The name of the Network.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    public String dnsDomain() {
        return this.dnsDomain;
    }
    public GetNetworkEnvironment environment() {
        return this.environment;
    }
    /**
     * @return (Optional Configuration Block) The GCP-specific network details if available. It supports the following:
     * 
     */
    public List<GetNetworkGcp> gcps() {
        return this.gcps;
    }
    /**
     * @return (Required String) The ID of the Network, for example, `n-abc123`.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return (Required String) The cloud provider region where the network exists.
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return (Required String) The Confluent Resource Name of the Network.
     * 
     */
    public String resourceName() {
        return this.resourceName;
    }
    public Map<String,String> zonalSubdomains() {
        return this.zonalSubdomains;
    }
    /**
     * @return (Optional List of String) The 3 availability zones for this network. They can optionally be specified for AWS networks
     * used with Private Link. Otherwise, they are automatically chosen by Confluent Cloud.
     * On AWS, zones are AWS [AZ IDs](https://docs.aws.amazon.com/ram/latest/userguide/working-with-az-ids.html), for example, `use1-az3`.
     * On GCP, zones are GCP [zones](https://cloud.google.com/compute/docs/regions-zones), for example, `us-central1-c`.
     * On Azure, zones are Confluent-chosen names (for example, `1`, `2`, `3`) since Azure does not have universal zone identifiers.
     * 
     */
    public List<String> zones() {
        return this.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetNetworkAw> aws;
        private List<GetNetworkAzure> azures;
        private String cidr;
        private String cloud;
        private List<String> connectionTypes;
        private String displayName;
        private String dnsDomain;
        private GetNetworkEnvironment environment;
        private List<GetNetworkGcp> gcps;
        private String id;
        private String region;
        private String resourceName;
        private Map<String,String> zonalSubdomains;
        private List<String> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNetworkResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aws = defaults.aws;
    	      this.azures = defaults.azures;
    	      this.cidr = defaults.cidr;
    	      this.cloud = defaults.cloud;
    	      this.connectionTypes = defaults.connectionTypes;
    	      this.displayName = defaults.displayName;
    	      this.dnsDomain = defaults.dnsDomain;
    	      this.environment = defaults.environment;
    	      this.gcps = defaults.gcps;
    	      this.id = defaults.id;
    	      this.region = defaults.region;
    	      this.resourceName = defaults.resourceName;
    	      this.zonalSubdomains = defaults.zonalSubdomains;
    	      this.zones = defaults.zones;
        }

        public Builder aws(List<GetNetworkAw> aws) {
            this.aws = Objects.requireNonNull(aws);
            return this;
        }
        public Builder aws(GetNetworkAw... aws) {
            return aws(List.of(aws));
        }
        public Builder azures(List<GetNetworkAzure> azures) {
            this.azures = Objects.requireNonNull(azures);
            return this;
        }
        public Builder azures(GetNetworkAzure... azures) {
            return azures(List.of(azures));
        }
        public Builder cidr(String cidr) {
            this.cidr = Objects.requireNonNull(cidr);
            return this;
        }
        public Builder cloud(String cloud) {
            this.cloud = Objects.requireNonNull(cloud);
            return this;
        }
        public Builder connectionTypes(List<String> connectionTypes) {
            this.connectionTypes = Objects.requireNonNull(connectionTypes);
            return this;
        }
        public Builder connectionTypes(String... connectionTypes) {
            return connectionTypes(List.of(connectionTypes));
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder dnsDomain(String dnsDomain) {
            this.dnsDomain = Objects.requireNonNull(dnsDomain);
            return this;
        }
        public Builder environment(GetNetworkEnvironment environment) {
            this.environment = Objects.requireNonNull(environment);
            return this;
        }
        public Builder gcps(List<GetNetworkGcp> gcps) {
            this.gcps = Objects.requireNonNull(gcps);
            return this;
        }
        public Builder gcps(GetNetworkGcp... gcps) {
            return gcps(List.of(gcps));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder resourceName(String resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }
        public Builder zonalSubdomains(Map<String,String> zonalSubdomains) {
            this.zonalSubdomains = Objects.requireNonNull(zonalSubdomains);
            return this;
        }
        public Builder zones(List<String> zones) {
            this.zones = Objects.requireNonNull(zones);
            return this;
        }
        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }        public GetNetworkResult build() {
            return new GetNetworkResult(aws, azures, cidr, cloud, connectionTypes, displayName, dnsDomain, environment, gcps, id, region, resourceName, zonalSubdomains, zones);
        }
    }
}
