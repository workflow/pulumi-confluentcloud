// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetPeeringAw {
    /**
     * @return (Required String) The AWS Account ID of the peer VPC owner. You can find your AWS Account ID [here](https://console.aws.amazon.com/billing/home?#/account) under **My Account** section of the AWS Management Console. Must be a **12 character string**.
     * 
     */
    private final String account;
    /**
     * @return (Required String) The region of the Azure peer VNet.
     * 
     */
    private final String customerRegion;
    /**
     * @return (Required String) The AWS VPC CIDR blocks or subsets. This must be from the supported CIDR blocks and must not overlap with your Confluent Cloud CIDR block or any other network peering connection VPC CIDR (learn more about the requirements [here](https://docs.confluent.io/cloud/current/networking/peering/aws-peering.html#vpc-peering-on-aws)). You can find AWS VPC CIDR [here](https://console.aws.amazon.com/vpc/) under **Your VPCs &gt; Target VPC &gt; Details** section of the AWS Management Console.
     * 
     */
    private final List<String> routes;
    /**
     * @return (Required String) The AWS VPC ID of the peer VPC that you&#39;re peering with Confluent Cloud. You can find your AWS VPC ID [here](https://console.aws.amazon.com/vpc/) under **Your VPCs** section of the AWS Management Console. Must start with `vpc-`.
     * 
     */
    private final String vpc;

    @CustomType.Constructor
    private GetPeeringAw(
        @CustomType.Parameter("account") String account,
        @CustomType.Parameter("customerRegion") String customerRegion,
        @CustomType.Parameter("routes") List<String> routes,
        @CustomType.Parameter("vpc") String vpc) {
        this.account = account;
        this.customerRegion = customerRegion;
        this.routes = routes;
        this.vpc = vpc;
    }

    /**
     * @return (Required String) The AWS Account ID of the peer VPC owner. You can find your AWS Account ID [here](https://console.aws.amazon.com/billing/home?#/account) under **My Account** section of the AWS Management Console. Must be a **12 character string**.
     * 
     */
    public String account() {
        return this.account;
    }
    /**
     * @return (Required String) The region of the Azure peer VNet.
     * 
     */
    public String customerRegion() {
        return this.customerRegion;
    }
    /**
     * @return (Required String) The AWS VPC CIDR blocks or subsets. This must be from the supported CIDR blocks and must not overlap with your Confluent Cloud CIDR block or any other network peering connection VPC CIDR (learn more about the requirements [here](https://docs.confluent.io/cloud/current/networking/peering/aws-peering.html#vpc-peering-on-aws)). You can find AWS VPC CIDR [here](https://console.aws.amazon.com/vpc/) under **Your VPCs &gt; Target VPC &gt; Details** section of the AWS Management Console.
     * 
     */
    public List<String> routes() {
        return this.routes;
    }
    /**
     * @return (Required String) The AWS VPC ID of the peer VPC that you&#39;re peering with Confluent Cloud. You can find your AWS VPC ID [here](https://console.aws.amazon.com/vpc/) under **Your VPCs** section of the AWS Management Console. Must start with `vpc-`.
     * 
     */
    public String vpc() {
        return this.vpc;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPeeringAw defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String account;
        private String customerRegion;
        private List<String> routes;
        private String vpc;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPeeringAw defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.account = defaults.account;
    	      this.customerRegion = defaults.customerRegion;
    	      this.routes = defaults.routes;
    	      this.vpc = defaults.vpc;
        }

        public Builder account(String account) {
            this.account = Objects.requireNonNull(account);
            return this;
        }
        public Builder customerRegion(String customerRegion) {
            this.customerRegion = Objects.requireNonNull(customerRegion);
            return this;
        }
        public Builder routes(List<String> routes) {
            this.routes = Objects.requireNonNull(routes);
            return this;
        }
        public Builder routes(String... routes) {
            return routes(List.of(routes));
        }
        public Builder vpc(String vpc) {
            this.vpc = Objects.requireNonNull(vpc);
            return this;
        }        public GetPeeringAw build() {
            return new GetPeeringAw(account, customerRegion, routes, vpc);
        }
    }
}
