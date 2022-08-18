// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.confluentcloud.outputs.GetPeeringAw;
import com.pulumi.confluentcloud.outputs.GetPeeringAzure;
import com.pulumi.confluentcloud.outputs.GetPeeringEnvironment;
import com.pulumi.confluentcloud.outputs.GetPeeringGcp;
import com.pulumi.confluentcloud.outputs.GetPeeringNetwork;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetPeeringResult {
    /**
     * @return (Optional Configuration Block) The AWS-specific Peering details if available. It supports the following:
     * 
     */
    private final List<GetPeeringAw> aws;
    /**
     * @return (Optional Configuration Block) The Azure-specific Peering details if available. It supports the following:
     * 
     */
    private final List<GetPeeringAzure> azures;
    /**
     * @return (Optional String) The name of the Peering.
     * - `environment` (Required Configuration Block) supports the following:
     * 
     */
    private final String displayName;
    private final GetPeeringEnvironment environment;
    /**
     * @return (Optional Configuration Block) The Azure-specific Peering details if available. It supports the following:
     * 
     */
    private final List<GetPeeringGcp> gcps;
    /**
     * @return (Required String) The ID of the Network that the Peering belongs to, for example, `n-abc123`.
     * 
     */
    private final String id;
    private final List<GetPeeringNetwork> networks;

    @CustomType.Constructor
    private GetPeeringResult(
        @CustomType.Parameter("aws") List<GetPeeringAw> aws,
        @CustomType.Parameter("azures") List<GetPeeringAzure> azures,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("environment") GetPeeringEnvironment environment,
        @CustomType.Parameter("gcps") List<GetPeeringGcp> gcps,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("networks") List<GetPeeringNetwork> networks) {
        this.aws = aws;
        this.azures = azures;
        this.displayName = displayName;
        this.environment = environment;
        this.gcps = gcps;
        this.id = id;
        this.networks = networks;
    }

    /**
     * @return (Optional Configuration Block) The AWS-specific Peering details if available. It supports the following:
     * 
     */
    public List<GetPeeringAw> aws() {
        return this.aws;
    }
    /**
     * @return (Optional Configuration Block) The Azure-specific Peering details if available. It supports the following:
     * 
     */
    public List<GetPeeringAzure> azures() {
        return this.azures;
    }
    /**
     * @return (Optional String) The name of the Peering.
     * - `environment` (Required Configuration Block) supports the following:
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    public GetPeeringEnvironment environment() {
        return this.environment;
    }
    /**
     * @return (Optional Configuration Block) The Azure-specific Peering details if available. It supports the following:
     * 
     */
    public List<GetPeeringGcp> gcps() {
        return this.gcps;
    }
    /**
     * @return (Required String) The ID of the Network that the Peering belongs to, for example, `n-abc123`.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<GetPeeringNetwork> networks() {
        return this.networks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPeeringResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetPeeringAw> aws;
        private List<GetPeeringAzure> azures;
        private String displayName;
        private GetPeeringEnvironment environment;
        private List<GetPeeringGcp> gcps;
        private String id;
        private List<GetPeeringNetwork> networks;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPeeringResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aws = defaults.aws;
    	      this.azures = defaults.azures;
    	      this.displayName = defaults.displayName;
    	      this.environment = defaults.environment;
    	      this.gcps = defaults.gcps;
    	      this.id = defaults.id;
    	      this.networks = defaults.networks;
        }

        public Builder aws(List<GetPeeringAw> aws) {
            this.aws = Objects.requireNonNull(aws);
            return this;
        }
        public Builder aws(GetPeeringAw... aws) {
            return aws(List.of(aws));
        }
        public Builder azures(List<GetPeeringAzure> azures) {
            this.azures = Objects.requireNonNull(azures);
            return this;
        }
        public Builder azures(GetPeeringAzure... azures) {
            return azures(List.of(azures));
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder environment(GetPeeringEnvironment environment) {
            this.environment = Objects.requireNonNull(environment);
            return this;
        }
        public Builder gcps(List<GetPeeringGcp> gcps) {
            this.gcps = Objects.requireNonNull(gcps);
            return this;
        }
        public Builder gcps(GetPeeringGcp... gcps) {
            return gcps(List.of(gcps));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder networks(List<GetPeeringNetwork> networks) {
            this.networks = Objects.requireNonNull(networks);
            return this;
        }
        public Builder networks(GetPeeringNetwork... networks) {
            return networks(List.of(networks));
        }        public GetPeeringResult build() {
            return new GetPeeringResult(aws, azures, displayName, environment, gcps, id, networks);
        }
    }
}