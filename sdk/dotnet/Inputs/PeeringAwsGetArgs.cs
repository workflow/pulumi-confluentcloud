// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Inputs
{

    public sealed class PeeringAwsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The AWS Account ID of the peer VPC owner. You can find your AWS Account ID [here](https://console.aws.amazon.com/billing/home?#/account) under **My Account** section of the AWS Management Console. Must be a **12 character string**.
        /// </summary>
        [Input("account", required: true)]
        public Input<string> Account { get; set; } = null!;

        /// <summary>
        /// The region of the Azure peer VNet.
        /// </summary>
        [Input("customerRegion", required: true)]
        public Input<string> CustomerRegion { get; set; } = null!;

        [Input("routes", required: true)]
        private InputList<string>? _routes;

        /// <summary>
        /// The AWS VPC CIDR blocks or subsets. This must be from the supported CIDR blocks and must not overlap with your Confluent Cloud CIDR block or any other network peering connection VPC CIDR (learn more about the requirements [here](https://docs.confluent.io/cloud/current/networking/peering/aws-peering.html#vpc-peering-on-aws)). You can find AWS VPC CIDR [here](https://console.aws.amazon.com/vpc/) under **Your VPCs &gt; Target VPC &gt; Details** section of the AWS Management Console.
        /// </summary>
        public InputList<string> Routes
        {
            get => _routes ?? (_routes = new InputList<string>());
            set => _routes = value;
        }

        /// <summary>
        /// The AWS VPC ID of the peer VPC that you're peering with Confluent Cloud. You can find your AWS VPC ID [here](https://console.aws.amazon.com/vpc/) under **Your VPCs** section of the AWS Management Console. Must start with `vpc-`.
        /// </summary>
        [Input("vpc", required: true)]
        public Input<string> Vpc { get; set; } = null!;

        public PeeringAwsGetArgs()
        {
        }
        public static new PeeringAwsGetArgs Empty => new PeeringAwsGetArgs();
    }
}
