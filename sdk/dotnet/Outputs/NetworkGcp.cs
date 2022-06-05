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
    public sealed class NetworkGcp
    {
        /// <summary>
        /// (Required String) The GCP project.
        /// </summary>
        public readonly string? Project;
        /// <summary>
        /// (Required String) The GCP VPC network name.
        /// </summary>
        public readonly string? VpcNetwork;

        [OutputConstructor]
        private NetworkGcp(
            string? project,

            string? vpcNetwork)
        {
            Project = project;
            VpcNetwork = vpcNetwork;
        }
    }
}
