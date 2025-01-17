// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Inputs
{

    public sealed class GetNetworkGcpArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// (Required String) The GCP project.
        /// </summary>
        [Input("project", required: true)]
        public string Project { get; set; } = null!;

        /// <summary>
        /// (Required String) The GCP VPC network name.
        /// </summary>
        [Input("vpcNetwork", required: true)]
        public string VpcNetwork { get; set; } = null!;

        public GetNetworkGcpArgs()
        {
        }
        public static new GetNetworkGcpArgs Empty => new GetNetworkGcpArgs();
    }
}
