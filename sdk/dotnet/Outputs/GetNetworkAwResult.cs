// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Outputs
{

    [OutputType]
    public sealed class GetNetworkAwResult
    {
        /// <summary>
        /// (Optional String) The AWS VPC endpoint service for the network (used for Private Link) if available.
        /// </summary>
        public readonly string PrivateLinkEndpointService;
        /// <summary>
        /// (Required String) The AWS VPC ID for the network.
        /// </summary>
        public readonly string Vpc;

        [OutputConstructor]
        private GetNetworkAwResult(
            string privateLinkEndpointService,

            string vpc)
        {
            PrivateLinkEndpointService = privateLinkEndpointService;
            Vpc = vpc;
        }
    }
}
